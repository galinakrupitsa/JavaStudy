package org.example.list2;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ListController {

    public  List<String> list = List.of("Apple", "Banana", "Cherry", "Grape", "Pineapple");
    @GetMapping("/element/{id}")

    public String getElementById(@PathVariable int id) {
        if (id < 0 || id >= list.size()) {
            System.out.println("Элемент с id " + id + " не входит в список");
            return "Элемент не найден";
        }

        String element = list.get(id);
        System.out.println("Найден элемент: " + element); // Вывод в консоль
        return "Элемент: " + element;
    }
}


