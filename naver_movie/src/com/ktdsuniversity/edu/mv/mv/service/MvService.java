package com.ktdsuniversity.edu.mv.mv.service;

import java.util.List;

import com.ktdsuniversity.edu.mv.mv.vo.MvVO;

public interface MvService {
	
	/**
	 * 영화 데이터 등록
	 * @param mvVO
	 * @return 데이터 등록 결과
	 */
	public boolean createMv(MvVO mvVO);
	
	/**
	 * 영화 목록 조회
	 * 장르, 제작지 포함하여 조회
	 * @return 영화목록
	 */
	public List<MvVO> readAllMv();
	
	/**
	 * 영화 상세 조회
	 * @param mvId 조회할 영화의 ID
	 * @return 영화 상세 정보
	 */
	public MvVO readOneMv(String mvId);
	/**
	 * 영화 데이터 수정
	 * @param mvVO
	 * @return 데이터 수정 결과
	 */
	public boolean updateMv(MvVO mvVO);
	
	/**
	 * 영화 삭제
	 * 장르, 제작지, 참여회사, 참여영화인 등이 모두 삭제된다.
	 * @param MvId 영화ID
	 * @return 영화 삭제 성공여부
	 */
	public boolean deleteMv(String mvId);

}
