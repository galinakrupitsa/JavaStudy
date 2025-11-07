package org.example.aspect;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void doSomething() {
        System.out.println("Выполняется основная логика метода doSomething");
    }
}
