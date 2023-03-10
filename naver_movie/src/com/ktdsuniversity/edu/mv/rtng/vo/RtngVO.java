package com.ktdsuniversity.edu.mv.rtng.vo;

import com.ktdsuniversity.edu.mv.util.db.Column;
import com.ktdsuniversity.edu.mv.util.db.UseColumn;

@UseColumn
public class RtngVO {

	@Column("RTNG_ID")
	private String rtngId;
	
	@Column("MV_ID")
	private String mvId;
	
	@Column("RTNG")
	private int rtng;
	
	@Column("RTNG_DTL")
	private String rtngDtl;
	
	@Column("RTNG_WRTR")
	private String rtngWrtr;
	
	@Column("RTNG_WRT_TM")
	private String rtngWrtTm;
	
	@Column("LK_CNT")
	private int lkcnt;
	
	@Column("DSLK_CNT")
	private int dslkCnt;
	
	public String getRtngId() {
		return rtngId;
	}
	public void setRtngId(String rtngId) {
		this.rtngId = rtngId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public int getRtng() {
		return rtng;
	}
	public void setRtng(int rtng) {
		this.rtng = rtng;
	}
	public String getRtngWrtr() {
		return rtngWrtr;
	}
	public void setRtngWrtr(String rtngWrtr) {
		this.rtngWrtr = rtngWrtr;
	}
	public int getLkcnt() {
		return lkcnt;
	}
	public void setLkcnt(int lkcnt) {
		this.lkcnt = lkcnt;
	}
	public int getDslkCnt() {
		return dslkCnt;
	}
	public void setDslkCnt(int dslkCnt) {
		this.dslkCnt = dslkCnt;
	}
	public String getRtngWrtTm() {
		return rtngWrtTm;
	}
	public void setRtngWrtTm(String rtngWrtTm) {
		this.rtngWrtTm = rtngWrtTm;
	}
	public String getRtngDtl() {
		return rtngDtl;
	}
	public void setRtngDtl(String rtngDtl) {
		this.rtngDtl = rtngDtl;
	}
	
	
}
