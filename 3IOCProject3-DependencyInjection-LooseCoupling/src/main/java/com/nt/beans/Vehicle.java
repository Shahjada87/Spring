package com.nt.beans;

public class Vehicle {
	//Has-A property to hold dependent class object
	private Engine engine;
	
	public Vehicle() {
		System.out.println("Vehicle : 0-Param Constructor");
	}
		//Setter method for setter injection
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		
		//b method
		public void startVehicle() {
			engine.startEngine();
			System.out.println("Vehicle Started");
		}
		
		public void stopVehicle() {
			engine.stopEngine();
			System.out.println("Vehicle Stopped");
		}
		
		public void move(String startPlace, String destPlace) {
			System.out.println("Journey started from : "+ startPlace );
			System.out.println("Journey is going on...");
			try {
			Thread.sleep(30000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Journey Ended at : "+ destPlace);
		}
	}
