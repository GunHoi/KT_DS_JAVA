package gas_station;

public class Customer {

	/**
	 * 연료
	 */
	private Fuel fuel;
	/**
	 * 자본금
	 */
	private int money;

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * 주유소에서 연료를 구입한다.
	 * @param gasStation 주유소
	 * @param type 연료 종류 (gasolin, diesel, lpg)
	 * @param stock 구매량
	 */
	public void buy(GasStation gasStation, String type, int stock) {
		
	}
	
	/**
	 * 지출
	 * @param gasStation 주유소
	 * @param money 구매가격
	 */
	public void pay(GasStation gasStation, int money) {
		
	}
	
	/**
	 * 주유하기에 충분한 돈을 가지고 있는지 확인한다.
	 * @param type 주유할 연료종류 (gasolin, diesel, lpg)
	 * @param stock (주유량)
	 * @return 주유가 가능한 돈을 가지고 있다면 true, 아니면 false
	 */
	public boolean checkMoney(String type, int stock) {
		return false;
	}
}
