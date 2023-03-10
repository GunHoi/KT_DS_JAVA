package com.ktdsuniversity.edu.mv;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.mv.cmmncd.service.CmmnCdService;
import com.ktdsuniversity.edu.mv.cmmncd.service.CmmnCdServiceImpl;
import com.ktdsuniversity.edu.mv.cmmncd.vo.CmmnCdVO;
import com.ktdsuniversity.edu.mv.cmpn.service.CmpnService;
import com.ktdsuniversity.edu.mv.cmpn.service.CmpnServiceImpl;
import com.ktdsuniversity.edu.mv.cmpn.vo.CmpnVO;
import com.ktdsuniversity.edu.mv.fmsln.service.FmsLnService;
import com.ktdsuniversity.edu.mv.fmsln.service.FmsLnServiceImpl;
import com.ktdsuniversity.edu.mv.fmsln.vo.FmsLnVO;
import com.ktdsuniversity.edu.mv.gnr.controller.GnrController;
import com.ktdsuniversity.edu.mv.gnr.service.GnrService;
import com.ktdsuniversity.edu.mv.gnr.service.GnrServiceImpl;
import com.ktdsuniversity.edu.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.mv.mv.service.MvService;
import com.ktdsuniversity.edu.mv.mv.service.MvServiceImpl;
import com.ktdsuniversity.edu.mv.mv.vo.MvVO;
import com.ktdsuniversity.edu.mv.mv.vo.PrdcPrtcptnCmpnVO;
import com.ktdsuniversity.edu.mv.mv.vo.PrdcPrtcptnPplVO;
import com.ktdsuniversity.edu.mv.mvppl.service.MvPplService;
import com.ktdsuniversity.edu.mv.mvppl.service.MvPplServiceImpl;
import com.ktdsuniversity.edu.mv.mvppl.vo.MvPplVO;
import com.ktdsuniversity.edu.mv.ntn.service.NtnService;
import com.ktdsuniversity.edu.mv.ntn.service.NtnServiceImpl;
import com.ktdsuniversity.edu.mv.ntn.vo.NtnVO;
import com.ktdsuniversity.edu.mv.pctr.service.PctrService;
import com.ktdsuniversity.edu.mv.pctr.service.PctrServiceImpl;
import com.ktdsuniversity.edu.mv.pctr.vo.PctrVO;
import com.ktdsuniversity.edu.mv.rtng.service.RtngService;
import com.ktdsuniversity.edu.mv.rtng.service.RtngServiceImpl;
import com.ktdsuniversity.edu.mv.rtng.vo.RtngVO;
import com.ktdsuniversity.edu.mv.vd.service.VdService;
import com.ktdsuniversity.edu.mv.vd.service.VdServiceImpl;
import com.ktdsuniversity.edu.mv.vd.vo.VdVO;

public class NaverMv implements GnrController{

	public static void main(String[] args){
		NaverMv nm = new NaverMv();
		boolean createResult = false;
		
		GnrService gnrService = new GnrServiceImpl();
		GnrVO gnrVO = new GnrVO();
		gnrVO.setGnrNm("범죄");
//		createResult = gnrService.createGnr(gnrVO);
//		System.out.println("범죄 장르 등록 " + createResult);
//		
		NtnService ntnService = new NtnServiceImpl();
		NtnVO ntnVO = new NtnVO();
		ntnVO.setNtnNm("대한민국");
//		createResult = ntnService.createNtn(ntnVO);
//		System.out.println("대한민국 국가 등록 " + createResult);
//		
		MvPplService mvPplService = new MvPplServiceImpl();
		MvPplVO mvPplVO = new MvPplVO();
		mvPplVO.setPrflPctr("Profile Photo URL");
		mvPplVO.setNm("최지영");
		mvPplVO.setRlNm(null);
//		createResult = mvPplService.createMyPpl(mvPplVO);
//		System.out.println("최지영 영화인 등록 " + createResult);
//		
		CmpnService cmpnService = new CmpnServiceImpl();
		CmpnVO cmpnVO = new CmpnVO();
		cmpnVO.setCmpnNm("(주)누리픽쳐스");
//		createResult = cmpnService.createCmpn(cmpnVO);
//		System.out.println("(주)누리픽쳐스 회사 등록 " + createResult);
//		
		CmmnCdService cmmnCdService = new CmmnCdServiceImpl();
		CmmnCdVO cmmnCdVO = new CmmnCdVO();
		cmmnCdVO.setCdId("002_03");
		cmmnCdVO.setCdNm("12세 관람가");
		cmmnCdVO.setPrcdncCdId("002");
//		createResult = cmmnCdService.createCmmnCd(cmmnCdVO);
//		System.out.println("001 상영상태 회사 등록 " + createResult);
		
		MvService mvService = new MvServiceImpl();
		MvVO mvVO = new MvVO();
		mvVO.setMvTtl("새로운 영화");
		mvVO.setEngTtl("New Movie");
		mvVO.setScrnStt("001_01");
		mvVO.setScrnTm(120);
		mvVO.setOpngDt("20230308");
		mvVO.setGrd("002_04");
		mvVO.setPstr("URL");
		mvVO.setSmr("줄거리");
		
		List<GnrVO> gnrList = new ArrayList<>();
//		GnrVO gnrVO = new GnrVO();
		gnrVO.setGnrId(2);
		gnrList.add(gnrVO);
		mvVO.setGnrList(gnrList);
		
		List<NtnVO> ntnList = new ArrayList<>();
//		NtnVO ntnVO = new NtnVO();
		ntnVO.setNtnId(2);
		ntnList.add(ntnVO);
		mvVO.setNtnList(ntnList);
		
		List<PrdcPrtcptnCmpnVO> cmpnList = new ArrayList<>();
		PrdcPrtcptnCmpnVO prdcPrtcptnCmpnVO = new PrdcPrtcptnCmpnVO();
		prdcPrtcptnCmpnVO.setCmpnId("CO-20230308-00002");
		prdcPrtcptnCmpnVO.setCrcltnCd("006_001");
//		cmpnList.add(prdcPrtcptnCmpnVO);
		
		prdcPrtcptnCmpnVO.setCmpnId("CO-20230308-00002");
		prdcPrtcptnCmpnVO.setCrcltnCd("006_002");
//		cmpnList.add(prdcPrtcptnCmpnVO);

		mvVO.setCmpnList(cmpnList);
		
		List<PrdcPrtcptnPplVO> mvPplList = new ArrayList<>();
		PrdcPrtcptnPplVO prdcPrtcptnPplVO = new PrdcPrtcptnPplVO();
		prdcPrtcptnPplVO.setMvPplId("PD-20230308-00006");
		prdcPrtcptnPplVO.setMssn("005_02");
		prdcPrtcptnPplVO.setRspnsbltRolNm(null);
		mvPplList.add(prdcPrtcptnPplVO);
		mvVO.setMvPplList(mvPplList);
		
//		mvService.createMv(mvVO);
		
		PctrService pctrService = new PctrServiceImpl();
		PctrVO pctrVO = new PctrVO();
		pctrVO.setMvId("MV-20230309-00030");
		pctrVO.setTp("003_01");
		pctrVO.setThmbnlPctr("URL");
		pctrVO.setOrgnlPctr("OriginalPhoto");
//		createResult = pctrService.createPctr(pctrVO);
//		System.out.println("사진 등록 " + createResult);
//		
		VdService vdService = new VdServiceImpl();
		VdVO vdVO = new VdVO();
		vdVO.setMvId("MV-20230309-00030");
		vdVO.setVdTp("004_01");
		vdVO.setVdTtl("리뷰 예고편");
		vdVO.setThmbnl("URL");
		vdVO.setVdUrl("Video Url");
//		createResult = vdService.creatdVd(vdVO);
//		System.out.println("동영상 등록 " + createResult);
//		
		RtngService rtngService = new RtngServiceImpl();
		RtngVO rtngVO = new RtngVO();
		rtngVO.setMvId("MV-20230309-00030");
		rtngVO.setRtng(3);
		rtngVO.setRtngDtl("이거 본 걸 비밀로 해야돼서 대외비임");
		rtngVO.setRtngWrtr("kkkk");
		rtngVO.setLkcnt(615);
		rtngVO.setDslkCnt(79);
//		createResult = rtngService.createRtng(rtngVO);
//		System.out.println("평점 등록 " + createResult);
//		
		FmsLnService fmsLnService = new FmsLnServiceImpl();
		FmsLnVO fmsLnVO = new FmsLnVO();
		fmsLnVO.setMvId("MV-20230309-00030");
		fmsLnVO.setMvPplId("PD-20230308-00006");
		fmsLnVO.setFmsLn("예수님입니다, 부활 하셨거든");
		fmsLnVO.setXplntn(null);
		fmsLnVO.setRgstPplNm("yoog");
//		createResult = fmsLnService.createFmsLn(fmsLnVO);
//		System.out.println("명대사 등록 " + createResult);
		
		gnrVO.setGnrId(2);
		gnrVO.setGnrNm("스릴러");
//		gnrService.updateGnr(gnrVO);
		
		cmpnVO.setCmpnId("CO-20230308-00002");
		cmpnVO.setCmpnNm("유니버설 픽쳐스");
//		cmpnService.updateCmpn(cmpnVO);
		
		mvPplVO.setPrflPctr("URL");
		mvPplVO.setNm("호두");
		mvPplVO.setMvPplId("PD-20230308-00006");
//		mvPplService.updateMyPpl(mvPplVO);
		
		ntnVO.setNtnId(2);
		ntnVO.setNtnNm("프랑스");
//		ntnService.updateNtn(ntnVO);
		
		pctrVO.setTp("003_10");
		pctrVO.setThmbnlPctr("URL");
		pctrVO.setOrgnlPctr("원본사진");
		pctrVO.setPctrId("PT-20230309-00001");
//		pctrService.updatePctr(pctrVO);
		
		rtngVO.setRtng(5);
		rtngVO.setRtngDtl("정말 재미있어요!");
		rtngVO.setRtngId("MR-20230309-00001");
//		rtngService.updateRtngDAO(rtngVO);
		
		mvVO.setMvId("MV-20230309-00002");
		mvVO.setMvTtl("수정된 영화");
		mvVO.setEngTtl("Updated");
//		mvService.updateMv(mvVO);
	
//		gnrService.deleteGnr(1);
//		gnrService.deleteGnr(2);
//		ntnService.deleteNtn(1);
//		ntnService.deleteNtn(2);
//		mvPplService.deleteMyPpl("PD-20230310-00014");
//		cmpnService.deleteCmpn("CO-20230310-00004");
//		pctrService.deletePctr("PT-20230310-00002");
//		vdService.deleteVd("VD-20230310-00002");
//		rtngService.deleteRtng("MR-20230310-00001");
//		fmsLnService.deleteFmsLn("FL-20230310-00003");
//		
//		mvService.deleteMv("MV-20230310-00006");

		
//		List <CmmnCdVO> cmmnCdList = cmmnCdService.readAllCmmnCd();
//		for (CmmnCdVO cmmnCdVO1 : cmmnCdList) {
//			System.out.print(cmmnCdVO1.getCdId()+"\t\t");
//			System.out.print(cmmnCdVO1.getCdNm()+"\t\t");
//			System.out.println(cmmnCdVO1.getPrcdncCdId());
//		}
//		System.out.println("=====================================================");
//		List <CmpnVO> cmpnList1 = cmpnService.readAllCmpn();
//		for (CmpnVO cmpnVO1 : cmpnList1) {
//			System.out.print(cmpnVO1.getCmpnId()+"\t\t");
//			System.out.println(cmpnVO1.getCmpnNm());
//		}
//		System.out.println("=====================================================");
//		List <FmsLnVO> fmsLnList1 = fmsLnService.readAllFmsLn();
//		for (FmsLnVO fmsLnVO1 : fmsLnList1) {
//			System.out.print(fmsLnVO1.getFmsLnId()+"\t");
//			System.out.print(fmsLnVO1.getMvId()+"\t");
//			System.out.print(fmsLnVO1.getMvPplId()+"\t");
//			System.out.print(fmsLnVO1.getFmsLn()+"\t");
//			System.out.print(fmsLnVO1.getXplntn()+"\t");
//			System.out.print(fmsLnVO1.getRgstTm()+"\t");
//			System.out.print(fmsLnVO1.getRgstPplNm()+"\t");
//			System.out.println(fmsLnVO1.getRcmmdCnt());
//		}
//		System.out.println("=====================================================");
//		List <GnrVO> gnrList1 = gnrService.readAllGnr();
//		for (GnrVO gnrVO1 : gnrList1) {
//			System.out.print(gnrVO1.getGnrId()+"\t");
//			System.out.println(gnrVO1.getGnrNm());
//		}
//		System.out.println("=====================================================");
//		List <MvPplVO> MvPplList1 = mvPplService.readAllMyPpl();
//		for (MvPplVO mvPplVO1 : MvPplList1) {
//			System.out.print(mvPplVO1.getMvPplId()+"\t");
//			System.out.print(mvPplVO1.getPrflPctr()+"\t");
//			System.out.print(mvPplVO1.getNm()+"\t");
//			System.out.println(mvPplVO1.getRlNm()+"\t");
//		}
//		System.out.println("=====================================================");
//		List <NtnVO> ntnList1 = ntnService.readAllNtn();
//		for (NtnVO ntnVO1 : ntnList1) {
//			System.out.print(ntnVO1.getNtnId()+"\t");
//			System.out.println(ntnVO1.getNtnNm());
//		}
//		System.out.println("=====================================================");
//		List <PctrVO> pctrList1 = pctrService.readAllPctr();
//		for (PctrVO pctrVO1 : pctrList1) {
//			System.out.print(pctrVO1.getPctrId()+"\t");
//			System.out.print(pctrVO1.getMvId()+"\t");
//			System.out.print(pctrVO1.getTp()+"\t");
//			System.out.print(pctrVO1.getThmbnlPctr()+"\t");
//			System.out.println(pctrVO1.getOrgnlPctr());
//		}
//		System.out.println("=====================================================");
//		List <RtngVO>rtngList1 = rtngService.readAllRtng();
//		for (RtngVO rtngVO1 : rtngList1) {
//			System.out.print(rtngVO1.getRtngId()+"\t");
//			System.out.print(rtngVO1.getMvId()+"\t");
//			System.out.print(rtngVO1.getRtng()+"\t");
//			System.out.print(rtngVO1.getRtngDtl()+"\t");
//			System.out.print(rtngVO1.getRtngWrtr()+"\t");
//			System.out.print(rtngVO1.getRtngWrtTm()+"\t");
//			System.out.print(rtngVO1.getLkcnt()+"\t");
//			System.out.println(rtngVO1.getDslkCnt());
//		}
//		System.out.println("=====================================================");
//		List <VdVO>vdList1 = vdService.readAllVd();
//		for (VdVO vdVO1 : vdList1) {
//			System.out.print(vdVO1.getVdId()+"\t");
//			System.out.print(vdVO1.getMvId()+"\t");
//			System.out.print(vdVO1.getVdTp()+"\t");
//			System.out.print(vdVO1.getVdTtl()+"\t");
//			System.out.print(vdVO1.getThmbnl()+"\t");
//			System.out.print(vdVO1.getVdPlyCnt()+"\t");
//			System.out.print(vdVO1.getVdUrl()+"\t");
//			System.out.println(vdVO1.getRgstDt());
//		}
//		List<MvVO> mvList = mvService.readAllMv();
//		for (MvVO mvVO1 : mvList) {
//			System.out.print(mvVO1.getMvId()+"\t");
//			System.out.print(mvVO1.getMvTtl()+"\t\t");
//			System.out.print(mvVO1.getEngTtl()+"\t");
//			System.out.println(mvVO1.getSmr()+"\t");
//		
//			List<GnrVO> mvGnrList = mvVO1.getGnrList();
//			List<NtnVO> mvNtnList = mvVO1.getNtnList();
//			
//			for (GnrVO myGnr : mvGnrList) {
//				System.out.print(myGnr.getGnrId()+"\t");
//				System.out.print(myGnr.getGnrNm()+"\t");
//			}
//			for (NtnVO myNtn : mvNtnList) {
//				System.out.print(myNtn.getNtnId()+"\t");
//				System.out.print(myNtn.getNtnNm()+"\t");
//			}
//			System.out.println("\n");
//		}
	
		MvVO mv1 = mvService.readOneMv("MV-20230310-00007");
		System.out.print(mv1.getMvId()+"\t"+mv1.getMvTtl()+"\t\t"+mv1.getEngTtl()+"\t"+mv1.getGrd()+"\t\t"+mv1.getSmr());
	}
}
