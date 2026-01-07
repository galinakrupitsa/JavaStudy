public class Factory {
    public static Machine createMachine(int peopleCount) {
        if (peopleCount <= 4) {
            return new Car();
        } else
            return new Bus();

    }
}
