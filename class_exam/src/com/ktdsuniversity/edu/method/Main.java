package com.ktdsuniversity.edu.method;

public class Main {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(0);
		calc.sum(0L);
		calc.sum(0, 0);
		calc.sum(0, 0, 0);
		
		Welcome welcome = new Welcome();
		System.out.println(welcome.greeting());
		System.out.println(welcome.greeting("홍길동"));
		System.out.println(welcome.greeting("홍길동", "안녕"));
		System.out.println(welcome.greeting("김씨","이씨","박씨","최씨","김씨","이씨","박씨","최씨"));
		System.out.println(welcome.greetings(new String[] {"김씨","이씨","박씨","최씨","김씨","이씨","박씨","최씨"}));
	}

}
