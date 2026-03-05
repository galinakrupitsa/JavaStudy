public class ItalianRestorantFactory implements RestoranFactory {
    @Override
    public MainCourse createCourse() {
        return new Pizza();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
