public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Яблоко", 20));
        vm.addProduct(new Product("Груша", 30));
        vm.addProduct(new Drink("Lipton", 40, 0.5, Types_Drink.COLDTEA));
        vm.addProduct(new Chocolate("Аленка", 40, 50));
        vm.addProduct(new Drink("Вишневый сок", 30, Types_Drink.JUICE));
        vm.addProduct(new Drink("Fпельсиновый сок", 30, Types_Drink.JUICE));
        vm.addProduct(new Drink("Lipton", 40, Types_Drink.COLDTEA));
        vm.addProduct(new Drink("Меркурий", 20, Types_Drink.MINERALWATER));
        vm.addProduct(new Drink("Добрый кола", 50, Types_Drink.SODA));
        vm.addProduct(new Drink("Родники России", 20, Types_Drink.WATER));
        vm.addProduct(new Drink("Горячее Молоко", 45, Types_Drink.MILK));
        vm.addProduct(new Product("Snickers", 40, Types_Drink.COLDTEA));
        System.out.println(vm);

    }
}