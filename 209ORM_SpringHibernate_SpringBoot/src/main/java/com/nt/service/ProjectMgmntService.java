package com.nt.service;

import java.util.List;

import com.nt.dto.ProjectDTO;

public interface ProjectMgmntService {
	public String registerProject(ProjectDTO dto);
	public Object fetchProjectById(int id);
	public String updateProjectById(int id,int teamSize,double cost);
	public String removeProjectById(int id);
	
	public List<ProjectDTO> fetchProjectByCostRange(double start,double end);
	
}
