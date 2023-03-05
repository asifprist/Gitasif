package com.Micro.gate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class GateExam {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Rno;
	private String InsName;
	private String TeacherName;
	private String cource;
	private String Address;
	private long salary;
	
	
	public int getRno() {
		return Rno;
	}
	public void setRno(int rno) {
		Rno = rno;
	}
	public String getInsName() {
		return InsName;
	}
	public void setInsName(String insName) {
		InsName = insName;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "GateExam [Rno=" + Rno + ", InsName=" + InsName + ", TeacherName=" + TeacherName + ", cource=" + cource
				+ ", Address=" + Address + ", salary=" + salary + "]";
	}
	public GateExam(int rno, String insName, String teacherName, String cource, String address, long salary) {
		super();
		Rno = rno;
		InsName = insName;
		TeacherName = teacherName;
		this.cource = cource;
		Address = address;
		this.salary = salary;
	}
	public GateExam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
