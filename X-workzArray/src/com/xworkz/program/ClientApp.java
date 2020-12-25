package com.xworkz.program;

public class ClientApp {

	public static void main(String[] args) {
		//HotelBooking hotelBooking=new HotelBooking();
		
		//String HotelAvailability=hotelBooking.checkhotelAvaibility("bala");
		//if(HotelAvailability!=null) {
			//System.out.println("Hotel is available for booking");
			//hotelBooking.bookRoom(2, 3, "bala");
			
		//}
		//else {
		//System.out.println("sorry given hotel is not available for booking");

	//}
		tcketBooking tcketbooking=new tcketBooking();
		String checkRoute=tcketbooking.checkRoute("GOA");
		//System.out.println(checkRoute);
		if(checkRoute!=null) {
			System.out.println("your seat has been booked in srs");
			tcketBooking.busTicketBooking("GOA", "srs", 3);
			
		}
		else {
		System.out.println("sorry given hotel is not available for booking");


}
		tcketBooking tcketbooking1=new tcketBooking();
		String checkRoute1=tcketbooking.checkRoute("karnatak");
		//System.out.println(checkRoute);
		if(checkRoute!=null) {
			System.out.println("your seat has been booked in vrl");
			tcketBooking.busTicketBooking1("karnatak", "vrl", 2);
			
		}
		else {
		System.out.println("sorry given hotel is not available for booking");


	}
		tcketBooking tcketbooking2=new tcketBooking();
		String checkRoute2=tcketbooking.checkRoute("UP");
		//System.out.println(checkRoute);
		if(checkRoute!=null) {
			System.out.println("your seat has been booked in Ganesh");
			tcketBooking.busTicketBooking2("UP", "Ganesh", 5);
			
		}
		else {
		System.out.println("sorry given hotel is not available for booking");


	}
		tcketBooking tcketbooking3=new tcketBooking();
		String checkRoute3=tcketbooking.checkRoute("J&K");
		//System.out.println(checkRoute);
		if(checkRoute!=null) {
			System.out.println("your seat has been booked in Manjunath");
			tcketBooking.busTicketBooking3("J&K", "Manjunath", 6);
			
		}
		else {
		System.out.println("sorry given hotel is not available for booking");


	}

	}

	}
	
	
	
	
	
	

