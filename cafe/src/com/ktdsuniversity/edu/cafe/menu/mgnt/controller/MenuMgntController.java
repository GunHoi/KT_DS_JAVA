package com.ktdsuniversity.edu.cafe.menu.mgnt.controller;

import java.util.List;

import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntService;
import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntServiceImpl;
import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public class MenuMgntController {
	
	public static void main(String[] args) {
		MenuMgntService service = new MenuMgntServiceImpl();
		MenuMgntVO mgnt = new MenuMgntVO();
		
		mgnt.setItemName("아메리카노");
		service.create(1, mgnt);
		
		mgnt = new MenuMgntVO();
		mgnt.setItemName("카페라떼");
		service.create(1, mgnt);
		
		mgnt = new MenuMgntVO();
		mgnt.setItemName("에스프레소");
		service.create(1, mgnt);
		
		mgnt = new MenuMgntVO();
		mgnt.setItemName("스무디");
		service.create(2, mgnt);
		
		mgnt = new MenuMgntVO();
		mgnt.setItemName("프라페");
		service.create(2, mgnt);
		
	//	System.out.println(service.read(0));
		System.out.println(service.read(1).get(0).getItemName());
		System.out.println(service.read(2).get(0).getItemName());
		System.out.println(service.read(2).get(4).getItemName());
		
	}

	
	
}
