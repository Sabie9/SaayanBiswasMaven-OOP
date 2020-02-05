package com.epam1.maven_demo;

public class Lollipop extends Candy implements Flavor{
	private Integer wt=6;
	public String FlavorType(){
		return "Sweet & Sour";
	}
	public Integer getWt(){
		return wt;
	}
	public String CandyType(){
		return "Lollipop";}
}
