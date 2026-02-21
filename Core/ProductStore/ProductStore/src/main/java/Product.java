public class Product {
    public String name;
    public double price;
    public int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }

    public void sell(int quantity){
        if(this.quantity < quantity){
            System.out.println("Sold out of stock");
        }
        else {quantity--;
            System.out.println("Продано " + quantity + " шт.");}
    }
    public void restock(int quantity)
    {
        quantity++;
        System.out.println("Добавлено " + quantity + " шт.");}

    @Override
    public String toString(){
        return "Товар: " + name +
                ", цена: " + price +
                ", количество: " + quantity;
    }
}

