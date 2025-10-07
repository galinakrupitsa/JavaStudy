package org.example.testsingleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/next")
    public int getNext() {
        CounterSingleton singleton = CounterSingleton.getInstance();
        return singleton.next();
    }

    @GetMapping("/anothernext")
    public int getAnotherNext() {
        CounterSingleton singleton = CounterSingleton.getInstance();
        return singleton.next();
    }
}
