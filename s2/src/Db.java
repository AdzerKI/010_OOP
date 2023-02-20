import java.util.Random;

public class Db {
    public static VendingMachine init(int min, int max, int capacity, int quantity){
        VendingMachine vm = new VendingMachine(capacity);

        Random r = new Random();
        for (int i = 0; i < quantity; i++) {
            int randomValue = r.nextInt(min,max);
            vm.add("Product"+i, randomValue);
        }

        return vm;
    }
}
