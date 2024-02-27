package com.Assignment.Project_Management_System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Assignment.Project_Management_System.Model.Project_Entity;

public interface project_repository extends JpaRepository<Project_Entity, Long> {

}
