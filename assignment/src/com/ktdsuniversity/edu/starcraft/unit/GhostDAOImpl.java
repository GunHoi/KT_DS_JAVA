package com.ktdsuniversity.edu.starcraft.unit;

public class GhostDAOImpl implements GhostDAO{

	@Override
	public void move() {
		System.out.println("move ghost");
	}

	@Override
	public void stop() {
		System.out.println("stop ghost");
	}

	@Override
	public void hold() {
		System.out.println("hold ghost");
	}

	@Override
	public void patrol() {
		System.out.println("patrol ghost");
	}

}
