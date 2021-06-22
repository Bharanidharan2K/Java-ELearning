package com.multilevel_inheritance;

public class GoldStall extends SilverStall {
	private Integer tvSet;
	public GoldStall() {}
	public GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet) {
		super(name,detail,owner,cost);
		this.tvSet = tvSet;
	}
	public Integer getTvSet() {
		return tvSet;
	}
	public void setTvSet(Integer tvSet) {
		this.tvSet = tvSet;
	}
}
