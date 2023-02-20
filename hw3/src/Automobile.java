public class Automobile extends Transport{

    // Количество колес
    private int wheel;
    // Количество мест
    private int seat;
    // Диаметр шин
    private int tireDiameter;
    // Количество осей
    private int axis;
    // Тип привода (передний, задний, полный)
    private String drive;
    // Тип коробки передач (АКПП, МКПП, РКПП, ВКПП)
    private String transmission;
    //...


    public Automobile(int id, String vin, int weight, int mileage, String color, int wheel, int seat, int tireDiameter, int axis, String drive, String transmission) {
        super(id, vin, weight, mileage, color);
        this.wheel = wheel;
        this.seat = seat;
        this.tireDiameter = tireDiameter;
        this.axis = axis;
        this.drive = drive;
        this.transmission = transmission;
    }

    public Automobile(int id, String vin, int weight, String color, int wheel, int seat, int tireDiameter, int axis, String drive, String transmission) {
        super(id, vin, weight, color);
        this.wheel = wheel;
        this.seat = seat;
        this.tireDiameter = tireDiameter;
        this.axis = axis;
        this.drive = drive;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Количество колёс: " + wheel +
                ", Количество мест: " + seat +
                ", Диаметр шин: " + tireDiameter +
                " дюймов, Осей: " + axis +
                ", Привод: " + drive +
                ", Коробка передач: " + transmission;
    }
}
