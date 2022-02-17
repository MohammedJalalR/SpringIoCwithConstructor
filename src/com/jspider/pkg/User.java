package com.jspider.pkg;

public class User {
	
	private String name;
	private int runs;
	public String getName() {
		return name;
	}
	public int getRuns() {
		return runs;
	}
	public User(String name, int runs) {
		
		this.name = name;
		this.runs = runs;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", runs=" + runs + "]";
	}

}
