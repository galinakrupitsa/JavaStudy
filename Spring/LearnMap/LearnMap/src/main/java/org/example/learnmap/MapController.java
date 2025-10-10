package org.example.learnmap;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/haskey")
public class MapController {
    final MapService mapService;
    public MapController(MapService mapService) {
        this.mapService = mapService;
    }
    @PostMapping
    public String hasKey(@RequestBody MapDTO mapDTO) {
        return ("Ключ " + mapService.contain(mapDTO) + " найден");

    };
}

