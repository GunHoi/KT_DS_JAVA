package com.ktdsuniversity.edu.starcraft.unit;

public class FirebatDAOImpl implements FirebatDAO{

	@Override
	public void move() {
		System.out.println("move firebat");
	}

	@Override
	public void stop() {
		System.out.println("stop firebat");
	}

	@Override
	public void hold() {
		System.out.println("hold firebat");
	}

	@Override
	public void patrol() {
		System.out.println("patrol firebat");
	}

}
