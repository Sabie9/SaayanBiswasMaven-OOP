package com.epam1.maven_demo;

public class DarkChoco extends Chocolate implements Flavor,Comparable< Chocolate >{
	private String flav="Bitter and Sweet Dark chocolate";
	public String FlavorType(){
		return flav;
	}	
}