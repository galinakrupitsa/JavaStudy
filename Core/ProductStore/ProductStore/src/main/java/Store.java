import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();
    private void addProduct(Product product){
        products.add(product);
    }
    public Product findProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
        }

        public void showAllProducts() {
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }


