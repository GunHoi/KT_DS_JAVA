package com.ktdsuniversity.edu.cafe.menu.mgnt.dao;

import java.util.List;

import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public interface MenuMgntDAO {
	public int create(int itemType,MenuMgntVO menuMgntVO);
	
	public List<MenuMgntVO> read(int itemType);
	
}
