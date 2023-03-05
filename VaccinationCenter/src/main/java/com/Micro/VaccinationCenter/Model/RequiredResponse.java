package com.Micro.VaccinationCenter.Model;

import java.util.List;

import com.Micro.VaccinationCenter.Entity.VaccinationCenter;

public class RequiredResponse {
	
	private VaccinationCenter center;
	private List<Citizen> citizens;
	
	public VaccinationCenter getCenter() {
		return center;
	}
	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}
	public List<Citizen> getCitizens() {
		return citizens;
	}
	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}
	public RequiredResponse(VaccinationCenter center, List<Citizen> citizens) {
		super();
		this.center = center;
		this.citizens = citizens;
	}
	public RequiredResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RequiredResponse [center=" + center + ", citizens=" + citizens + "]";
	}
	
	

}
