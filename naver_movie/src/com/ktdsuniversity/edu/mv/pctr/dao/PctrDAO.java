package com.ktdsuniversity.edu.mv.pctr.dao;

import java.util.List;

import com.ktdsuniversity.edu.mv.pctr.vo.PctrVO;



public interface PctrDAO {
	
	/**
	 * 사진 데이터 생성
	 * @param PctrVO
	 * @return 생성된 데이터 수
	 */
	public int createPctr(PctrVO pctrVO);
	
	/**
	 * 모든 사진 데이터 조회
	 * @return 모든 사진 데이터 List
	 */
	public List<PctrVO> readAllPctr();
	
	/**
	 * 사진 데이터 수정
	 * @param PctrVO
	 * @return 수정된 데이터 수
	 */
	public int updatePctr(PctrVO pctrVO);
	
	/**
	 * 사진 데이터 삭제
	 * @param PhtId (삭제할 데이터의 PK)
	 * @return 삭제된 데이터 수
	 */
	public int deletePctr(String pctrId);

}
