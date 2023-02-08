package com.ktdsuniversity.edu.parkingLot.dao;

import java.util.HashMap;
import java.util.Map;

import com.ktdsuniversity.edu.parkingLot.vo.CarType;
import com.ktdsuniversity.edu.parkingLot.vo.ParkingVO;

public class ParkingDAOImpl implements ParkingDAO{
	
	private Map<String, ParkingVO> parkedCarMap  = new HashMap<>();

	@Override
	public int parkingStart(CarType type, String user) {
		ParkingVO parkedCar = new ParkingVO();
		if(isRemainSpace()) {
			parkedCar.setType(type);
			parkedCar.setPrice(payPerType(type));
			parkedCar.setUser(user);
			parkedCarMap.put(user, parkedCar);
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public int parkingPay(String user, int time) {
		if(!parkedCarMap.containsKey(user)) {
			System.out.println("없는 사용자명 입니다.");
			return 0;
		}else {
			int payedMoney = (int) (parkedCarMap.get(user).getPrice() * Math.ceil(time/10.0));
			System.out.println(user+"님의 주차비는 "+payedMoney+"원 입니다.");
			parkedCarMap.remove(user);
			return 1;
		}
	}

	@Override
	public int payPerType(CarType type) {
		if(type.equals(CarType.LIGHT_CAR)) {
			return 500;
		}else if(type.equals(CarType.SMALL_CAR)) {
			return 800;
		}else if(type.equals(CarType.SEMI_MEDIUM_CAR)) {
			return 850;
		}else if(type.equals(CarType.MEDIUM_CAR)) {
			return 1000;
		}else if(type.equals(CarType.LARGE_CAR)) {
			return 1500;
		}else {
			return 0;
		}
	}
	
	@Override
	public boolean isRemainSpace() {
		if(parkedCarMap.size()<35) {
			return true;
		}else {
			System.out.println("주차 공간이 부족합니다.");
			return false;
		}
	}
}
