public class Bus extends Automobile{
    // Пассажирский
    private boolean passenger;

    public Bus(int id, String vin, int weight, int mileage, String color, int wheel, int seat, int tireDiameter, int axis, String drive, String transmission, boolean passenger) {
        super(id, vin, weight, mileage, color, wheel, seat, tireDiameter, axis, drive, transmission);
        this.passenger = passenger;
    }

    public Bus(int id, String vin, int weight, String color, int wheel, int seat, int tireDiameter, int axis, String drive, String transmission, boolean passenger) {
        super(id, vin, weight, color, wheel, seat, tireDiameter, axis, drive, transmission);
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        String pass = ((this.passenger) ? "Да" : "Нет");
        return super.toString() +
                ", Пассажирский: " + pass + ".";
    }
}
