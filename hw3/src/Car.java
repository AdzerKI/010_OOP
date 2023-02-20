public class Car extends Automobile{
    // Является ли такси
    private boolean taxi;
    // Седан, Хэтчбек, Джип и т.д.
    private final String type;
    // ...


    public Car(int id, String vin, int weight, int mileage, String color, int wheel, int seat, int tireDiameter, int axis, String drive, String transmission, boolean taxi, String type) {
        super(id, vin, weight, mileage, color, wheel, seat, tireDiameter, axis, drive, transmission);
        this.taxi = taxi;
        this.type = type;
    }

    public Car(int id, String vin, int weight, String color, int wheel, int seat, int tireDiameter, int axis, String drive, String transmission, boolean taxi, String type) {
        super(id, vin, weight, color, wheel, seat, tireDiameter, axis, drive, transmission);
        this.taxi = taxi;
        this.type = type;
    }

    @Override
    public String toString() {
        String isTaxi = ((taxi) ? "Да" : "Нет");
        return super.toString() +
                ", Такси: " + isTaxi +
                ", Тип автомобиля: " + type + ".";
    }
}
