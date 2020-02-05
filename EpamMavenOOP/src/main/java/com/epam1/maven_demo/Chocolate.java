package com.epam1.maven_demo;

abstract public class Chocolate extends Gift implements Comparable< Chocolate > {
	public Integer wt;
	abstract public String FlavorType();
	public void setWt(int a) {
		wt=a;
	}
	public Integer getWt() {
		return wt;
	}
	public String type(){
		return "Choco";
	}
	public int compareTo(Chocolate o) {
        return this.getWt().compareTo(o.getWt());
    }
}