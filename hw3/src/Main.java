public class Main {
    public static void main(String[] args) {

        Car car = new Car(1, "VIN3021AS43", 1700, "Красный", 4, 5, 15,
                2, "Передний", "АКПП", true,"Седан");
        System.out.println(car);

        Bus bus = new Bus(2, "VIN3021AS43", 5400, "Желтый", 10, 54, 24,
                3, "Задний", "МКПП", true);
        System.out.println(bus);
    }
}
