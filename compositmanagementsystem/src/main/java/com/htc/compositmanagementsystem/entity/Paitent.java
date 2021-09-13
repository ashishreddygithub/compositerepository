package com.htc.compositmanagementsystem.entity;

import java.io.Serializable;
import java.util.List;




public class Paitent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3546390379838710166L;
	
	private long patientId;
	private String patientName;
	private long appointmentId;
	private String healthIssue;
	
	private List<Diseases> diseases;
	public Paitent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paitent(long patientId, String patientName, long appointmentId, String healthIssue,
			List<Diseases> diseases) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointmentId = appointmentId;
		this.healthIssue = healthIssue;
		this.diseases = diseases;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getHealthIssue() {
		return healthIssue;
	}
	public void setHealthIssue(String healthIssue) {
		this.healthIssue = healthIssue;
	}
	public List<Diseases> getDiseases() {
		return diseases;
	}
	public void setDiseases(List<Diseases> diseases) {
		this.diseases = diseases;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Paitent [patientId=" + patientId + ", patientName=" + patientName + ", appointmentId=" + appointmentId
				+ ", healthIssue=" + healthIssue + ", diseases=" + diseases + "]";
	}
	
	
	
	

}
