public class JapaniseRestorantFactory implements RestoranFactory {
    @Override
    public MainCourse createCourse ()
    {
        return new Sushi();
    }
    @Override
    public Dessert createDessert(){
        return new Mochi();
    }
}
