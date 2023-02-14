package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Penguin implements Walkable, Swimable{
	
	private String name;
	
	public Penguin(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + " 먹다.");
	}

	@Override
	public void bark() {
		System.out.println(name + " 운다.");
	}

	@Override
	public void swim() {
		System.out.println(name + " 수영.");
	}

	@Override
	public void walk() {
		System.out.println(name + " 걷다.");
	}
	
}
