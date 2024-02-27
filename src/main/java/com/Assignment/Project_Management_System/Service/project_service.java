package com.Assignment.Project_Management_System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.Project_Management_System.Model.Project_Entity;
import com.Assignment.Project_Management_System.Repository.project_repository;

@Service
public class project_service {
	@Autowired
	project_repository repo;
	
	public void saveProject(Project_Entity project)
	{
		 repo.save(project);
	}
	public List<Project_Entity> findAll()
	{
		return repo.findAll();
	}
	public Project_Entity findbyID(Long id)
	{
		return repo.findById(id).get();
	}
	public Project_Entity updateProject(Project_Entity project,Long id)
	{
		Project_Entity pro = repo.findById(id).get();
		if(pro.getName() != null)
		{
			pro.setName(project.getName());
		}
		if(pro.getDescription() != null)
		{
			pro.setDescription(project.getDescription());
		}
		if(pro.getStartDate() != null)
		{
			pro.setStartDate(project.getStartDate());
		}
		if(pro.getEndDate() != null)
		{
			pro.setEndDate(project.getEndDate());
		}
		return repo.save(pro);
	}
	public void deletebyID(Long id)
	{
		repo.deleteById(id);
	}

}
