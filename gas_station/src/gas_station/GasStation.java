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
		
	}
	
	/**
	 * 수입
	 * @param money 구매가격
	 */
	public void addMoney(int money) {
		
	}
	
	/**
	 * type 연료가 stock 만큼 주유가능한지 확인
	 * @param type 연료종류
	 * @param stock 주유량
	 * @return 연료의 양이 stock 이상이면 true, 아니면 false
	 */
	public boolean checkStock(String type, int stock) {
		
		return false;
	}
}
