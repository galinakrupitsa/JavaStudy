import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Store store = new Store();
        store.addProduct(new Product("Milk", 12,10));
        store.addProduct(new Product("Potato", 20,10));
        store.addProduct(new Product("Avocado", 50,10));

        System.out.println("\nВведите действие (продать/пополнить/показать):");
        String action = input.nextLine();
while (true){
        if (action.equalsIgnoreCase("показать")) {
            store.showAllProducts();
            continue;
        }
    System.out.println("Введите название товара:");
    String name = input.nextLine();

    System.out.println("Введите количество:");
    int amount = Integer.parseInt(input.nextLine());

    if (action.equalsIgnoreCase("продать")) {
        store.sellProduct(name, amount);
    } else if (action.equalsIgnoreCase("пополнить")) {
        store.reStockProduct(name, amount);
    } else {
        System.out.println("Неизвестная команда.");
    }
    }

}
}
