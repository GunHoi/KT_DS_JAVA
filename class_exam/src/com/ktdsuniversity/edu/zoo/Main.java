package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Animal;
import com.ktdsuniversity.edu.zoo.inf.Crawlable;
import com.ktdsuniversity.edu.zoo.inf.Flyable;
import com.ktdsuniversity.edu.zoo.inf.Runnable;
import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Main {
	
	public static void run(Animal animal) {
		animal.eat();
		animal.bark();
		if(animal instanceof Walkable) {
			((Walkable) animal).walk();
		}
		if(animal instanceof Runnable) {
			((Runnable) animal).run();
		}
		if(animal instanceof Flyable) {
			((Flyable) animal).fly();
		}
		if(animal instanceof Swimable) {
			((Swimable) animal).swim();
		}
		if(animal instanceof Crawlable) {
			((Crawlable) animal).crawl();
		}
	}
	
	public static void main(String[] args) {
		Animal lion = new Lion("사자");
//		Walkable wLion = new Lion("걷는 사자");
//		Runnable rLion = new Lion("뛰는 사자");
//		Swimable sLion = new Lion("수영하는 사자");
		
		run(lion);
		System.out.println();
//		lion.eat();
//		lion.bark();
//		wLion.walk();
//		rLion.run();
//		sLion.swim();
		
		Animal duck = new Duck("도날드덕");
		Animal penguin = new Penguin("뽀로로");
		run(duck);
		System.out.println();
		run(penguin);
	}
}
