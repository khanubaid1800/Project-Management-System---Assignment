package com.Assignment.Project_Management_System.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Project_Entity {
	@Id
	@NotNull(message = "id shouldn't be null")
	private Long id;
	@NotBlank(message = "name shouldn't be null")
	private String name;
	@NotBlank(message = "description shouldn't be null")
	private String description;
	@NotBlank(message = "startDate shouldn't be null")
	private String startDate;
	@NotBlank(message = "endDate shouldn't be null")
	private String endDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	

}
