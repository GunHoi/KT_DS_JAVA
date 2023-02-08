package com.ktdsuniversity.edu.parkingLot.service;

import com.ktdsuniversity.edu.parkingLot.vo.CarType;

public interface ParkingService {
	//주차 시작
	public boolean parkingStart(CarType type, String user);
	
	//주차 정산
	public boolean parkingPay(String user, int time);
	
	//차종별 가격
	public boolean payPerType(CarType type);
	
	//주차장 자리 수
	public boolean isRemainSpace();
}
