package com.ktdsuniversity.edu.mv.rtng.service;

import java.util.List;

import com.ktdsuniversity.edu.mv.rtng.vo.RtngVO;

public interface RtngService {
	
	/**
	 * 평점 데이터 등록
	 * @param mvVO
	 * @return 평점 데이터 등록 결과
	 */
	public boolean createRtng(RtngVO rtngVO);
	
	/**
	 * 평점 데이터 수정
	 * @param rtngVO
	 * @return 평점 데이터 수정 결과
	 */
	public boolean updateRtng(RtngVO rtngVO);
	
	public boolean deleteRtng(String rtngId);
	
	public List<RtngVO> readAllRtng();
}
