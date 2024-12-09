package com.travels;

import java.util.ArrayList;


public class TestDriver {
	private static final Driver DRIVER=new Driver("car",111,"Prasad",100.03);
	public static ArrayList<Driver> driverList=new ArrayList<>();
	

	public static void main(String[] args) {
		testData();
		Travel travel=new Travel();
		
		boolean status =travel.isCarDriver(DRIVER);
		System.out.println("is Car Diver : "+status);
		
		String check=travel.retreiveByDriverId(driverList, 112);
		System.out.println(check);
		 
		int retreiveCountOfDriver=travel.retreiveCountOfDriver(driverList, "Lorry");
		System.out.println("retreiveCountOfDriver :"+retreiveCountOfDriver);
		
		ArrayList retreiveDriver = travel.retreiveDriver(driverList, "Lorry");
		System.out.println(retreiveDriver);
		
		
		Driver retreiveMaxDistanceTravelled=travel.retreiveMaxDistanceTravelled(driverList);
		System.out.println(retreiveMaxDistanceTravelled);
	}


	private static void testData() {
		Driver driver1=DRIVER;
		//Driver driver1=new Driver("Car",111,"Prasad",100.03);
		Driver driver2=new Driver("Lorry",112,"Mickel",110.02);
		Driver driver3=new Driver("Truck",113,"Mike",2430.15);
		Driver driver4=new Driver("Lorry",114,"Titus",210.35);
		
		
		driverList.add(driver1);
		driverList.add(driver2);
		driverList.add(driver3);
		driverList.add(driver4);
	}
}
