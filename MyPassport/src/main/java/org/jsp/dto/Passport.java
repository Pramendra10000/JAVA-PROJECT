package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
	private long Psno;
	private String color;
	private String Nationality;
	private String Gender;
	private String POI; // place of issue
	private String DOI;  // date of issue
	
	
	public long getPsno() {
		return Psno;
	}
	public void setPsno(long psno) {
		Psno = psno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPOI() {
		return POI;
	}
	
	public void setPOI(String pOI) {
		POI = pOI;
	}
	public String getDOI() {
		return DOI;
	}
	public void setDOI(String dOI) {
		DOI = dOI;
	}
	
	@Override
	public String toString() {
		return "Passport [Psno=" + Psno + ", color=" + color + ", Nationality=" + Nationality + ", Gender=" + Gender
				+ ", POI=" + POI + ", DOI=" + DOI + "]";
	}
	
	
}
