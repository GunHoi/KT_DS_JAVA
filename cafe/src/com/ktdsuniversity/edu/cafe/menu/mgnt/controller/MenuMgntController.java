package com.ktdsuniversity.edu.cafe.menu.mgnt.controller;


import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntService;
import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntServiceImpl;
import com.ktdsuniversity.edu.cafe.menu.mgnt.util.MenuHandler;

public class MenuMgntController {

	public static void main(String[] args) {

		MenuHandler menuHandler = new MenuHandler();
		// MenuMgntService service = MenuMgntServiceImpl.get();	 SingleTon Pattern
		MenuMgntService service = new MenuMgntServiceImpl();
		
		System.out.println("Cafe Menu Management System");
		menuHandler.start(service);
	}
}