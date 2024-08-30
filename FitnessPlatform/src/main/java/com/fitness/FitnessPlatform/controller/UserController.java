package com.fitness.FitnessPlatform.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fitness.FitnessPlatform.entity.User;
import com.fitness.FitnessPlatform.repository.UserRepository;
import com.fitness.FitnessPlatform.repository.WorkoutPlanRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    private WorkoutPlanRepository workoutPlanRepository;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userRepository.save(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("user", user);
           // model.addAttribute("workoutPlans", workoutPlanRepository.findAll());
            return "dashboard";
        } else {
            return "login";
        }
    }
    
    @GetMapping("/logout")
    public String logOut() {
    	return "login";
    }
}
