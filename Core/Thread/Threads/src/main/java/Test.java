import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args)  {
        final User user = new User("Tony", "mail@gmail.com");
        System.out.println(user.getName());
        System.out.println(user.getMail()
                .map((m) -> m.toUpperCase())
                .orElseGet(() ->{
                String s="yoyo";
                return s + "dfdsfdfsdfsfdf";
        }
        ));
    }
}
 class User{
    private String name;
    private String mail;

    public User(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }
    public String getName() {
        return name;
    }
    public Optional<String> getMail() {
        return Optional.ofNullable(mail);
    }

}
