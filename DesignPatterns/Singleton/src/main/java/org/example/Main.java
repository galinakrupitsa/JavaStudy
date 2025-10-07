package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вернемся к нашим баранам");
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    s1.showMessage();
    System.out.println(s1 == s2);
        }
    }
