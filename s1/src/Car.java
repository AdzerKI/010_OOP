public class Car {
    private final String model;
    private final int year;
    private double price;
    private String color;
    private final int power;
    private final int maxSpeed;
    private boolean engineStatus;

    public Car(String model, int year, double price, String color, int power, int maxSpeed){
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.engineStatus = false;
    }

    public void road (int destination) {
        if (this.isEngineStatus()) {
            System.out.println("Автомобиль едет " + destination + " км.");
        } else {
            System.out.println("Автомобиль не заведен");
        }
    }

    public void setEngineOn() {
        if (!this.engineStatus) {
            System.out.println("Зажигание " + model + " включено");
            this.engineStatus = true;
        }
    }

    public void setEngineOff() {
        if (this.engineStatus) {
            System.out.println("Зажигание " + model + " выключено");
            this.engineStatus = false;
        }
    }

    public String getInfo(){
        return String.format("Модель: %s, Год выпуска: %d, Цена: %.2f, Цвет: %s, Лошадиных сил: %s",
                model,year,price,color,power);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }
}

