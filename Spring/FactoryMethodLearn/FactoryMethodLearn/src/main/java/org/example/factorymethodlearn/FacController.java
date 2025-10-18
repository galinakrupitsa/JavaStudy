package org.example.factorymethodlearn;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit")
public class FacController {
    final FacService facService;
    public FacController(FacService facService) {
        this.facService = facService;
    }

    @PostMapping("/calculate")
   public int calculate(@RequestBody DTO dto){
        return facService.sayHello(dto);
    }
}
