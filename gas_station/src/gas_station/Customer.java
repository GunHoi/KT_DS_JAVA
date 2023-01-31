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
	public void buy(GasStation gasStation, FuelType type, int stock) {
		// 1. type 연료를 stock 만큼 구매할 돈이 있는지 확인한다.
		if(checkMoney(type,stock)) {
			boolean sellResult = gasStation.sell(type, stock);
			// 1-1. 돈은 있는데 주유소에서 판매할 수 없다고 하면 
			//               "연료를 구매할 수 없습니다"를 출력하고 메소드를 끝낸다.
			if(sellResult) {
				// 1-2. 돈이 있다면 연료의 잔량을 stock 만큼 증가시킨다.
				int fuelStock = fuel.getStock();
				fuelStock += stock;
				fuel.setStock(fuelStock);
				int money = (int) (Street.PRICES.get(type) * stock);
				this.pay(gasStation, money);
				this.printResult(gasStation);
			}else { // 돈은 있지만, 연료가 없는 경우
				// 1-3. 돈이 없다면 "연료를 구매할 수 없습니다" 를 출력하고 메소드를 끝낸다.
				System.out.println("연료를 구매할 수 없습니다.");
			}
		}else {	//돈이 없는 경우
			System.out.println("연료를 구매할 수 없습니다.");
		}
		
	}
	
	/**
	 * 지출
	 * @param gasStation 주유소
	 * @param money 구매가격
	 */
	private void pay(GasStation gasStation, int money) {
		// 주유소에게 돈을 지급한다.
		gasStation.addMoney(money);
		// 고객의 돈을 뺀다.
		this.money -= money;
	}
	
	/**
	 * 주유하기에 충분한 돈을 가지고 있는지 확인한다.
	 * @param type 주유할 연료종류 (gasolin, diesel, lpg)
	 * @param stock (주유량)
	 * @return 주유가 가능한 돈을 가지고 있다면 true, 아니면 false
	 */
	private boolean checkMoney(FuelType type, int stock) {
		return Street.PRICES.get(type) * stock <= money;
	}
	
	private void printResult(GasStation gasStation) {
		System.out.println("주유소에 남은 연료 잔량");
		for(int i=0;i<gasStation.getFuelList().size();i++) {
			System.out.println(gasStation.getFuelList().get(i).getType()+": "+gasStation.getFuelList().get(i).getStock());
		}
		System.out.println("주유소 보유 금액 : "+gasStation.getMoney()+"\n");
		System.out.println("구매자의 연료종류: "+this.getFuel().getType()+"  구매자의 연료 잔량 : "+this.getFuel().getStock()+"  남은 금액 : "+this.getMoney());
	}
}
