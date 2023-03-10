package com.ktdsuniversity.edu.mv.mv.vo;

import com.ktdsuniversity.edu.mv.mvppl.vo.MvPplVO;

public class PrdcPrtcptnPplVO extends MvPplVO {
	
	/**
	 * 역할
	 */
	private String mssn;
	
	/**
	 * 세부역할
	 */
	private String rspnsbltRolNm;

	public String getMssn() {
		return mssn;
	}

	public void setMssn(String mssn) {
		this.mssn = mssn;
	}

	public String getRspnsbltRolNm() {
		return rspnsbltRolNm;
	}

	public void setRspnsbltRolNm(String rspnsbltRolNm) {
		this.rspnsbltRolNm = rspnsbltRolNm;
	}

	
}
