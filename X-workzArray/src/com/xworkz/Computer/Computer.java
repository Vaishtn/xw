package com.xworkz.Computer;

public class Computer {
		private int price;
		private String model;
		private String color;
		
		
		public static void on(){
			System.out.println("Your system is on");
		}
		
		public static void shutdown() {
			System.out.println("CP is going to off");
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
}
