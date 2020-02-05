package com.epam1.maven_demo;

public class MilkChoco extends Chocolate implements Flavor,Comparable< Chocolate >{
	private String flav="Milky Sweet Milk chocolate";
	public String FlavorType(){
		return flav;
	}		
}