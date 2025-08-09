package org.example.streamapi.StreamDemo1;

public class Employe {
     
	String name;
	String blood;
	Long empID;
	String DOB;
	int age;
	public String getName() {
		return name;
	}
	public String getBlood() {
		return blood;
	}
	public Long getEmpID() {
		return empID;
	}
	public String getDOB() {
		return DOB;
	}
	public int getAge() {
		return age;
	}
	public Employe(String name, String blood, Long empID, String dOB, int age) {
		super();
		this.name = name;
		this.blood = blood;
		this.empID = empID;
		DOB = dOB;
		this.age = age;
	}
}
