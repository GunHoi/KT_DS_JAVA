package address_book;

/**
 * 주소를 최대 5개만 저장할 수 있는 주소록
 * 
 * @author guhoe
 */
public class AddressArrayHandler {
	
	//배열의 정의 방법
	//타입[] 변수명 = new 타입[몇 개];
	//int[] arrays = new int[5];
	private Address[] addressArray = new Address[5];
	
	public void create(int index, String name, String phoneNumber, String address) {
		addressArray[index] = new Address();
		addressArray[index].setName(name);
		addressArray[index].setPhoneNumber(phoneNumber);
		addressArray[index].setAddress(address);
	}
	
	public void update(int index, String name, String phoneNumber, String address) {
		addressArray[index].setName(name);
		addressArray[index].setPhoneNumber(phoneNumber);
		addressArray[index].setAddress(address);
	}
	
	public void delete(int index) {
		addressArray[index] = null;
	}
	
	public void read(int index) {
		if(addressArray.length > index) {
			System.out.println("이름: "+addressArray[index].getName());
			System.out.println("전화번호: "+addressArray[index].getPhoneNumber());
			System.out.println("주소: "+addressArray[index].getAddress()+"\n");	
		}	
	}

	public static void main(String[] args) {
		AddressArrayHandler handler = new AddressArrayHandler();
		
		handler.create(0, "홍", "010-0101-0101", "한국1");
		handler.create(1, "김", "010-0202-0202", "한국2");
		handler.create(2, "이", "010-0303-0303", "한국3");
		handler.create(3, "박", "010-0404-0404", "한국4");
		handler.create(4, "최", "010-0505-0505", "한국5");
		
		handler.read(0);
		handler.read(1);
		handler.read(2);
		handler.read(3);
		handler.read(4);
	}
}
