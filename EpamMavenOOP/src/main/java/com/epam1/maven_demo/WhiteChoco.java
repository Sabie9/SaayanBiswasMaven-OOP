package com.epam1.maven_demo;

public class WhiteChoco extends Chocolate implements Flavor,Comparable< Chocolate >{
	private String flav="Sweet White chocolate";
	public String FlavorType(){
		return flav;
	}
}
