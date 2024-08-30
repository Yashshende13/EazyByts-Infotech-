package com.fitness.FitnessPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessPlatform.entity.NutritionPlan;

@Repository
public interface NutritionPlanRepository extends JpaRepository<NutritionPlan, Long> {
}
