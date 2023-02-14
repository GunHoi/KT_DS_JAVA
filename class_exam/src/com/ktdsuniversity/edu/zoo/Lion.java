package com.ktdsuniversity.edu.zoo;


import com.ktdsuniversity.edu.zoo.inf.Runnable;
import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Lion implements Runnable, Walkable, Swimable{

	private String name;
	
	public Lion(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + " 먹는다.");
	}

	@Override
	public void bark() {
		System.out.println(name + " 어흥");
	}

	@Override
	public void swim() {
		System.out.println(name + " 수영");
	}

	@Override
	public void walk() {
		System.out.println(name + " 걷는다.");
	}

	@Override
	public void run() {
		System.out.println(name + " 뛴다.");
	}
	
}
