package com.teamproject.myweb.Service;

import java.util.ArrayList;

import com.teamproject.myweb.command.reviewVO;
import com.teamproject.myweb.util.review_pageVO;


public interface boardService {
	
	public int reviewRegist(reviewVO vo);
	
	public ArrayList<reviewVO> reviewList(review_pageVO vo);
	
	public int reviewTotal();
}
