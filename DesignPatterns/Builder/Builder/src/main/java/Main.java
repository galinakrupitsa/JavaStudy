public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Large")
                .cheese()
                .pepperoni()
                .build();
        System.out.println(pizza);

    }

}
