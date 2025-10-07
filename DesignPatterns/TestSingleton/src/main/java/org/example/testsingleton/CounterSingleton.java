package org.example.testsingleton;

public class CounterSingleton {
    private static CounterSingleton instance;
    private CounterSingleton() {}
    public int a = 0;

    public static synchronized CounterSingleton getInstance() {
        if (instance == null) {
            instance = new CounterSingleton();
        }
        return instance;
    }


    public int next() {
        a++;
        return a;
    }
}
