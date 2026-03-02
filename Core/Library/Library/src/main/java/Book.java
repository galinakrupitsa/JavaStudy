

public class Book {
    private String title;
    private boolean isAvailable = true;

    public Book(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }


    public void borrow() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Название: " + title + ", Доступна " + isAvailable;
    }
}
