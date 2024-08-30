package com.fitness.FitnessPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessPlatform.entity.WorkoutPlan;

@Repository
public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Long> {
}
