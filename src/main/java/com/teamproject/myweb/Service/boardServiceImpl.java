package com.teamproject.myweb.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamproject.myweb.command.MainVO;
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
	public ArrayList<reviewVO> reviewList(review_Criteria cri) {
		return boardmapper.reviewList(cri);
	}

	@Override
	public int reviewTotal(review_Criteria cri) {
		return boardmapper.reviewTotal(cri);
	}

	@Override
	public reviewVO getDetail(int review_no) {
		return boardmapper.getDetail(review_no);
	}

	@Override
	public int updateReview(reviewVO vo) {
		return boardmapper.updateReview(vo);
	}

	@Override
	public int deleteReview(int review_no) {
		return boardmapper.deleteReview(review_no);
	}

	@Override
	public ArrayList<MainVO> getLocation() {
		return boardmapper.getLocation();
	}
	
	
}
