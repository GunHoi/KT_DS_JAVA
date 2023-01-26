package store;

/**
 * 편의점
 * 
 * @author gunhoe
 *
 */
public class Store {

	/**
	 * 멤버변수(인스턴스 필드) 물 선언
	 */
	Product water = new Product();
	/**
	 * 멤버변수(인스턴스 필드) 과자 선언
	 */
	Product snack = new Product();
	/**
	 * 멤버변수(인스턴스 필드) 음료 선언
	 */
	Product drink = new Product();

	/**
	 * 제품을 입고한다.
	 */
	public void addProducts() {
		drink.name = "콜라";
		drink.quantity = 10;
	
		snack.name = "홈런볼";
		snack.quantity = 0;
		
		water.name = "삼다수";
		water.quantity = 1;
	}
	
	/**
	 * 재고 확인 재고를 확인해서 개수를 출력한다.
	 */
	public void checkQuantity() {

		// 재고가 2개 이상일 경우 : "물건 명" 제품은 재고가 8개 있습니다.
		// 재고가 0개 인 경우 : "물건 명" 제품은 품절 되었습니다.
		// 재고가 1개 인 경우 : "물건 명" 제품은 재고가 1개 있습니다. 재주문이 필요합니다.

		String productName = water.name;
		int productQuantity = water.quantity;

		boolean outOfStock = productQuantity == 0;
		boolean needOrder = productQuantity == 1;

		if (outOfStock) {
			System.out.printf("%s 제품은 품절 되었습니다.\n", productName);
		} else if (needOrder) {
			System.out.println(productName + "제품은 " + productQuantity + "개 있습니다. 재주문이 필요합니다.");
		} else {
			System.out.println(productName + "제품은 재고가 " + productQuantity + "개 있습니다.");
		}

		productName = snack.name;
		productQuantity = snack.quantity;

		outOfStock = productQuantity == 0;
		needOrder = productQuantity == 1;

		if (outOfStock) {
			System.out.printf("%s 제품은 품절 되었습니다.\n", productName);
		} else if (needOrder) {
			System.out.println(productName + "제품은 " + productQuantity + "개 있습니다. 재주문이 필요합니다.");
		} else {
			System.out.println(productName + "제품은 재고가 " + productQuantity + "개 있습니다.");
		}

		productName = drink.name;
		productQuantity = drink.quantity;

		outOfStock = productQuantity == 0;
		needOrder = productQuantity == 1;

		if (outOfStock) {
			System.out.printf("%s 제품은 품절 되었습니다.\n", productName);
		} else if (needOrder) {
			System.out.println(productName + "제품은 " + productQuantity + "개 있습니다. 재주문이 필요합니다.");
		} else {
			System.out.println(productName + "제품은 재고가 " + productQuantity + "개 있습니다.");
		}
	}

}
