package com.htc.compositmanagementsystem.entity;

import java.util.List;

public class AggregateClass {

	private long doctorId;
	private String doctorName;
	private String Specilization;
	private int experince;
	private double phoneNumber;
	private List<Appointment> appointments;
	public AggregateClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AggregateClass(long doctorId, String doctorName, String specilization, int experince, double phoneNumber,
			List<Appointment> appointments) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		Specilization = specilization;
		this.experince = experince;
		this.phoneNumber = phoneNumber;
		this.appointments = appointments;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecilization() {
		return Specilization;
	}
	public void setSpecilization(String specilization) {
		Specilization = specilization;
	}
	public int getExperince() {
		return experince;
	}
	public void setExperince(int experince) {
		this.experince = experince;
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (doctorId ^ (doctorId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AggregateClass other = (AggregateClass) obj;
		if (doctorId != other.doctorId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AggregateClass [doctorId=" + doctorId + ", doctorName=" + doctorName + ", Specilization="
				+ Specilization + ", experince=" + experince + ", phoneNumber=" + phoneNumber + ", appointments="
				+ appointments + "]";
	}
	

	
}
