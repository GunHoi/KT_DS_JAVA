package class_test;

public class ScoreCalculator {
	
	//전역변수 = 멤버변수 = 인스턴스 필드
	// 수학 점수
	int mathScore = 91;
	// 물리 점수
	int physicScore = 32;
	// 영어 점수
	int engScore = 72;
	// 프로그래밍 점수
	int progScore = 100;
	// 총합 점수
	
	/**
	 * 4과목의 평균을 계산한다.
	 */
	public void getAverage() {
		int sumScore = mathScore + physicScore + engScore + progScore;
		double avgScore = sumScore / 4.0;
		System.out.println("수학,물리,영어,프로그래밍의 평균 점수는 " + avgScore + "입니다.");
	}
	
	/**
	 *  성적 등급을 계산한다.
	 */
	public void getGrade() {
		int sumScore = mathScore + physicScore + engScore + progScore;
		double avgScore = sumScore / 4.0;
		
		String grade = "";
		
		if(avgScore >= 90) {
			grade = "A";
		}else if(avgScore >= 80) {
			grade = "B";
		}else if(avgScore >= 70) {
			grade = "C";
		}else if(avgScore >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("등급은? "+grade);
	}

}
