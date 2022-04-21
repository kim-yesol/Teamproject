package com.teamproject.myweb.util;

import lombok.Data;

@Data
public class review_Criteria {

	
	private int page;
	private int amount;
	
	
	public review_Criteria() {
		this(1,10);
		
	}
	
	
	public review_Criteria(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
	
	
}
