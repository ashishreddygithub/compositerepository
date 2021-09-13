package com.htc.compositmanagementsystem.entity;

import java.io.Serializable;

public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7886283983058483798L;
	
	private long doctorId;
	private String doctorName;
	private String Specilization;
	private int experince;
	private double phoneNumber;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(long doctorId, String doctorName, String specilization, int experince, double phoneNumber) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		Specilization = specilization;
		this.experince = experince;
		this.phoneNumber = phoneNumber;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (doctorId ^ (doctorId >>> 32));
		long temp;
		temp = Double.doubleToLongBits(phoneNumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Doctor other = (Doctor) obj;
		if (doctorId != other.doctorId)
			return false;
		if (Double.doubleToLongBits(phoneNumber) != Double.doubleToLongBits(other.phoneNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", Specilization=" + Specilization
				+ ", experince=" + experince + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
