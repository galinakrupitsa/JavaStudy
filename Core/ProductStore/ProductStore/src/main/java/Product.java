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

    public void sell(int amount){
        if(this.quantity < amount){
            System.out.println("Sold out of stock");
        }
        else {
            quantity= quantity -amount;
            System.out.println("Продано " + amount + " шт.");}
    }
    public void restock(int amount)
    {
        quantity = quantity + amount;
        System.out.println("Добавлено " + amount + " шт.");}

    @Override
    public String toString(){
        return "Товар: " + name +
                ", цена: " + price +
                ", количество: " + quantity;
    }
}

