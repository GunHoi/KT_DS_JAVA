package com.ktdsuniversity.edu.parkingLot.dao;

import com.ktdsuniversity.edu.parkingLot.vo.CarType;

public interface ParkingDAO {
	
	//주차 시작
	public int parkingStart(CarType type, String user);
	
	//주차 정산
	public int parkingPay(String user, int time);
	
	//차종별 가격
	public int payPerType(CarType type);
	
	//주차장 자리 수
	public boolean isRemainSpace();
}
