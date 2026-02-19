import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Book {
    private String title;
    private String author;
    private int year;
    //    public void borrowBook(){
    //        if (isAvailable) {
    //            isAvailable = false;
    //            System.out.println("Книга взята");
    //        } else {
    //            System.out.println("Книга уже занята");
    //        }
    //    }
    //
    //    public void returnBook(){
    //            isAvailable = true;
    //            System.out.println("Книгу вернули");
    //    }
    //
    //    @Override
    //    public String toString(){
    //        return "Название книги "+ title + " Автор " + author;
    //    }
    private boolean isAvailable = true;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void borrow() {
        isAvailable = false;
    }

    public void giveBack() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Название: " + title +
                ", Автор: " + author +
                ", Год: " + year +
                ", Доступна: " + isAvailable;
    }
}
