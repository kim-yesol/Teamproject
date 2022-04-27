package com.teamproject.myweb.Service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.teamproject.myweb.command.MainVO;
import com.teamproject.myweb.command.reviewVO;
import com.teamproject.myweb.util.review_Criteria;



@Mapper
public interface boardMapper {
	
	public int reviewRegist(reviewVO vo);
	
	public ArrayList<reviewVO> reviewList(review_Criteria cri);
	
	public int reviewTotal(review_Criteria cri);
	
	public reviewVO getDetail(int review_no);
	
	public int updateReview(reviewVO vo);
	
	public int deleteReview(int review_no);
	
	public ArrayList<MainVO> getLocation();
}
