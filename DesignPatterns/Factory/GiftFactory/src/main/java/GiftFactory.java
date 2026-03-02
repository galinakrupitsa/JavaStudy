public class GiftFactory {
    public Gift createGift(int age){
        if (age < 18)
        {
            return new KidsGift();
        }
        else  {
            return new Over18yearsGift();
        }
    }
}
