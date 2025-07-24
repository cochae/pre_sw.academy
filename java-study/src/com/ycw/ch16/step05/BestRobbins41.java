package com.ycw.ch16.step05;

public class BestRobbins41 {
	private String flavor1;
	private String flavor2;
	private String flavor3;
	private String flavor4;
	private String flavor5;
	private String flavor6;

	public BestRobbins41(String flavor1, String flavor2, String flavor3, 
			String flavor4, String flavor5, String flavor6) {
		this.flavor1 = flavor1;
		this.flavor2 = flavor2;
		this.flavor3 = flavor3;
		this.flavor4 = flavor4;
		this.flavor5 = flavor5;
		this.flavor6 = flavor6;
	}
	
	public String getPint() {
		System.out.println("test");
		return "pint: " + flavor1 + "/" + flavor2 + "/" + flavor3;
	}
	
	public String getQuater() {
		return "quater: " + flavor1 + "/" + flavor2 + "/" + flavor3 + "/" + flavor4;
	}
	
	public String getFamily() {
		return "family: " + flavor1 + "/" + flavor2 + "/" + flavor3 + "/" + flavor4 + "/" + flavor5;
	}
	
	public String getHalfGallon() {
		return "half gallon: " + flavor1 + "/" + flavor2 + "/" + flavor3 + "/" + flavor4 + "/" + flavor5 + "/" + flavor6;
	}
}
