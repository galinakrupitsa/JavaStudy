package org.example;

import java.util.ArrayList;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("One");
    list.add("Two");
    list.add("Three");
    list.add("Four");
    list.add("Five");
    System.out.println(list);
    System.out.println("Первое слово: " + list.get(0));
    list.remove(0);
    System.out.println("Первое слово после удаления: " + list.get(0));
    ArrayList<String> sorted = list;
    System.out.println(list);
    }
}