package com.ktdsuniversity.edu.parkingLot.controller;

import com.ktdsuniversity.edu.parkingLot.service.ParkingService;
import com.ktdsuniversity.edu.parkingLot.service.ParkingServiceImpl;
import com.ktdsuniversity.edu.parkingLot.vo.CarType;

public class ParkingController {
	public static void main(String[] args) {
		ParkingService service = new ParkingServiceImpl();
		for(int i=1;i<=7;i++) {
			service.parkingStart(CarType.LIGHT_CAR, "경차 차주"+i);
			service.parkingStart(CarType.SMALL_CAR, "소형차 차주"+i);
			service.parkingStart(CarType.SEMI_MEDIUM_CAR, "준중형차 차주"+i);
			service.parkingStart(CarType.MEDIUM_CAR, "중형차 차주"+i);
			service.parkingStart(CarType.LARGE_CAR, "대형차 차주"+i);
		}
		service.parkingStart(CarType.LARGE_CAR, "자리 부족해서 주차 못해요");
		service.parkingPay("경차 차주1", 90);
		service.parkingPay("경차 차주2", 4890);
		service.parkingPay("대형차 차주2", 4890);
	}
}
