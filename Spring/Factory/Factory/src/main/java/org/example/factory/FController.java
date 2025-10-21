package org.example.factory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit")
public class FController {
    final FService fService;
    public FController(FService facService) {
        this.fService = facService;
    }
    @PostMapping("/calculate")
    public double calculate(@RequestBody DTO dto){
        return fService.calculate(dto);
    }
}
