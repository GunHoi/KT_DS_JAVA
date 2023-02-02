package com.ktdsuniversity.edu.service;

import java.util.List;

import com.ktdsuniversity.edu.dao.ListMemberDAOImpl;
//import com.ktdsuniversity.edu.dao.MapMemberDAOImpl;
import com.ktdsuniversity.edu.dao.MemberDAO;
import com.ktdsuniversity.edu.vo.MemberVO;

public class SecondMemberServiceImpl implements MemberService{
	
	private MemberDAO memberDAO;
	
	public SecondMemberServiceImpl() {
		memberDAO = new ListMemberDAOImpl();
		//memberDAO = new MapMemberDAOImpl();
	}
	
	@Override
	public boolean create(MemberVO memberVO) {
		System.out.println("SecondMemberServiceImpl.create");
		return memberDAO.create(memberVO) > 0;
	}

	@Override
	public List<MemberVO> readAll() {
		System.out.println("SecondMemberServiceImpl.readAll");
		return memberDAO.readAll();
	}

	@Override
	public MemberVO read(int index) {
		return memberDAO.read(index);
	}

	@Override
	public MemberVO read(String Key) {
		return memberDAO.read(Key);
	}

}
