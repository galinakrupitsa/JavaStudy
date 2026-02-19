import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.print("Введите автора: ");
        String author = scanner.nextLine();

        System.out.print("Введите год издания: ");
        int year = scanner.nextInt();

        Book book = new Book(title, author, year);

        System.out.println("Создана книга:");
        System.out.println(book);

        scanner.close();
    }

    }

