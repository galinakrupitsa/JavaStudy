package org.example.dietservice.Controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.dietservice.Model.Calories;
import org.example.dietservice.Service.DietService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
@RequestMapping("/api/v1")
public class DietController {
    public final DietService dietService;
    public DietController(DietService dietService) {
        this.dietService = dietService;
    }
    @GetMapping("/something/{kcal}")
    public String something(@PathVariable Integer kcal){
        Calories calories = new Calories(kcal);
        dietService.saveKcal(calories);
        return "ok";
    }
}
