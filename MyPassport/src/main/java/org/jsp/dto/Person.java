package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	private String  PAN;
	private String  loc;
	private long MOB;
	
    @OneToOne(cascade = CascadeType.ALL)
	Passport passport;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String PAN) {
		this.PAN = PAN;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public long getMOB() {
		return MOB;
	}
	
	public void setMOB(long mOB) {
		MOB = mOB;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", PAN=" + PAN + ", loc=" + loc + ", MOB=" + MOB + ", passport="
				+ passport + "]";
	}
	
	
	
}
