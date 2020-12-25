package com.xworkz.inheritance;

public class Tester {

	public static void main(String[] args) {
		Clock clock=new Clock();
		clock.setModel("Sony");
		clock.setPrize(5000);
		clock.setShape("round");
		clock.setSpeed(203);
		System.out.println(clock.getModel());
		System.out.println(clock.getPrize());
		System.out.println(clock.getShape());
		System.out.println(clock.getSpeed());
		
		Sony sony=new Sony();
		sony.setLaunch("today");
		System.out.println(sony.getLaunch());
	}

}
