package gas_station;

/**
 * 연료
 * 
 * @author gunhoe
 *
 */
public class Fuel {
	
	/**
	 * 연료 종류 휘발유, 경유, LPG
	 */
	private String type;
	/**
	 * 연료 잔량
	 */
	private int stock;
	
	//생성자
	public Fuel(String type, int stock) {
		setType(type);
		setStock(stock);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
