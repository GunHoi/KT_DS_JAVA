package com.ktdsuniversity.edu.starcraft.unit;

public class MarineDAOImpl implements MarineDAO{

	@Override
	public void move() {
		System.out.println("move marine");
	}

	@Override
	public void stop() {
		System.out.println("stop marine");
	}

	@Override
	public void hold() {
		System.out.println("hold marine");
	}

	@Override
	public void patrol() {
		System.out.println("patrol marine");
	}

}
