package org.example;

import java.util.Scanner;

public class Main {
    public static Logistics logistics;
    private static void configLogistic(String command){
        switch (command){
            case "truck": logistics = new RoadLogistics();
            break;
            case "ship": logistics = new SeaLogistics();
            break;
        }
    }
    public static void doLogistics() {
        logistics.doLogistics();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        configLogistic (command);
        doLogistics();

    }

}