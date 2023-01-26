package store;

/**
 * 실행 클래스
 * @author gunhoe
 *
 */
public class Main {

	//편의점 변수(인스턴스 | 객체)
	Store store = new Store();

	public static void main(String[] args) {
		Main main = new Main();
		main.store.addProducts();
		main.store .checkQuantity();
	}
}
