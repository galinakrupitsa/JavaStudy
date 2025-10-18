package org.example;

public class Track implements Transport {
    @Override
    public void deliver() {
        System.out.println("Грузовик поехал");
    }
}
