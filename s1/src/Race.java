import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {
    private int startPoint;
    private int endPoint;
    private int length;
    private int time;
    private boolean raceStatus;

    public Race(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.length = endPoint - startPoint;
        this.time = 0;
        this.raceStatus = false;
    }

    public void start(List<Car> carList) {
        if (!isRaceStatus()) {
            // Включаем зажигание автомобилей
            for (Car car: carList) car.setEngineOn();

            // Начинаем гонку
            this.raceStatus = true;
            System.out.println("Гонка началась!");

            int place = 1;
            int raceTime = 0;
            int maxPlace = carList.size();

            // Ключ - модель , Значение - расстояние пройденное
            Map<String, Integer> distance = new HashMap<>();
            for (Car car: carList) distance.put(car.getModel(), 0);

            // Процесс гонки
            while (place <= maxPlace) {
                raceTime++;
                setTime(raceTime);

                for (Car car: carList){
                    // Увеличиваем показатель пройденного расстояния автомобилем
                    int temp = distance.get(car.getModel()) + (int) (Math.random() * car.getMaxSpeed()) / 60;
                    distance.put(car.getModel(), temp);

                    // Проверка если доехал
                    if (distance.get(car.getModel()) > this.length) {
                        System.out.println("Автомобиль " + car.getModel() + " пришел " + place +
                                " за " + getTime() / 60 + " часов");

                        // Хз что с этим костылем делать, если не убрать то он 3 раза подряд побеждает,
                        // если убрать машину из листа то ошибка
                        distance.put(car.getModel(),-1000000);

                        // Выключаем зажигание автомобиля
                        car.setEngineOff();

                        place++;
                    }
                }

                if (raceTime != 0 && raceTime % 60 == 0){
                    System.out.println("Прошло " + getTime() / 60 + " часов");
                }
            }

            // Заканчиваем гонку
            stop();
        } else {
            System.out.println("Гонка уже идёт!");
        }
    }

    public void stop() {
        if (isRaceStatus()) {
            this.raceStatus = false;
            System.out.println("Гонка окончена!");
        } else {
            System.out.println("Гонка не проводится.");
        }
    }

    public String getInfo(){
        String result = "";
        if (this.raceStatus) result = "Гонка идёт";
        else result = "Гонки не проводятся";
        return result;
    }

    @Override
    public String toString() {
        return this.getInfo();
    }

    public boolean isRaceStatus() {
        return raceStatus;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
