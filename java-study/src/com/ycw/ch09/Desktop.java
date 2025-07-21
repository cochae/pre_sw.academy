package com.ycw.ch09;

public class Desktop {
	private static String cpu = "8 core";
	private static String memory = "RAM 32GB";
	private static String video = "RTX 3060 8GB";
	private static String feature;
	
	//static block 메인 메소드가 실행되기 이전에 실행됨
	static {
		feature = cpu + "/" + memory + "/" + video;
	}
	public static String getFeature() {
		return feature;
	}
	
}
