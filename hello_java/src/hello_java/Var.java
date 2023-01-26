package hello_java;

public class Var {

	public static void main(String[] args) {
		int x=2147422222, y=5, z=3;
		
		System.out.println("철수는 사과를 "+x+"개 가지고 있다.");
		System.out.println("영희 사과를 "+y+"개 가지고 있다.");
		System.out.println("철수가 영희에게 사과를 "+z+"개 빌렸다.");
		x = x+z;
		y = y-z;
		System.out.println("철수는 사과를 "+x+"개 가지고 있다.");
		System.out.println("영희는 사과를 "+y+"개 가지고 있다.");
	}

}
