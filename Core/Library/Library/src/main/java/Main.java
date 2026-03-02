import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // добавим книги
        library.addBook(new Book("Java"));
        library.addBook(new Book("Spring"));
        library.addBook(new Book("NutCracker"));


        // добавим пользователей
        library.addUser(new User("Alex"));
        library.addUser(new User("Maria"));
        library.addUser(new User("Eva"));

        while (true) {

            System.out.println("\nВведите название книги:");
            String title = scanner.nextLine();

            System.out.println("Введите действие (взять/вернуть):");
            String action = scanner.nextLine();

            System.out.println("Введите имя пользователя:");
            String userName = scanner.nextLine();

            if (action.equalsIgnoreCase("взять")) {
                library.borrowBook(title, userName);
            } else if (action.equalsIgnoreCase("вернуть")) {
                library.returnBook(title, userName);
            } else {
                System.out.println("Неизвестное действие.");
            }
        }




    }

}