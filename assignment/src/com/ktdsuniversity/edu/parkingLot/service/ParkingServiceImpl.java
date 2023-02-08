package com.ktdsuniversity.edu.parkingLot.service;

import com.ktdsuniversity.edu.parkingLot.dao.ParkingDAO;
import com.ktdsuniversity.edu.parkingLot.dao.ParkingDAOImpl;
import com.ktdsuniversity.edu.parkingLot.vo.CarType;

public class ParkingServiceImpl implements ParkingService{
	
	private ParkingDAO parkingDAO;
	
	public ParkingServiceImpl() {
		parkingDAO = new ParkingDAOImpl();
	}
	
	@Override
	public boolean parkingStart(CarType type, String user) {
		return parkingDAO.parkingStart(type, user) > 0;
	}

	@Override
	public boolean parkingPay(String user, int time) {
		return parkingDAO.parkingPay(user, time) > 0;
	}

	@Override
	public boolean payPerType(CarType type) {
		return parkingDAO.payPerType(type) > 0;
	}

	@Override
	public boolean isRemainSpace() {
		return parkingDAO.isRemainSpace();
	}

}
