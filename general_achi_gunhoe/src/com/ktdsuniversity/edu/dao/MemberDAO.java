package com.ktdsuniversity.edu.dao;

import java.util.List;

import com.ktdsuniversity.edu.vo.MemberVO;

public interface MemberDAO {
	public int create(MemberVO memberVO);
	
	public List<MemberVO> readAll();
	
	public MemberVO read(int index);
	
	public MemberVO read(String Key);
}
