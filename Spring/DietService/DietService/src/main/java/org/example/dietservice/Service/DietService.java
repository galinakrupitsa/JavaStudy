package org.example.dietservice.Service;

import org.example.dietservice.Model.Calories;
import org.example.dietservice.Repository.DietRepository;
import org.springframework.stereotype.Service;

@Service
public class DietService {
    public final DietRepository dietRepo;
    public DietService(DietRepository dietRepo) {
        this.dietRepo = dietRepo;
    }
    public Calories saveKcal(Calories cal){
        return dietRepo.save(cal);
    }
}
