package com.fitness.FitnessPlatform.entity;

import jakarta.persistence.*;

@Entity
public class NutritionPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String mealName;
	private String nutritionDetails;

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public String getNutritionDetails() {
		return nutritionDetails;
	}

	public void setNutritionDetails(String nutritionDetails) {
		this.nutritionDetails = nutritionDetails;
	}

	public NutritionPlan(Long id, String mealName, String nutritionDetails) {
		super();
		this.id = id;
		this.mealName = mealName;
		this.nutritionDetails = nutritionDetails;
	}

	public NutritionPlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NutritionPlan [id=" + id + ", mealName=" + mealName + ", nutritionDetails=" + nutritionDetails + "]";
	}
	
}
