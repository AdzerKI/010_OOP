import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Инициализируем БД
        List<Car> carList = dbCars.init();

        // Проводим гонки
        Race race = new Race(0, 450);
        race.start(carList);
    }
}
