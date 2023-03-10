package com.ktdsuniversity.edu.mv.fmsln.service;

import java.util.List;

import com.ktdsuniversity.edu.mv.fmsln.vo.FmsLnVO;

public interface FmsLnService {
	/**
	 * 명대사 데이터 등록
	 * @param fmsLnVO
	 * @return 데이터 등록 결과
	 */
	public boolean createFmsLn(FmsLnVO fmsLnVO);
	
	/**
	 * 명대사 데이터 수정
	 * @param fmsLnVO
	 * @return 데이터 수정 결과
	 */
	public boolean updateFmsLn(FmsLnVO fmsLnVO);
	public boolean deleteFmsLn(String fmsLnId);
	public List<FmsLnVO> readAllFmsLn();
}
