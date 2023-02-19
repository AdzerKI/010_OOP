import java.util.ArrayList;
import java.util.List;

public class dbCars {
    public static List<Car> init(){
        List<Car> carList = new ArrayList<>();

        // Список участников
        carList.add(new Car("Лада Веста", 2021, 1_550_000.00, "Серый", 170, 150));
        carList.add(new Car("Toyota", 2015, 3_200_000.00, "Белый", 230, 210));
        carList.add(new Car("BMW x6", 2019, 6_320_000.00, "Желтый", 500, 250));

        return carList;
    }
}
