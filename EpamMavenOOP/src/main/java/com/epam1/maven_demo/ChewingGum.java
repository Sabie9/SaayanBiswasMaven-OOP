package com.epam1.maven_demo;

public class ChewingGum extends Candy implements Flavor{
	private Integer wt=7;
	public String FlavorType(){
		return "Strawberry";
	}
	public Integer getWt(){
		return wt;
	}
	public String CandyType(){
		return "Chewing Gum";}
}