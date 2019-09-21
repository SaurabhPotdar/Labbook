package com.cg.demojpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jpa_project")
public class Project {

	@Id
	@Column(name="project_id")
	private int projectId;
	@Column(name="project_name")
	private String projectName;
	@Column(name="project_cost")
	private double projectCost;
	
	public Project(int projectId, String projectName, double projectCost) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCost = projectCost;
	}

	public Project() {
		super();
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName="
				+ projectName + ", projectCost=" + projectCost + "]";
	}
	
	
	
}
