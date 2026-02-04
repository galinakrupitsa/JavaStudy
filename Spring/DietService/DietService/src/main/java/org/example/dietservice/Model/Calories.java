package org.example.dietservice.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "calories")
public class Calories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Integer calories;
    public Calories(Integer calories){
        this.calories = calories;

    }
}

