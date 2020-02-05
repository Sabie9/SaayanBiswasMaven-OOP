package com.epam1.maven_demo;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.ArrayList; 
import java.util.Collections;

public class MyMain{
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		int i;

		System.out.println("Select the number of chocolates you want");

		int num = Integer.parseInt(reader.readLine());
		ArrayList<Chocolate> chocos = new ArrayList<Chocolate>(num);
		
		for(i=0;i<num;i++){
		System.out.println("Select the type of Chocolates you want:\n 1.White chocolate\n 2.Dark Chocolate\n 3. Milk Chocolate");
		
		String name = reader.readLine(); 
		
		if(name=="White chocolate"){
			Chocolate ob=new WhiteChoco();
			ob.setWt(5);
			chocos.add(ob);}
		if(name=="Dark chocolate"){
			Chocolate ob=new DarkChoco();
			ob.setWt(6);
			chocos.add(ob);}
		if(name=="Milk chocolate"){
			Chocolate ob=new MilkChoco();ob.setWt(7);
			chocos.add(ob);}
		}

		int totalWeight = 0;

		for(Chocolate ii: chocos){
 		   totalWeight = totalWeight + ii.getWt();
		}
		System.out.println("The total weight of the Chocolate gifts is "+totalWeight);

		System.out.println("Select the number of Candies you want");

		num = Integer.parseInt(reader.readLine());

		ArrayList<Candy> candies = new ArrayList<Candy>(num);
		
		for(i=0;i<num;i++){
		System.out.println("Select the type of Candy you want:\n 1.Gummy\n 2.Lollipop\n 3.Chewing Gum");
		
		String name = reader.readLine(); 
		
		if(name=="Gummy"){
			Candy ob=new Gummy();
			candies.add(ob);}
		if(name=="Lollipop"){
			Candy ob=new Lollipop();
			candies.add(ob);}
		if(name=="Chewing Gum"){
			Candy ob=new ChewingGum();
			candies.add(ob);}
		}

		totalWeight = 0;

		for(Candy ii: candies){
 		   totalWeight = totalWeight +ii.getWt();
		}
		System.out.println("The total weight of the Candy gifts is "+totalWeight);
		
		Collections.sort(chocos);

		System.out.println("The list of Chocolates in ascending order of weights is :");

		for(Chocolate ii: chocos){
 		   System.out.println(ii.FlavorType());
		}
		System.out.println("Search the candy type you have from this list:\n 1.Gummy\n 2.Lollipop\n 3.Chewing Gum");
		
		String name = reader.readLine(); 			

		for(Candy ii: candies){
 		   if(name==ii.CandyType()){
			System.out.println(name+" Found!!!");}
		   else{
			System.out.println(name+"Not Found!!!");
			}
		}
		
	}
}
			
