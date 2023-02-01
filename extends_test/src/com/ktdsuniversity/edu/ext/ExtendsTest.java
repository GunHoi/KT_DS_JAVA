package com.ktdsuniversity.edu.ext;

public class ExtendsTest{

	public static void print(Address address) {
		System.out.println(address.getName());
		System.out.println(address.getPhoneNumber());
		System.out.println(address.getAddress());
		
		if(address instanceof Friends) {
			Friends friend = (Friends) address;
			System.out.println(friend.getBirthDay());
		}
	}
	
	public static void main(String[] args) {
		
		Friends friend = new Friends();
		friend.setName("홍길동");		//Address의 field
		friend.setBirthDay("2023-02-01");	//Friends의 field
		//System.out.println(friend.getName()+"의 생일은 "+friend.getBirthDay());
		print(friend);
	}
}
