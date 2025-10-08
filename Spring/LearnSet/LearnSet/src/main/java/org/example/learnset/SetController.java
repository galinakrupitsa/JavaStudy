package org.example.learnset;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController

public class SetController {
    public HashSet<String> set = new HashSet<>(List.of("df","dfdf","jkj","Alex"));
    public DTO dto = new DTO();

    @GetMapping("/hascustomer")

    public String hasCustomer(@RequestBody DTO dto) {
        if(set.contains(dto.getName())) {
            return "true";
        }
            else return "false";
        }


    }



