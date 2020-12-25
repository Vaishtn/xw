package com.xworkz.FootWare;

public class FootWare {
	

		private int size;
		private String brand;
		private double price;
		private FootWareType footWearType;

		public void protect() {
			System.out.println("invoked protect");
		}

		public void displayDetails() {
			System.out.println("invoked displayDetails");
			System.out.println(this.size);
			System.out.println(this.brand);
			System.out.println(this.price);
			System.out.println(this.footWearType);
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public FootWareType getFootWearType() {
			return footWearType;
		}

		public void setFootWearType(FootWareType footWearType) {
			this.footWearType = footWearType;
		}

}
