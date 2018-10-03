package com.primetgi.emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email em1 = new Email("Mohammed", "Ifteqar");
		em1.setAlternateEmail("m.ifteqar@gmail.com");
		System.out.println("Your Alternate Email: "+em1.getAlteranateEmail());
		
		String fullInfo = em1.showInfo();
		System.out.println(fullInfo);
	}

}
