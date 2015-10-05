package com.himline.day2;

public class Vehicle {
		 String name;
		 Vehicle() {
		  name = "Vehicle";
		 }
		}

		class HeavyVehicle extends Vehicle {

		 HeavyVehicle() {
		  name = "HeavyVehicle";
		 }
		}

		         class Truck extends HeavyVehicle {

		          Truck() {
		          name = "Truck";
		          }
		          }

		class LightVehicle extends Vehicle {

		 LightVehicle() {
		  name = "LightVehicle";
		 }
		}


