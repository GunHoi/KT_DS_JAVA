package hello_java;

/**
 * 
 * @author gunhoe
 * @since `23.01.18
 */
public class Average_Calculator {
	
	/**
	 * 4과목의 점수를 받아와 총점을 반환한다.
	 * @return 4과목의 총합 점수
	 */
	public static int getScore() {

		// 수학 점수
		int mathScore = 91;
		// 물리 점수
		int physicScore = 32;
		// 영어 점수
		int engScore = 72;
		// 프로그래밍 점수
		int progScore = 100;
		// 총합 점수
		int sumScore = mathScore + physicScore + engScore + progScore;
		
		return sumScore;
	}

	/**
	 * 4과목의 평균을 계산한다.
	 * @param 총점을 파라미터로 받는다.
	 */
	public static void calcAvg(int sumScore) {

		// 평균 점수
		// double avgScore = (double) sumScore / 4;
		double avgScore = sumScore / 4.0;

		System.out.println("수학,물리,영어,프로그래밍의 평균 점수는 " + avgScore + "입니다.");
	}

	public static void main(String[] args) {
		
		int sumScore = getScore();
		calcAvg(sumScore);
	}

}
