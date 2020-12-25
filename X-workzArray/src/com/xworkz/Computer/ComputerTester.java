package com.xworkz.Computer;

public class ComputerTester {

	public static void main(String[] args) {
		Desktop desktop=new Desktop();
		
		
		Computer comp=new Desktop();
		
		
		Desktop casted=(Desktop)comp;
		
		casted.setColor("Blue");
		System.out.println(casted.getColor());
		casted.setModel("HP");
		System.out.println(casted.getModel());
		
		Computer computer=new Laptop();
		
		Laptop ref=(Laptop)computer;
		ref.setVersion("10th");
		System.out.println(ref.getVersion());
		ref.setModel("Dell");
		System.out.println(ref.getModel());
			}

}
