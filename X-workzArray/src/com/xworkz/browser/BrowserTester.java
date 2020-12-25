package com.xworkz.browser;

public class BrowserTester {

	public static void main(String[] args) {
		Browser browser =new Browser();
		browser.setName("IE");
		System.out.println(browser.getName());
		
		Object genericBrowser=new Browser();
		Browser childRef=(Browser)genericBrowser;
		
		childRef.setName("IE-8");
		System.out.println("updated browser name is"+childRef.getName());
		
		Object day=new String("Tuesday");
		String string=(String)day;
		Browser notGoodRef=(Browser)day;
		
				}

}
