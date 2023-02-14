package com.ktdsuniversity.edu.infext;

public class VipMemberServiceImpl extends MemberServiceImpl implements VipMemberService{

	@Override
	public void regist() {
		System.out.print("VIP ");
		super.regist();
		addPoint(1000);
	}

	@Override
	public void unregist() {
		System.out.print("VIP ");
		super.unregist();
	}

	@Override
	public void updateMyInfo() {
		System.out.print("VIP ");
		super.updateMyInfo();
		addPoint(50);
	}

	@Override
	public void addPoint(int point) {
		System.out.println(point + "점이 지급되었습니다.");
	}
	
}
