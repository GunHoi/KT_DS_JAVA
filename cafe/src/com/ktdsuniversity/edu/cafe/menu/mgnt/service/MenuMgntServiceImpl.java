package com.ktdsuniversity.edu.cafe.menu.mgnt.service;

import java.util.List;

import com.ktdsuniversity.edu.cafe.menu.mgnt.dao.MenuMgntDAO;
import com.ktdsuniversity.edu.cafe.menu.mgnt.dao.MenuMgntDAOImpl;
import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public class MenuMgntServiceImpl implements MenuMgntService{

	private MenuMgntDAO menuMgntDAO;
	
	public MenuMgntServiceImpl() {
		menuMgntDAO = new MenuMgntDAOImpl();
	}

	@Override
	public boolean create(int itemType, MenuMgntVO menuMgntVO) {
		return menuMgntDAO.create(itemType, menuMgntVO) > 0;
	}

	@Override
	public List<MenuMgntVO> read(int itemType) {
		return menuMgntDAO.read(itemType);
	}
}
