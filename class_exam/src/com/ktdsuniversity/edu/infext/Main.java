package com.ktdsuniversity.edu.infext;

public class Main {
	
	public static void memberManage(MemberService memberService) {
		memberService.regist();
		memberService.updateMyInfo();
		memberService.unregist();

//		if(memberService instanceof VipMemberService) {
//			VipMemberService vipMemberService = (VipMemberService) memberService;
//			vipMemberService.addPoint(500);
//			((VipMemberService) memberService).addPoint(500);
//		}
	}
	
	// 필요 없는 코드가 된다.
//	public static void vipMemberManage(VipMemberService memberService) {
//		memberService.regist();
//		memberService.updateMyInfo();
//		memberService.addPoint(50);
//		memberService.unregist();
//	}
	
	public static void main(String[] args) {
		
		// Sub Class is a Super Class
		MemberService memberService = new MemberServiceImpl();
//		memberService.regist();
//		memberService.updateMyInfo();
//		memberService.unregist();
		memberManage(memberService);
		
		VipMemberService vipMemberService = new VipMemberServiceImpl();
		memberManage(vipMemberService);
		
//		vipMemberService.regist();
//		vipMemberService.updateMyInfo();
//		vipMemberService.unregist();
//		vipMemberService.addPoint(100);		//MemberService에는 없기 때문에 사용 불가능
	}
}
