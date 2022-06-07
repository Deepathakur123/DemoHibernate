package com.deepa.DemoHibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class AlienName {
private String fname;
private String mname;
@Override
public String toString() {
	return "AlienName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
private String lname;
}
