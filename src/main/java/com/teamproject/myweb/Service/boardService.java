package com.teamproject.myweb.Service;

import java.util.ArrayList;

import com.teamproject.myweb.command.reviewVO;
import com.teamproject.myweb.util.review_Criteria;



public interface boardService {
	
	public int reviewRegist(reviewVO vo);
	
	public ArrayList<reviewVO> reviewList(review_Criteria cri);
	
	public int reviewTotal(review_Criteria cri);
	
	public reviewVO getDetail(int review_no);
}
