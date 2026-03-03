public class RestoranService {
    public final MainCourse mainCourse;
    public final Dessert dessert;
    public RestoranService(RestoranFactory factory) {
        this.mainCourse = factory.createCourse() ;
        this.dessert = factory.createDessert();
    }
    public void makeDinner(){
        mainCourse.serve();
        dessert.serve();
    }
}
