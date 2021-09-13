package com.htc.compositmanagementsystem.entity;


public class Diseases {
	
	private int diseaseId;
	
	private String DiseaseName;

	public Diseases() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Diseases(int diseaseId, String diseaseName) {
		super();
		this.diseaseId = diseaseId;
		DiseaseName = diseaseName;
	}

	public int getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(int diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getDiseaseName() {
		return DiseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		DiseaseName = diseaseName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diseaseId;
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
		Diseases other = (Diseases) obj;
		if (diseaseId != other.diseaseId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Diseases [diseaseId=" + diseaseId + ", DiseaseName=" + DiseaseName + "]";
	}

	
}
