package com.ktdsuniversity.edu.mv.mv.dao;

import java.util.List;

import com.ktdsuniversity.edu.mv.mv.vo.MvVO;

public interface MvDAO {
	
	/**
	 * 영화의 새로운 PK(ID)를 발급받는다
	 * @return 영화의 새로운 ID
	 */
	public String createNewMvId();
	
	/**
	 * 영화 데이터 등록 (영화 테이블에 있는 컬럼의 정보만 등록)
	 * @param mvVO
	 * @return
	 */
	public int createMv(MvVO mvVO);
	
	/**
	 * 영화 목록 조회
	 * 장르, 제작지 포함해서 조회
	 * @return 영화목록
	 */
	public List<MvVO> readAllMv();
	
	/**
	 * 영화 상세 조회
	 * @param mvId 조회할 영화의 ID
	 * @return 영화 상세 정보
	 */
	public MvVO readOneMv(String mvId);
	
	public int updateMv(MvVO mvVO);
	
	/**
	 * 영화 삭제 (영화의 순수한 정보만 삭제)
	 * @param mvId 영화 id
	 * @return 삭제된 영화의 수 
	 */
	public int deleteMv(String mvId);
}
