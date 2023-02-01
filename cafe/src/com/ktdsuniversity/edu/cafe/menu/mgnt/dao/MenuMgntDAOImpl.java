package com.ktdsuniversity.edu.cafe.menu.mgnt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public class MenuMgntDAOImpl implements MenuMgntDAO {
	
	/**
	 * 각 종류 별 리스트
	 * ex) 카페 - 아메리카노, 카페라떼, 에스프레소, ... etc
	 */
	private List <MenuMgntVO> menuList = new ArrayList<>();
	
	// 음료 종류별로 리스트를 만들어야하나?? 다른 방법은 없을까?
	
	/**
	 * 각 종류가 들어갈 맵
	 * <Integer : 1(커피) , List<MenuMgntVO> : 아메리카노, 카페라떼, 에스프레소, ...>
	 */
	private Map<Integer, List<MenuMgntVO>> dataSource;
	
	public MenuMgntDAOImpl() {
		dataSource = new HashMap<>();
	}

	@Override
	public int create(int itemType, MenuMgntVO menuMgntVO) {
		menuList.add(menuMgntVO);
		dataSource.put(itemType, menuList);
		return 1;
	}

	@Override
	public List<MenuMgntVO> read(int itemType) {
		return dataSource.get(itemType);
	}
}
