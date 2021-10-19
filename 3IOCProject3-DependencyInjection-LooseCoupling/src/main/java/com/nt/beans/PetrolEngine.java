package com.nt.beans;

public class PetrolEngine implements Engine {
	
		public PetrolEngine() {
			System.out.println("PetrolEngine :: 0-Param Constructor");
		}
	
		public void startEngine() {
			System.out.println("PetrolEngine :: Started");
		}
		
		public void stopEngine() {
			System.out.println("PetrolEngine :: Stopped");
		}
}
