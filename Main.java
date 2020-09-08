package com.secondhand3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the name of the stall:");
		String name = s.nextLine();
		System.out.println("Enter the detail of the stall:");
		String detail = s.nextLine();
		System.out.println("Enter the owner of the stall:");
		String ownerName=s.nextLine();
		System.out.println("Enter the type of the stall:");
		String stallType=s.nextLine();
		System.out.println("Enter the size of the stall:");
		int squareFeet=s.nextInt();
		System.out.println("Does the hall have TV? (Y / N):");
		String yrn=s.nextLine();
		s.nextLine();
		System.out.println("Enter the number of TV:");
		int numberofTV=s.nextInt();
	    Stall stall = new Stall(name,detail,ownerName);
	    if(yrn.equals('Y'))
	    	System.out.println(stall.computeCost(stallType,squareFeet));
	    else
	    	System.out.println(stall.computeCost(stallType,squareFeet,numberofTV));
		

	}

}
