package com.ktdsuniversity.edu.mv.rtng.dao;

import java.util.List;

import com.ktdsuniversity.edu.mv.rtng.vo.RtngVO;

public interface RtngDAO {
	
	/**
	 * 평점 데이터 등록
	 * @param mvVO
	 * @return 등록된 평점 데이터 수
	 */
	public int createRtng(RtngVO rtngVO);
	
	/**
	 * 평점 데이터 수정
	 * @param rtngVO
	 * @return 수정된 평점 데이터 수
	 */
	public int updateRtng(RtngVO rtngVO);
	
	public int deleteRtng(String rtngId);
	
	public List<RtngVO> readAllRtng();
}
