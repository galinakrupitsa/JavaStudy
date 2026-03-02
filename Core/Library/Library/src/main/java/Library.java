import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    public List<Book> getBooks() {
        return books;
    }
    public List<User> getUsers() {
        return users;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }
    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    private User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }
    public void borrowBook(String title, String userName) {

        Book book = findBookByTitle(title);
        User user = findUserByName(userName);

        if (book == null) {
            System.out.println("Книга не найдена.");
            return;
        }

        if (user == null) {
            System.out.println("Пользователь не найден.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Книга уже занята.");
            return;
        }

        book.borrow();
        user.addBook(book);
        System.out.println("Книга выдана.");
    }
    public void returnBook(String title, String userName) {

        Book book = findBookByTitle(title);
        User user = findUserByName(userName);

        if (book == null || user == null) {
            System.out.println("Ошибка данных.");
            return;
        }

        if (!user.hasBook(book)) {
            System.out.println("У пользователя нет этой книги.");
            return;
        }

        book.returnBook();
        user.removeBook(book);

        System.out.println("Книга возвращена.");
    }
}
