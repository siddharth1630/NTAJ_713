package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.ProjectDAO;
import com.nt.dto.ProjectDTO;
import com.nt.entity.Project;

@Service("projService")
@Transactional(transactionManager = "hbTxMgmr")
public class ProjectMgmntServiceImpl implements ProjectMgmntService {

	@Autowired
	private ProjectDAO dao;
	
	@Override
	public String registerProject(ProjectDTO dto) {
		
		Project entity=null;
		Integer idVal=0;
		//convert DTO to bo/entity
		entity=new Project();
		BeanUtils.copyProperties(dto, entity);
		idVal=dao.insert(entity);
		return "Project is registered with id "+idVal;
	}

	@Override
	public Object fetchProjectById(int id) {
		Project proj=null;
		ProjectDTO dto=null;
		proj=dao.getProjectByID(id);
		// convert entity to dto class
		if(proj!=null) {
			dto=new ProjectDTO();
			BeanUtils.copyProperties(proj, dto);
		}
		
		return dto!=null?dto:"project id not available";
	}

	@Override
	public String updateProjectById(int id, int teamSize, double cost) {
		boolean flag=false;
		flag=dao.updateProjectById(id, teamSize, cost);
		return flag==false?"id is not available":"succeffulay updated";
	}

	@Override
	public String removeProjectById(int id) {
		boolean flag=false;
		flag=dao.deleteProjectById(id);
		return flag==false?"id is not available":"succeffulay deleted";
	}

	@Override
	public List<ProjectDTO> fetchProjectByCostRange(double start, double end) {
		List<Project> listProject=null;
		List<ProjectDTO> listDto=new ArrayList<ProjectDTO>();
		
		listProject=dao.getProjectByCostRange(start, end);
		// convert listentites into list dao
		listProject.forEach(entity->{
			ProjectDTO dto=new ProjectDTO();
			BeanUtils.copyProperties(entity, dto);
			listDto.add(dto);
		});
		return listDto;
	}
}
