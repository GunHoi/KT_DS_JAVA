package com.ktdsuniversity.edu.cafe.menu.mgnt.service;

import java.util.List;

import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public interface MenuMgntService {

	public boolean create(int itemType,MenuMgntVO menuMgntVO);
	
	public List<MenuMgntVO> read(int itemType);
}
