package com.teamproject.myweb.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamproject.myweb.command.reviewVO;
import com.teamproject.myweb.util.review_Criteria;
import com.teamproject.myweb.util.review_pageVO;


@Service("boardService")
public class boardServiceImpl implements boardService{
	
	@Autowired
	boardMapper boardmapper;
	
	@Override
	public int reviewRegist(reviewVO vo) {
		return boardmapper.reviewRegist(vo);
	}

	@Override
	public ArrayList<reviewVO> reviewList(review_pageVO vo) {
		return boardmapper.reviewList(vo);
	}

	@Override
	public int reviewTotal() {
		return boardmapper.reviewTotal();
	}
	
	
}
