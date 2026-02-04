package org.example.dietservice.Repository;

import org.example.dietservice.Model.Calories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietRepository extends JpaRepository <Calories, Long> {

}
