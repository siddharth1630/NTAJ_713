package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.entity.Project;

@Repository("projDao")
public class ProjectDAOImpl implements ProjectDAO {
	private static final String HQL_GET_PROJECT_BY_COST_RANGE="FROM Project WHERE cost>:min AND cost<:max";
	
	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer insert(Project entity) {
		return (Integer) template.save(entity);
	}

	@Override
	public Project getProjectByID(int id) {
		Project proj=null;
		proj=template.get(Project.class, id);
		return proj;
	}

	@Override
	public boolean updateProjectById(int id,int teamSize,double cost) {
		Project proj=null;
		boolean flag=false;
		proj=template.get(Project.class, id);
		if(proj!=null) {
			proj.setTeamSize(teamSize);
			proj.setCost(cost);
			flag=true;
			template.update(proj);
		}
		
		return flag;
	}

	@Override
	public boolean deleteProjectById(int id) {
		Project proj=null;
		boolean flag=false;
		proj=template.get(Project.class, id);
		if(proj!=null) {
			flag=true;
			template.delete(proj);
		}
		
		return flag;
	}

	@Override
	public List<Project> getProjectByCostRange(double start, double end) {
		List<Project> list=null;
		list=(List<Project>) template.findByNamedParam(HQL_GET_PROJECT_BY_COST_RANGE,new String[] {"min","max"},
									new Object[] {start,end});
		
		return list;
	}
}
