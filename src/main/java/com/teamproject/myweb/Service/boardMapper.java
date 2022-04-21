package com.teamproject.myweb.Service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.teamproject.myweb.command.reviewVO;
import com.teamproject.myweb.util.review_pageVO;


@Mapper
public interface boardMapper {
	
	public int reviewRegist(reviewVO vo);
	
	public ArrayList<reviewVO> reviewList(review_pageVO vo);
	
	public int reviewTotal();
}
