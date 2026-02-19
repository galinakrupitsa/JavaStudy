import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private List<Book> myBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    // Добавить книгу пользователю
    public void addBook(Book book) {
        myBooks.add(book);
    }

    // Удалить книгу у пользователя
    public void removeBook(Book book) {
        myBooks.remove(book);
    }

    // Показать книги пользователя
    public void showBorrowedBooks() {
        if (myBooks.isEmpty()) {
            System.out.println(name + " не взял ни одной книги.");
            return;
        }

        System.out.println("Книги пользователя " + name + ":");
        for (Book book : myBooks) {
            System.out.println(book);
        }
    }
}

