package com.xworkz.browser;

public class FireFoxTester {

	public static void main(String[] args) {
		Object generic=new Firefox();
		Browser browser=new Firefox();
		Firefox firefox=new Firefox();
		
		
		
		generic = new String ("test");
		if(generic instanceof Firefox) {//to avoid class-instanceof
			System.out.println("yes it is fire fox");
			Firefox fireFoxCasted=(Firefox)generic;
			System.out.println((firefox.getName()));
			}
		else {
			
				System.out.println("it is not fire fox");
			}
			
		}
	}


