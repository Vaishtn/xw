package com.xworkz.inheritance;

public class Bakery {

	public static void main(String[] args) {
		Cake cake=new Cake();
		 cake.setFalvour("cholockate");
		 
		 System.out.println(cake.getFalvour());
		 
		 HoneyCake honey = new HoneyCake();
		 honey.setTaste("best");
		 System.out.println(honey.getTaste());
	}

}
