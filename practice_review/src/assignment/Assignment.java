package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Assignment {

	//45.
	public static void printHello() {
		System.out.println("\n45. 안녕하세요.");
	}
	
	//46.
	public static void printHello(String name) {
		System.out.println("46. "+name+"님 안녕하세요.");
	}
	
	//47.
	public static void multiplyNumbers(int num1, int num2) {
		System.out.println("47. "+(num1*num2));
	}
	
	//48.
	public static void plusNumbers(int num1, int num2, int num3) {
		System.out.println("48. "+(num1+num2+num3));
	}
	
	//49.
	public static int convertSymbol(int num) {
		if(num >= 0) {
			num = -num;
		}else {
			num = num - (num*2);
		}
		return num;
	}
	
	//50.
	public static int convertSymbol(int num1, int num2) {
		int num = num1 - num2;
		num = convertSymbol(num);
		return num;
	}
	
	//51.
	public static int getLength(String str) {
		return str.length();
	}
	
	//52.
	public static String plusStrings(String str1, String str2) {
		return str1+str2;
	}
	
	//53.
	public static String getLongText(String str1, String str2, String str3) {
		if (str1.length()>=str2.length()) {
			return str1.length() >= str3.length() ? str1 : str3;
		} else {
			return str2.length() >= str3.length() ? str2 : str3;
		}
	}
	
	//54.
	public static String getSubstring(String str, int num1, int num2) {
		int tmp = 0;
		
		if (num1 < 0 || num2 < 0) {
			return "자를 수 없습니다.";
		}
		
		if (num1 > num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		if(str.length() <= num2) {
			return "자를 수 없습니다.";
		}
		
		return str.substring(num1, num2);
	}
	
	//55.
	public static boolean isContains(String str1, String str2) {
		if(str1==null||str2==null) {
			System.out.println("null은 포함할 수 없습니다.");
		}
		return str1.contains(str2);
	}
	
	//56.
	public static String getReplaced(String str1, String str2, String str3) {
		if(str1==null||str2==null||str3==null) {
			System.out.println("null은 포함할 수 없습니다.");
		}
		if(str1.contains(str2)==false) {
			System.out.println("str1에는 str2가 포함되어 있지 않습니다.");
		}
		return str1.replace(str2, str3);
	}
	
	public static void main(String[] args) {
		//1.
		int number = 7;
		System.out.println("1. "+number);
		
		//2.
		int empty;
		// System.out.println("2. "+empty);
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		// The local variable empty may not have been initialized
		
		//3.
		int result = 7+7;
		System.out.println("3. "+result);
		
		//4.
		int overflow = Integer.MAX_VALUE;
		System.out.println("4. "+overflow);
		
		//5.
		overflow+=1;
		System.out.println("5. "+overflow);
		
		//6.
		System.out.println("6. 값이 int 범위의 최대치인 2,147,483,647보다 커져 가장 작은 숫자인 -2,147,483,648이 되었다.");
		System.out.println("6. 값이 int 범위의 최대치를 넘어가 0111 1111 1111 1111 에 1이 더해져 1000 0000 0000 0000 이 되어 가장 작은수(가장 앞은 부호 비트)가 되었다.");
		
		//7.
		overflow-=1;
		System.out.println("7. "+((long)overflow +1));
		
		//8.
		overflow = Integer.MIN_VALUE;
		System.out.println("8. "+overflow);
		
		//9.
		overflow-=1;
		System.out.println("9. "+overflow);
		
		//10.
		System.out.println("10. 값이 int 범위의 최소치인 -2,147,483,648보다 작아져 가장 큰 숫자인 2,147,483,647이 되었다.");
		System.out.println("10. 값이 int 범위의 최소치를 넘어가 1000 0000 0000 0000 에 1이 빼져 0111 1111 1111 1111이 되어 가장 큰 수가 되었다.");
		
		//11.
		overflow+=1;
		System.out.println("11. "+((long)overflow-1));
		
		//12.
		int divResult = 10/3;
		System.out.println("12. "+divResult);
		
		//13.
		System.out.println("13. 10(int) / 3(int) 의 연산 결과는 항상 int가 나오며, 할당하는 변수 divResult 역시 int형 이기 때문에 3이 나온다.");
		
		//14.
		double divResult2 = 10/3.0;
		System.out.println("14. "+divResult2);
		
		//15.
		boolean isEquals = 1 == 1;
		System.out.println("15. "+isEquals);
		
		//16.
		isEquals = 1 != 1;
		System.out.println("16. "+isEquals);
		
		//17.
		boolean logicalAnd = true && true;
		System.out.println("17. "+logicalAnd);
		
		//18.
		logicalAnd = true && false;
		System.out.println("18. "+logicalAnd);

		//19.
		logicalAnd = false && true;
		System.out.println("19. "+logicalAnd);
		
		//20.
		logicalAnd = false && false;
		System.out.println("20. "+logicalAnd);
		
		//21.
		boolean logicalOr = true || true;
		System.out.println("21. "+logicalOr);
		
		//22.
		logicalOr = true || false;
		System.out.println("22. "+logicalOr);
		
		//23.
		logicalOr = false || true;
		System.out.println("23. "+logicalOr);
		
		//24.
		logicalOr = false || false;
		System.out.println("24. "+logicalOr);
		
		//25.
		int[] scores = new int[5];
		
		//26.
		scores[0] = 90;
		scores[1] = 81;
		scores[2] = 72;
		scores[3] = 63;
		scores[4] = 54;
		
		System.out.println("27. "+"0:"+scores[0]+" 1:"+scores[1]+" 2:"+scores[2]+" 3:"+scores[3]+" 4:"+scores[4]);
		
		//28.
		System.out.print("28.");
		for(int i=0;i<scores.length;i++) {
			System.out.print(" "+i+":"+scores[i]);
		}

		//29.
		System.out.print("\n29. ");
		for (int score : scores) {
			System.out.print(score+" ");
		}
		
		//30.
		int sumArr = scores[0]+scores[1]+scores[2]+scores[3]+scores[4];
		System.out.println("\n30. 합 :"+sumArr);
		
		//31.
		sumArr = 0;
		for(int i=0;i<scores.length;i++) {
			sumArr+=scores[i];
		}
		System.out.println("31. 합 :"+sumArr);
		
		//32.
		sumArr = 0;
		for(int score : scores) {
			sumArr+=score;
		}
		System.out.println("32. 합 :"+sumArr);
		
		//33.
		System.out.print("33. ");
		for(int score : scores) {
			if(score>70) {
				System.out.print(score+" ");
			}
		}
		
		//34.
		System.out.print("\n34. ");
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>30 && scores[i]<=70) {
				System.out.print(scores[i]+" ");
			}
		}
		
		//35.
		List <Integer> scoreList = new ArrayList<>();
		
		//36.
		Random random = new Random();
		for(int i=0;i<10;i++) {
			scoreList.add(random.nextInt(100)+1);
		}
		
		//37.
		System.out.println("\n37. "+"0:"+scoreList.get(0)+" 1:"+scoreList.get(1)+" 2:"+scoreList.get(2)+" 3:"+scoreList.get(3)+" 4:"+scoreList.get(4)
									+" 5:"+scoreList.get(5)+" 6:"+scoreList.get(6)+" 7:"+scoreList.get(7)+" 8:"+scoreList.get(8)+" 9:"+scoreList.get(9));
		
		//38.
		System.out.print("38. ");
		for(int i=0;i<scoreList.size();i++) {
			System.out.print(scoreList.get(i)+" ");
		}
		
		//39.
		System.out.print("\n39. ");
		for(int score : scoreList) {
			System.out.print(score+" ");
		}
		
		//40.
		int sumList = scoreList.get(0)+scoreList.get(1)+scoreList.get(2)+scoreList.get(3)+scoreList.get(4)
					+scoreList.get(5)+scoreList.get(6)+scoreList.get(7)+scoreList.get(8)+scoreList.get(9);
		System.out.println("\n40. "+sumList);

		//41.
		sumList = 0;
		for(int i=0;i<scoreList.size();i++) {
			sumList+=scoreList.get(i);
		}
		System.out.println("41. "+sumList);
		
		//42.
		sumList = 0;
		for(int score : scoreList) {
			sumList += score;
		}
		System.out.println("42. "+sumList);
		
		//43.
		System.out.print("43. ");
		for(int i=0;i<scoreList.size();i++) {
			if(scoreList.get(i)<=50) {
				System.out.print(scoreList.get(i)+" ");
			}
		}
		
		//44.
		System.out.print("\n44. ");
		for(int score : scoreList) {
			if(score<=30 && score>=10){
				System.out.print(score+" ");
			}
		}
		
		//45.
		printHello();
		
		//46.
		printHello("건회");
		
		//47.
		multiplyNumbers(16,17);
		
		//48.
		plusNumbers(15,16,17);
		
		//49.
		System.out.println("49. -95 : "+convertSymbol(-95)+"     78 : "+convertSymbol(78));
		
		//50.
		System.out.println("50. 78 - 95 = "+convertSymbol(78, 95)+"     95 - 78 = "+convertSymbol(95,78));
	
		//51.
		System.out.println("51. "+getLength("벌써 51문제를 해결했습니다."));
		
		//52.
		System.out.println("52. "+plusStrings("벌써 52문제를 ","해결했습니다."));

		//53.
		System.out.println("53. "+getLongText("세글자","네 글자","다섯 글자"));
		
		//54.
		System.out.println("54. "+getSubstring("벌써 54번 문제 입니다.", 3, 9));
		
		//55.
		System.out.println("55. "+isContains("55번 문제입니다.","55번"));
		
		//56.
		System.out.println("56. "+getReplaced("56번 문제를 풀었나요?","풀었나요?","풀었습니다."));
	}
	
}
