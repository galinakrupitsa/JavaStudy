package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 34);
        map.put("berry", 20);
        map.put("tomato", 38);
        map.put("grape", 40);
        map.put("peach", 55);
        System.out.println(map);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ключ (название фрукта): ");
        String key = scanner.nextLine();

        if (map.containsKey(key)) {
            System.out.println("Ключ '" + key + "' найден. Значение: " + map.get(key));
        } else {
            System.out.println("Ключ '" + key + "' не найден");
        }

        }
    }
