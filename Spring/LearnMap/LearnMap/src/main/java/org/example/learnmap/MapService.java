package org.example.learnmap;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MapService {

    private final Map<String, String> map = new HashMap<>();

    public MapService() {
        map.put("Иван","Петрович");
        map.put("Дмитрий", "Ильич");
        map.put("Петр","Петрович");
    }

    public String contain(MapDTO mapDTO) {
        String key = mapDTO.getKey();
        if (map.containsKey(key)) {
            System.out.println("Ключ " + map.get(key));
        } else {
            System.out.println("Ключ " + map.get(key) + " не найден");
        }
        return map.get(key);
    }

}
