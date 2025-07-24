package com.ycw.ch13.step03;

public class BestRobbins41 {
	private String basicFlavor = "Vanilla";
	
	public String getProduct(final String choice01, String choice02) {
		int choice01Scoop = 1;
		int choice02Scoop = 1;
		
		IceCream ice = new IceCream() {
			
			@Override
			public String flavor() {
				StringBuilder flavors = new StringBuilder();
				flavors.append(basicFlavor);
				flavors.append("/");
				flavors.append(choice01);
				flavors.append("*");
				flavors.append(choice01Scoop);
				flavors.append("/");
				flavors.append(choice02);
				flavors.append("*");
				flavors.append(choice02Scoop);

				return flavors.toString();
			}
		};
		
		return ice.flavor();
	}
}
