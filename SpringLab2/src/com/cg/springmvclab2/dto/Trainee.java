package com.cg.springmvclab2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee")
public class Trainee {
	@Id@Column(name="trainee_id")
	private Integer traineeId;
    @Column(name="trainee_name",length=20)
    private String traineeName;
    @Column(name="trainee_location",length=20)
    private String traineeLocation;
    @Column(name="trainee_domain",length=20)
    private String traineeDomain;
	
    public Trainee(Integer traineeId, String traineeName, String traineeLocation, String traineeDomain) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeLocation = traineeLocation;
		this.traineeDomain = traineeDomain;
	}

	public Trainee() {
		super();
	}

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeLocation="
				+ traineeLocation + ", traineeDomain=" + traineeDomain + "]";
	}
    
    
    
}


