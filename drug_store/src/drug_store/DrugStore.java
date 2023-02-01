package drug_store;

/**
 * 약국
 * @author gunhoe
 *
 */
public class DrugStore {
	
	/** 
	 * 감기환자
	 */
	Customer cold = new Customer();
	/**
	 * 콧물환자
	 */
	Customer runnyNose = new Customer();
	/**
	 * 근육통환자
	 */
	Customer musclePain = new Customer();
	
	/**
	 * 방문한다.
	 */
	public void visit() {
		cold.name = "장민창";
		cold.sympoton = "감기";
		
		runnyNose.name = "홍길동";
		runnyNose.sympoton = "콧물";
		
		musclePain.name = "철수";
		musclePain.sympoton = "근육통";
	}
	
	/**
	 * 처방한다.
	 */
	public void prescribe() {
		if(cold.sympoton.equals("감기")) {
			System.out.println(cold.name+"님 "+cold.sympoton+"증상이 있으셔서 종합감기약 처방해드립니다.");
		}else if(cold.sympoton.equals("콧물")){
			System.out.println(cold.name+"님 "+runnyNose.sympoton+"증상이 있으셔서 코막힘약 처방해드립니다.");
		}else {
			System.out.println(cold.name+"님 "+musclePain.sympoton+"증상이 있으셔서 근육이완제 처방해드립니다.");
		}
		
		if(runnyNose.sympoton.equals("감기")) {
			System.out.println(runnyNose.name+"님 "+cold.sympoton+"증상이 있으셔서 종합감기약 처방해드립니다.");
		}else if(runnyNose.sympoton.equals("콧물")){
			System.out.println(runnyNose.name+"님 "+runnyNose.sympoton+"증상이 있으셔서 코막힘약 처방해드립니다.");
		}else {
			System.out.println(runnyNose.name+"님 "+musclePain.sympoton+"증상이 있으셔서 근육이완제 처방해드립니다.");
		}
		
		if(musclePain.sympoton.equals("감기")) {
			System.out.println(musclePain.name+"님 "+cold.sympoton+"증상이 있으셔서 종합감기약 처방해드립니다.");
		}else if(musclePain.sympoton.equals("콧물")){
			System.out.println(musclePain.name+"님 "+runnyNose.sympoton+"증상이 있으셔서 코막힘약 처방해드립니다.");
		}else {
			System.out.println(musclePain.name+"님 "+musclePain.sympoton+"증상이 있으셔서 근육이완제 처방해드립니다.");
		}
	}
}
