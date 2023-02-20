public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    private String getInfo(){
        return String.format("Название: %s, Цена: %d", name ,price);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
