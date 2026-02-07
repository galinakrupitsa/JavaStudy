package org.example.dietservice.Service;

import jakarta.transaction.Transactional;
import org.example.dietservice.Model.Calories;
import org.example.dietservice.Repository.DietRepository;
import org.springframework.stereotype.Service;

@Service
public class DietService {
    public final DietRepository dietRepo;
    public DietService(DietRepository dietRepo) {
        this.dietRepo = dietRepo;
    }

    @Transactional
    public Calories saveKcal(Calories cal) {
            dietRepo.save(cal);
            throw new DietOperationException("Не удалось сохранить калорийность, попробуйте просто меньше жрать");

        }


}
