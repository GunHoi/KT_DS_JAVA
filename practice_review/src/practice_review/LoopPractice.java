package practice_review;

import java.util.Random;
import java.util.Scanner;

public class LoopPractice {
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int age = 0;
		
		while(count<3) {
			System.out.print("나이를 입력(while) : ");
			age = 21;
			
			if (age >= 19) {
				System.out.println("성인 입니다.");
			} else {
				System.out.println("미성년 입니다.");
			}
			count+=1;
		}
		
		for(int i=0;i<3;i++) {
			System.out.print("나이를 입력(for) : ");
			age = 18;
			
			if (age >= 19) {
				System.out.println("성인 입니다.");
			} else {
				System.out.println("미성년 입니다.");
			}
		}
		
		
		System.out.println();
		
		int[] scoreArr = new int[4];
		double score = 0;
		
		String grade = null;
		String word = null;
		boolean flag = false;
		while(flag) {
			grade="F";
			score = 0;
			System.out.print("입력 : ");
			word = scan.nextLine();
			if (word.toLowerCase().equals("quit")) {
				break;
			} else if (word.toLowerCase().equals("keep")) {
				for(int i=0;i<scoreArr.length;i++) {
					scoreArr[i] = random.nextInt(50)+51;
					score+=scoreArr[i];
				}
				score = score/scoreArr.length;
				
				if (score>=95) {
					grade = "A+";
				} else if (score >= 90) {
					grade = "A";
				} else if (score >= 85){
					grade = "B+";
				} else if (score >= 80) {
					grade = "B";
				}else if (score >= 70) {
					grade = "C";
				}else if (score >= 60) {
					grade = "D";
				}
				System.out.println(score+"는 "+grade+" 학점 입니다.");
			}
		}
		System.out.println("==================================================");
		for (int i=0;i<100;i++) {
			if (i == 0) {
				continue;
			}
			
			if (i % 5 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("==================================================");
		for(int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수 입니다.");
			}else {
				System.out.println("홀수 입니다.");
			}
		}
		System.out.println("==================================================");
		int [] arr = new int[50];
		for (int i=0;i<arr.length;i++) {
			arr[i] = random.nextInt(50)+1;
		}
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%3==0 && arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
	}
}
