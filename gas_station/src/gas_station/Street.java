package gas_station;

import java.util.HashMap;
import java.util.Map;

public class Street {
	
	public static final Map<FuelType, Double> PRICES;
	
	static {
		PRICES = new HashMap<>();
		PRICES.put(FuelType.GASOLIN,1569.67);
		PRICES.put(FuelType.DIESEL,1651.15);
		PRICES.put(FuelType.LPG,1039.35);
	}
	
	public static void main(String[] args) {
		
		GasStation gasStation = new GasStation();
		
		Customer customer = new Customer();
		customer.setFuel(new Fuel(FuelType.DIESEL,50));
		customer.setMoney(1_000_000);
		
		customer.buy(gasStation, FuelType.DIESEL, 500);
	}

}
