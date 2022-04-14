package fr.isika.cda14.efund.managedbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.isika.cda14.efund.entity.project.Project;
import fr.isika.cda14.efund.services.ProjectService;

@ManagedBean
public class ProjectsListBean {

	@Inject
	private ProjectService projectCreationService;

	private List<Project> projectsList;

	@PostConstruct
	private void init() {
		projectsList = getAllProjects();
	}

	private List<Project> getAllProjects() {
		return this.projectCreationService.findAll();
	}
	
	public List<Project> getProjectList(){
		return projectsList;
	}
	
	
}