package com.xworkz.program;

public class tcketBooking {
public String checkRoute(String place) {
	String listOfPlaces[]= {"Karnatak","GOA","Munbai","J&K","UP"};
	for (int i = 0; i < listOfPlaces.length; i++) {
		if(listOfPlaces[i].equalsIgnoreCase(place)) {
			return listOfPlaces[i];
		}
		
	}
	return null;
	
}
public static void busTicketBooking(String place,String travelAcency,int noOfSeats) {
	int amt=0;
	switch(travelAcency) {
	case "srs":if(place.contentEquals("GOA")) {
		amt=noOfSeats*700;
		System.out.println(amt);
	}
	if(place.equals("GOA")){
		amt=noOfSeats*1500;
		System.out.println(amt);
	}
	}
}
public static void busTicketBooking1(String place,String travelAcency,int noOfSeats) {
	int amt=0;
	switch(travelAcency) {
	case "vrl":if(place.contentEquals("karnatak")) {
		amt=noOfSeats*800;
		System.out.println(amt);
	}
	if(place.equals("karnatak")){
		amt=noOfSeats*8500;
		System.out.println(amt);
	}
	}
}

public static void busTicketBooking2(String place,String travelAcency,int noOfSeats) {
	int amt=0;
	switch(travelAcency) {
	case "Ganesh":if(place.contentEquals("UP")) {
		amt=noOfSeats*800;
		System.out.println(amt);
	}
	if(place.equals("UP")){
		amt=noOfSeats*8500;
		System.out.println(amt);
	}
	}
}

public static void busTicketBooking3(String place,String travelAcency,int noOfSeats) {
	int amt=0;
	switch(travelAcency) {
	case "Manjunath":if(place.contentEquals("J&K")) {
		amt=noOfSeats*400;
		System.out.println(amt);
	}
	if(place.equals("J&K")){
		amt=noOfSeats*8500;
		System.out.println(amt);
	}
	}
}


}
