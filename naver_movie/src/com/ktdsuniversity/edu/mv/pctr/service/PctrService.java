package com.ktdsuniversity.edu.mv.pctr.service;

import java.util.List;

import com.ktdsuniversity.edu.mv.pctr.vo.PctrVO;

public interface PctrService {
	
	/**
	 * 사진 데이터 생성
	 * @param pctrVO
	 * @return 생성 결과
	 */
	public boolean createPctr(PctrVO pctrVO);
	
	/**
	 * 모든 사진 데이터 조회
	 * @return 모든 사진 데이터 List
	 */
	public List<PctrVO> readAllPctr();
	
	/**
	 * 사진 데이터 수정
	 * @param pctrVO
	 * @return 수정 결과
	 */
	public boolean updatePctr(PctrVO pctrVO);

	/**
	 * 사진 데이터 삭제
	 * @param pctrId (삭제할 데이터의 PK)
	 * @return 삭제 결과
	 */
	public boolean deletePctr(String pctrId);

}
