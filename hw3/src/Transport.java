public class Transport {
    private final int id;
    // Номер кузова
    private final String vin;
    // Вес, в кг
    private int weight;
    // Пробег, в км
    private int mileage;
    // Цвет
    private String color;
    // Тип топлива, номерной знак, количество дверей, вместимость багажника и т.д.

    public Transport(int id, String vin, int weight, int mileage, String color) {
        this.id = id;
        this.vin = vin;
        this.weight = weight;
        this.mileage = mileage;
        this.color = color;
    }

    // Транспорт без пробега
    public Transport(int id, String vin, int weight, String color) {
        this.id = id;
        this.vin = vin;
        this.weight = weight;
        this.mileage = 0;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Транспортное средство №" + id +
                ", Номер кузова: " + vin +
                ", Вес: " + weight +
                " кг., Пробег:" + mileage +
                " км., Цвет: " + color;
    }
}
