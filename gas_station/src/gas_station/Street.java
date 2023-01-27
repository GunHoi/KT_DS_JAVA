package gas_station;

public class Street {
	
	/**
	 * 가솔린 리터당 가격
	 */
	public static final double GASOLIN_PRICE = 1569.67;
	/**
	 * 경유 리터당 가격
	 */
	public static final double DIESEL_PRICE = 1651.15;
	/**
	 * LPG 리터당 가격
	 */
	public static final double LPG_PRICE = 1039.35;
	
	public static void main(String[] args) {
		
		GasStation gasStation = new GasStation();
		Fuel gasolin = new Fuel();
		gasolin.setType("gasolin");
		gasolin.setStock(6000);
		
		Fuel diesel = new Fuel();
		diesel.setType("diesel");
		diesel.setStock(1000);
		
		Fuel lpg = new Fuel();
		lpg.setType("lpg");
		lpg.setStock(500);
		
		gasStation.setGasolin(gasolin);
		gasStation.setDiesel(diesel);
		gasStation.setLpg(lpg);
		gasStation.setMoney(5_000_000);
		
		Customer customer = new Customer();
		
		Fuel customerFuel = new Fuel();
		customerFuel.setType("diesel");
		customerFuel.setStock(50);
		
		customer.setFuel(customerFuel);
		customer.setMoney(1_000_000);
		
		customer.buy(gasStation, "diesel", 500);
	}

}
