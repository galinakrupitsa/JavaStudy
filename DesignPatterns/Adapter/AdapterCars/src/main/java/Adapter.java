public class Adapter implements ModernCar {
    Gentra gentra;
    public Adapter(Gentra gentra) {
        this.gentra = gentra;
    }
    @Override
    public void start() {
        gentra.startTurnKey();
    }

    @Override
    public void stop() {
        gentra.stopTurnKey();
    }


}
