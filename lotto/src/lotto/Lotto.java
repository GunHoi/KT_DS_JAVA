package lotto;

public class Lotto {
	
	public static void main(String[] args) {
		
		int[] lottoArray = new int[6];
		lottoArray[0] = 5;
		lottoArray[1] = 15;
		lottoArray[2] = 27;
		lottoArray[3] = 34;
		lottoArray[4] = 36;
		lottoArray[5] = 41;
		
		// 전통적인 for
		for(int index = 0; index < lottoArray.length; index+=1) {
			System.out.println("index: "+index+" = "+lottoArray[index]);
		}
		
		// 성능이 빠른 foreach
		for(int lotto:lottoArray) {
			System.out.println(lotto);
		}
		
		
		String string = "26. 대대전술단은 1개 전차중대(탱크 10대), 3개 기계화 보병중대(장갑차 40대), 1개 대전차중대와 3개의 포병중대(자주포나 다연장로켓 운영), 1개 방공중대의 편제로 구성이 됨. \r\n"
				+ "[출처] 러시아 vs 우크라이나 전쟁 근황|작성자 메르";
		
		String[] wordArray = string.split(" ");
		System.out.println("\n일반 for문");
		for(int i = 0;i<wordArray.length;i++) {
			System.out.print(wordArray[i]);
		}
		System.out.println("\n\nforeach문");
		for(String word : wordArray) {
			System.out.print(word);
		}
		
		
		//홀수
		System.out.println("\n\n홀수");
		for(int i=0;i<=100;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
		//짝수
		System.out.println("\n짝수");
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
	}
}
