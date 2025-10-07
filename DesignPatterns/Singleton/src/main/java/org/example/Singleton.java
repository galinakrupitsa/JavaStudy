package org.example;

public class Singleton {

    private static Singleton instance;
    private Singleton() {
        System.out.println("Экземпляр создан!");
    }

    public static Singleton getInstance() {
        if (instance == null) {           // если объекта ещё нет
            instance = new Singleton();   // создаём его
        }
        return instance;                  // возвращаем
    }

    // 4. Любые методы, которые нужны в классе
    public void showMessage() {
        System.out.println("Привет из Singleton!");
    }
}

