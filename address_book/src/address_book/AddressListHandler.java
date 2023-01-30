package address_book;

import java.util.ArrayList;
import java.util.List;

public class AddressListHandler {
	private List<Address> addressList = new ArrayList<>(); 
	
	public void create(String name, String phoneNumber, String address) {
		Address addr = new Address();
		addr.setName(name);
		addr.setPhoneNumber(phoneNumber);
		addr.setAddress(address);
		addressList.add(addr);
	}	
	
	public void update(int index, String name, String phoneNumber, String address) {
		Address addr = addressList.get(index);
		addr.setName(name);
		addr.setPhoneNumber(phoneNumber);
		addr.setAddress(address);
	}
	
	public void delete(int index) {
		addressList.remove(index);
	}
	
	public void read(int index) {
		Address addr = addressList.get(index);
		System.out.println("이름 : "+addr.getName());
		System.out.println("전화번호 : "+addr.getPhoneNumber());
		System.out.println("주소 : "+addr.getAddress()+"\n");
	}
	
	/**
	 * 전통적 for를 이용해 반복
	 */
	public void readAllFor() {
		for(int i=0;i<addressList.size();i++) {
			read(i);
//			System.out.println("이름 : "+addressList.get(i).getName());
//			System.out.println("전화번호 : "+addressList.get(i).getPhoneNumber());
//			System.out.println("주소 : "+addressList.get(i).getAddress()+"\n");
		}
	}
	/**
	 * for-each를 이용해 반복
	 */
	public void readAllForeach() {
		for(Address addr : addressList) {
			System.out.println("이름 : "+addr.getName());
			System.out.println("전화번호 : "+addr.getPhoneNumber());
			System.out.println("주소 : "+addr.getAddress()+"\n");
		}
	}
	/**
	 * List의 forEach를 이용해 반복
	 */
	public void readAllListForeach() {
		addressList.forEach((addr)->{
			System.out.println("이름 : "+addr.getName());
			System.out.println("전화번호 : "+addr.getPhoneNumber());
			System.out.println("주소 : "+addr.getAddress()+"\n");
		});
	}
	
	public static void main(String[] args) {
		AddressListHandler handler = new AddressListHandler();
		
		handler.create("이름1", "010-1111-1111", "서울");
		handler.create("이름2", "010-2222-2222", "서울");
		handler.create("이름3", "010-3333-3333", "서울");
		handler.create("이름4", "010-4444-4444", "서울");
		
		handler.read(0);
		handler.read(1);
		handler.read(2);
		handler.read(3);
		
		handler.update(0, "이름0", "010-0000-0000", "인천");
		handler.read(0);
		
		handler.delete(0);
		handler.read(0);
		
		System.out.println("----------FOR----------");
		handler.readAllFor();
		System.out.println("----------For-EACH----------");
		handler.readAllForeach();
		System.out.println("----------LIST FOR EACH----------");
		handler.readAllListForeach();
	}
}
