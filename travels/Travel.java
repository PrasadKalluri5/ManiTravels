package com.travels;

import java.util.ArrayList;

public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equals("Car");
		
		/*
		String category=driver.getCategory();
		if(category.equals("Car")) {
			return true;
		}else {
			return false;
			
		}*/

		}
	
	public String retreiveByDriverId(ArrayList<Driver> driverList,int driverId) {
		for(Driver driver:driverList) {
			if(driver.getDriverId()==driverId) {
				return "Driiver Name is "+driver.getDriverName() +" Belonging to the category "+driver.getCategory()+" travelled "+
			driver.getTotalDistance()+" Km distance.";
			}
		}
		return "Check Id!.No driver found with given Id.";
	}
	
	
	public int retreiveCountOfDriver(ArrayList<Driver> driverList,String category) {
		
		int numberOfDrivers=0;
		for(Driver driver:driverList) {
			if(driver.getCategory().equals(category)) {
				
				numberOfDrivers++;
			}
		}
		
		return numberOfDrivers;
	}
	
	
	
	public ArrayList<Driver> retreiveDriver(ArrayList<Driver> driverList,String category) {
		ArrayList<Driver> categorySpecificDrivers=new ArrayList<>();
		for(Driver driver:driverList) {
			if(driver.getCategory().equals(category)) {
				
				categorySpecificDrivers.add(driver);
			}
		}
		
		return categorySpecificDrivers;
	}
 
	
	public Driver retreiveMaxDistanceTravelled(ArrayList<Driver> driverList) {
		
		//coolectons.sort(),comparator
		Driver maxDistanceTravelled=driverList.get(0);
		for(Driver driver:driverList) {
				if(driver.getTotalDistance()>maxDistanceTravelled.getTotalDistance()) {			
				maxDistanceTravelled=driver;
			}
		}
		
		return maxDistanceTravelled;
	}
}
