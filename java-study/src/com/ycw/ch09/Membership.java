package com.ycw.ch09;

public class Membership {
	private final int memberNo;
	private final String name;
	
	public Membership(int memberNo, String name) {
		this.memberNo = memberNo;
		this.name = name;
	}
	
	public String getInfo() {
		return memberNo + "-" + name;
	}
	//final이기 때문에 값을 바꿀 수 없음
//	public void setMemberNo(int memberNo) {
//		this.memberNo = memberNo;
//	}
}
