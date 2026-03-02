package org.example;

public class Main {
    public static void main(String[] args) {
        Director director1 = Director.getInstance("11");
        Director director2 = Director.getInstance("22");
        director1.sign();
        director2.sign();

        }
    }
