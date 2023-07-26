package com.student.manage;
import java.util.*;
public class student {
	private String studentname;
	private int studentid;
	private String studentphone;
	private String studentcity;
	public student(String studentname, int studentid, String studentphone, String studentcity) {
		super();
		this.studentname = studentname;
		this.studentid = studentid;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	public student(String studentname, String studentphone, String studentcity) {
		super();
		this.studentname = studentname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(String studentphone) {
		this.studentphone = studentphone;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	@Override
	public String toString() {
		return "student [studentname=" + studentname + ", studentid=" + studentid + ", studentphone=" + studentphone
				+ ", studentcity=" + studentcity + "]";
	}
	

}
