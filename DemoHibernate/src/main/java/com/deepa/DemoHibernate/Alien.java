package com.deepa.DemoHibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity(name= "alien_tbl")
public class Alien  {
@Id
	private int aid;

public Alien() {
	super();
}

@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
}

private AlienName aname;
@Column(name="alien_color")
private String color;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}

public AlienName getAname() {
	return aname;
}

public void setAname(AlienName aname) {
	this.aname = aname;
}

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
}
