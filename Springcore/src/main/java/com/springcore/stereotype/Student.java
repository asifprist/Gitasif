package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("asif")
	private String studentNAme;
	@Value("patna")
	private String city;
	@Value("#{temp}")
	private List<String> address;
	
	
	
	public String getStudentNAme() {
		return studentNAme;
	}
	public void setStudentNAme(String studentNAme) {
		this.studentNAme = studentNAme;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentNAme=" + studentNAme + ", city=" + city + "]";
	}
	
	
	
	
	

}
