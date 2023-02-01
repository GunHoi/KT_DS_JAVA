package address_book;

public class AddressHandler {

	private Address address1;
	
	/**
	 * 주소록 추가
	 */
	public void create() {
		address1 = new Address();
		address1.setName("홍길동");
		address1.setPhoneNumber("010-1234-5678");
		address1.setAddress("대한민국");
	}
	
	public void update() {
		address1.setName("길동");
	}
	
	public void delete() {
		address1 = null;
	}
	
	public void read() {
		System.out.println("이름: "+address1.getName());
		System.out.println("전화번호: "+address1.getPhoneNumber());
		System.out.println("주소: "+address1.getAddress());
	}
	
	public static void main(String[] args) {
		AddressHandler addressHandler = new AddressHandler();
		addressHandler.create();
		addressHandler.read();
		addressHandler.update();
		addressHandler.read();
		addressHandler.delete();
		addressHandler.read();		
	}

}
