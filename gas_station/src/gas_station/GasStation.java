package gas_station;

public class GasStation {

	private Fuel gasolin;
	private Fuel diesel;
	private Fuel lpg;
	private int money;

	public Fuel getGasolin() {
		return gasolin;
	}

	public void setGasolin(Fuel gasolin) {
		this.gasolin = gasolin;
	}

	public Fuel getDiesel() {
		return diesel;
	}

	public void setDiesel(Fuel diesel) {
		this.diesel = diesel;
	}

	public Fuel getLpg() {
		return lpg;
	}

	public void setLpg(Fuel lpg) {
		this.lpg = lpg;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * 판매
	 * @param type 연료 종류 (gasolin, diesel, lpg)
	 * @param stock 판매량
	 */
	public void sell(String type, int stock) {
		// 1. type 연료가 stock만큼 존재하는지 확인한다.
		if(checkStock(type, stock)) {
			// 1-1. 연료가 충분하다면 type 연료의 잔량을 stock 만큼 줄인다. 
			if(gasolin.getType().equals(type)) {
				int fuelStock = gasolin.getStock();
				fuelStock -= stock;
				gasolin.setStock(fuelStock);
				//test(gasolin, stock); 을 이용하면 반복되는 위의 3코드를 묶을 수 있다.
			}else if(diesel.getType().equals(type)) {
				int fuelStock = diesel.getStock();
				fuelStock -= stock;
				diesel.setStock(fuelStock);
			}else if(lpg.getType().equals(type)) {
				int fuelStock = lpg.getStock();
				fuelStock -= stock;
				lpg.setStock(fuelStock);
			}
		} else {
			// 1-2. 연료가 부족하다면 "연료가 부족합니다"를 출력하고 메소드를 종료한다.
			System.out.println("연료가 부족합니다.");
		}
		
	}
	
//  sell 메소드의 반복되는 3코드를 묶을 수 있다.
//	public void test(Fuel fuel, int stock) {
//		int fuelStock = fuel.getStock();
//		fuelStock -= stock;
//		fuel.setStock(fuelStock);
//	}
	
	/**
	 * 수입
	 * @param money 구매가격
	 */
	public void addMoney(int money) {
		// 1. money 파라미터의 값을 인스턴스 변수 money에 더한다.
		this.money += money;
	}
	
	/**
	 * type 연료가 stock 만큼 주유가능한지 확인
	 * @param type 연료종류
	 * @param stock 주유량
	 * @return 연료의 양이 stock 이상이면 true, 아니면 false
	 */
	public boolean checkStock(String type, int stock) {
		boolean result = false;
		if(gasolin.getType().equals(type)) {
			result = gasolin.getStock() >= stock;
		}
		else if(diesel.getType().equals(type)) {
			result = diesel.getStock() >= stock;
		}
		else if(lpg.getType().equals(type)) {
			result = lpg.getStock() >= stock;
		}
			
		return result;
	}
}
