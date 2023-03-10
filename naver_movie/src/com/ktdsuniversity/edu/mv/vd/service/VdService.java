package com.ktdsuniversity.edu.mv.vd.service;

import java.util.List;

import com.ktdsuniversity.edu.mv.vd.vo.VdVO;

public interface VdService {
	
	/**
	 * 동영상 데이터 생성
	 * @param vdVO
	 * @return 데이터 생성된 수
	 */
	public boolean creatdVd(VdVO vdVO);
	
	/**
	 * 동영상 데이터 수정
	 * @param vdVO
	 * @return 데이터 수정 결과
	 */
	public boolean updateVd(VdVO vdVO);
	
	public boolean deleteVd(String vdId);

	public List<VdVO> readAllVd();
}
