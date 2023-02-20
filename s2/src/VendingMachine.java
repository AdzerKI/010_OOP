import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final int maxCapacity;
    private List<Product> listProduct = new ArrayList<>();

    public VendingMachine(int maxCapacity, List<Product> listProduct){
        this.maxCapacity = maxCapacity;
        this.listProduct = listProduct;
    }

    public VendingMachine(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public void add(String name, int price){
        if (this.listProduct.size() < this.maxCapacity){
            this.listProduct.add(new Product(name, price));
            System.out.println("Продукт добавлен в автомат.");
        } else {
            System.out.println("Автомат полон!");
        }
    }

    private String getInfo(){
        return this.listProduct.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public void getProductByName(String name){
        boolean giveProduct = false;
        for (Product p: this.listProduct) {
            if(p.getName().equals(name)){
                giveProduct = true;
                System.out.println("Выдача продукта...");
                listProduct.remove(p);
                System.out.println("Продукт выдан.");
                break;
            }
        }

        if (!giveProduct){
            System.out.println("Продукт не найден / закончился");
        }
    }

    public void getProductByCost(int price){
        boolean giveProduct = false;
        for (Product p: this.listProduct) {
            if(p.getPrice() == price){
                giveProduct = true;
                System.out.println("Выдача продукта...");
                listProduct.remove(p);
                System.out.println("Продукт выдан.");
                break;
            }
        }

        if (!giveProduct){
            System.out.println("Продукт не найден / закончился");
        }
    }

}
