package com.ktdsuniversity.edu.mv.mvppl.vo;

import com.ktdsuniversity.edu.mv.util.db.Column;
import com.ktdsuniversity.edu.mv.util.db.UseColumn;

@UseColumn
public class MvPplVO {
	
	/**
	 * 영화인ID
	 */
    @Column("MV_PPL_ID")
	private String mvPplId;
	
	/**
	 * 프로필사진
	 */
    @Column("PRFL_PCTR")
	private String prflPctr;
	
	/**
	 * 이름
	 */
    @Column("NM")
	private String nm;
	
	/**
	 * 본명
	 */
    @Column("RL_NM")
	private String rlNm;
	
	public String getMvPplId() {
		return mvPplId;
	}
	public void setMvPplId(String mvPplId) {
		this.mvPplId = mvPplId;
	}
	public String getPrflPctr() {
		return prflPctr;
	}
	public void setPrflPctr(String prflPctr) {
		this.prflPctr = prflPctr;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getRlNm() {
		return rlNm;
	}
	public void setRlNm(String rlNm) {
		this.rlNm = rlNm;
	}
	
	
}
