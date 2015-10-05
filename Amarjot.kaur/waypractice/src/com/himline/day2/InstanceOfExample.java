package com.himline.day2;

public class InstanceOfExample {

	 static boolean result;
	 static HeavyVehicle hV = new HeavyVehicle();
	 static Truck T = new Truck();
	 static HeavyVehicle hv2 = null;
	 public static void main(String[] args) {
	  result = hV instanceof HeavyVehicle;
	  System.out.print("hV is an HeavyVehicle: " + result + "\n");
	  result = T instanceof HeavyVehicle;
	  System.out.print("T is an HeavyVehicle: " + result + "\n");
	  result = hV instanceof Truck;
	  System.out.print("hV is a Truck: " + result + "\n");
	  result = hv2 instanceof HeavyVehicle;
	  System.out.print("hv2 is an HeavyVehicle: " + result + "\n");
	  hV = T; //Sucessful Cast form child to parent
	  T = (Truck) hV; //Sucessful Explicit Cast form parent to child
	 }
	}

