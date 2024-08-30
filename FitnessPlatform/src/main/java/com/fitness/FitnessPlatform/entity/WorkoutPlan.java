package com.fitness.FitnessPlatform.entity;

import jakarta.persistence.*;

@Entity
public class WorkoutPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String planName;
	private String description;

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public WorkoutPlan(Long id, String planName, String description) {
		super();
		this.id = id;
		this.planName = planName;
		this.description = description;
	}

	public WorkoutPlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WorkoutPlan [id=" + id + ", planName=" + planName + ", description=" + description + "]";
	}
	
}
