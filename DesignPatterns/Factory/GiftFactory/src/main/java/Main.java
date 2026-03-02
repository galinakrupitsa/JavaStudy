public class Main {
    public static void main(String[] args) {
        Gift gift1 = new GiftFactory().createGift(15) ;
        Gift gift2 = new GiftFactory().createGift(25) ;
        System.out.println(gift1.getName());
        System.out.println(gift2.getName());
    }
}
