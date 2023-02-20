public class Main {
    public static void main(String[] args) {
        VendingMachine vm = Db.init(10,20, 20, 10);

        System.out.println(vm);
        vm.getProductByName("Product7");
        System.out.println(vm);
        vm.getProductByCost(10);
        System.out.println(vm);
    }
}
