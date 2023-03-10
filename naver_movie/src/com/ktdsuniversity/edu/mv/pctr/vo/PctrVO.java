package com.ktdsuniversity.edu.mv.pctr.vo;

import com.ktdsuniversity.edu.mv.util.db.Column;
import com.ktdsuniversity.edu.mv.util.db.UseColumn;

@UseColumn
public class PctrVO {
	
	@Column("PCTR_ID")
	private String pctrId;

	@Column("MV_ID")
	private String mvId;
	
	@Column("TP")
	private String tp;
	
	@Column("THMBNL_PCTR") 
	private String thmbnlPctr;
	
	@Column("ORGNL_PCTR")
	private String orgnlPctr;
	
	public String getPctrId() {
		return pctrId;
	}
	public void setPctrId(String pctrId) {
		this.pctrId = pctrId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public String getThmbnlPctr() {
		return thmbnlPctr;
	}
	public void setThmbnlPctr(String thmbnlPctr) {
		this.thmbnlPctr = thmbnlPctr;
	}
	public String getOrgnlPctr() {
		return orgnlPctr;
	}
	public void setOrgnlPctr(String orgnlPctr) {
		this.orgnlPctr = orgnlPctr;
	}
	
}
