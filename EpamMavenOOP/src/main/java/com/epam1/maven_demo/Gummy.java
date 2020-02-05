package com.epam1.maven_demo;

public class Gummy extends Candy implements Flavor{
	private Integer wt=5;
	public String FlavorType(){
		return "Fruity";
	}
	public Integer getWt(){
		return wt;
	}
	public String CandyType(){
		return "Gummy";}
}