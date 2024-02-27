package com.Assignment.Project_Management_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment.Project_Management_System.Model.Project_Entity;
import com.Assignment.Project_Management_System.Service.project_service;

import jakarta.validation.Valid;

@RestController
@Validated
public class project_controller {
	@Autowired
	project_service serv;

	@PostMapping("/save")
	public ResponseEntity<String> saveProject(@Valid @RequestBody Project_Entity project)
	{
		 serv.saveProject(project);
		 return ResponseEntity.ok("project created successfully");
	}
	@GetMapping("/findAll")
	public List<Project_Entity> findAll()
	{
		return serv.findAll();
	}
	@GetMapping("/findbyID/{id}")
	public ResponseEntity<Project_Entity> findbyID(@PathVariable Long id) {
        Project_Entity project = serv.findbyID(id);
        return ResponseEntity.ok().body(project);
    }
	@PutMapping("/update/{id}")
	public ResponseEntity<Project_Entity> updateProject(@Valid @RequestBody Project_Entity project, @PathVariable Long id) {
        Project_Entity updatedProject = serv.updateProject(project, id);
        return ResponseEntity.ok().body(updatedProject);
    }
	@DeleteMapping("/deletebyID/{id}")
	public ResponseEntity<String> deletebyID(@PathVariable Long id) {
        serv.deletebyID(id);
        return ResponseEntity.ok("Successfully Deleted");
    }
}
