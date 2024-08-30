package com.fitness.FitnessPlatform.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fitness.FitnessPlatform.entity.WorkoutPlan;
import com.fitness.FitnessPlatform.repository.WorkoutPlanRepository;

@Controller
public class WorkoutPlanController {

    @Autowired
    private WorkoutPlanRepository workoutPlanRepository;

    @GetMapping("/workout-plans")
    public String listWorkoutPlans(Model model) {
        model.addAttribute("workoutPlans", workoutPlanRepository.findAll());
        return "workout-plans";
    }

    @PostMapping("/workout-plans")
    public String addWorkoutPlan(@ModelAttribute WorkoutPlan workoutPlan) {
        workoutPlanRepository.save(workoutPlan);
        return "redirect:/workout-plans";
    }
}
