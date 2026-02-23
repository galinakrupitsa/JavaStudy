import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
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

        public Product sellProduct(String name, int quantity){
        Product product = findProduct(name);
        if(product == null){
            System.out.println("Product not found");
            return null;
        }
            product.sell(quantity);
            return product;
        }

        public Product reStockProduct(String name, int quantity){
        Product product = findProduct(name);
        if(product == null){
            System.out.println("Product not found");
        }
        product.restock(quantity);
        return product;

        }

        public void showAllProducts() {
            for (Product p : products) {
                System.out.println(p);
            }
        }
}


