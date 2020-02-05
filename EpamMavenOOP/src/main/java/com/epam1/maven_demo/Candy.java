package com.epam1.maven_demo;

abstract public class Candy extends Gift{
	public Integer wt;
	abstract public String CandyType();
	public void setWt(int a) {
		wt=a;
	}
	public Integer getWt() {
		return wt;
	}
	public String type(){
		return "Candy";
	}
}