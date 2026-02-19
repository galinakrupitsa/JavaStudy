import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Library {
    private List<Book> books;
    private List<User> users;
    public Library(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

}
