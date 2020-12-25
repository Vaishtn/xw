package com.xworkz.FootWare;

public class FWTester {
	public static void main(String[] args) {

			
			ShoeFootWare shoeFootWear=new ShoeFootWare();
			
			shoeFootWear.setBrand("Adidas");
			shoeFootWear.setSize(7);
			shoeFootWear.setPrice(2000);
			shoeFootWear.setFootWearType(FootWareType.SPORTS);
			
			shoeFootWear.displayDetails();
			
			double dis=shoeFootWear.calculateDiscount();
			System.out.println(dis);
			
			
			
		}



}
