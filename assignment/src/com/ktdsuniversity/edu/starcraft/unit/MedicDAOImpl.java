package com.ktdsuniversity.edu.starcraft.unit;

public class MedicDAOImpl implements MedicDAO{

	@Override
	public void move() {
		System.out.println("move medic");
	}

	@Override
	public void stop() {
		System.out.println("stop medic");
	}

	@Override
	public void hold() {
		System.out.println("hold medic");
	}

	@Override
	public void patrol() {
		System.out.println("patrol medic");
	}

}
