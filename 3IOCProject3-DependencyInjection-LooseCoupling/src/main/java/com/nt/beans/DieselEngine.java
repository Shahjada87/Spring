package com.nt.beans;

public class DieselEngine implements Engine {
	public DieselEngine() {
		System.out.println("DieselEngine :: 0-Param Constructor");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("DieselEngine :: Started");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("DieselEngine :: Stopped");
	}

}
