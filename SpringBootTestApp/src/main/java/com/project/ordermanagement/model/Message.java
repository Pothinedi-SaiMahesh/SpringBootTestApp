package com.project.ordermanagement.model;

public class Message {
	
	public static void hello() {
		System.out.println("Hello Welcome to Java World");
	}
	
	private int fivemultiplyintoseven() {
		return 5*7;
	}
	public static void main(String[] args) {
		hello();
		Message m = new Message();
		System.out.println(m.fivemultiplyintoseven());
		
	}
}
