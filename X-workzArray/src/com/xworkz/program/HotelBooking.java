package com.xworkz.program;

public class HotelBooking {
	
	public String checkhotelAvaibility(String nameOfthehotel){
		String listOfHotels[]= {"leela palace","four season","taj","pola","nakshathra","harsha","bala"};
		for (int i = 0; i < listOfHotels.length; i++) {
			if(listOfHotels[i].equalsIgnoreCase(nameOfthehotel)) {
				return listOfHotels[i];
			}
		}
		return null;
	}
public void bookRoom(int noOfRoom,int noOfDays,String hotelName) {
	int amt=0;
	int totalAmt=0;
	switch(hotelName) {
	case "bala":
		amt=noOfRoom * 1000;
		totalAmt=amt * noOfDays;
		System.out.println("Thank for Booking Room you need to pay = " +totalAmt);
		break;
	case "pola":
		amt=noOfRoom * 7000;
		totalAmt=amt * noOfDays;
		System.out.println("Thank for Booking Room you need to pay = " +totalAmt);
		break;
	case "taj":
		amt=noOfRoom * 3000;
		totalAmt=amt * noOfDays;
		System.out.println("Thank for Booking Room you need to pay = " +totalAmt);
		break;
	case "four seaon":
		amt=noOfRoom * 6000;
		totalAmt=amt * noOfDays;
		System.out.println("Thank for Booking Room you need to pay = " +totalAmt);
		break;
		
	}
}
	

}
