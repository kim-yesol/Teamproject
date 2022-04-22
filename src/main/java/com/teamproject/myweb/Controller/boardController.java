package com.teamproject.myweb.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.teamproject.myweb.Service.boardService;
import com.teamproject.myweb.command.reviewVO;
import com.teamproject.myweb.util.review_Criteria;
import com.teamproject.myweb.util.review_pageVO;

@Controller
@RequestMapping("/board")
public class boardController {
	
	@Autowired
	boardService boardservice;
	
	@GetMapping("/freeBoard")
	public String freeBoard() {
		return "board/freeBoard";
	}
	
	@GetMapping("/reviewBoard")
	public String reviewBoard(Model model, review_Criteria cri) {

		
		
		cri.setLimitLeft((cri.getPage()-1)*cri.getAmount() );
		
		review_pageVO vo = new review_pageVO(cri , boardservice.reviewTotal(cri));
		
		System.out.println(vo.toString());
		
		ArrayList<reviewVO> reviewList =  boardservice.reviewList(cri);
		

		
		model.addAttribute("pageVO", vo);
		
		model.addAttribute("reviewVO", reviewList);
		
		return "board/reviewBoard";
	}
	
	@GetMapping("/reviewReg")
	public String reivewReg() {
		return "board/reviewReg";
	}
	
	@GetMapping("/reviewDetail")
	public String reviewdetail(@RequestParam("review_no") int review_no, Model model) {
		reviewVO vo =  boardservice.getDetail(review_no);
		model.addAttribute("detailVO", vo);
		return "board/reviewDetail";
	}
	
	@PostMapping("/reviewForm")
	public String reviewform(reviewVO vo,Model model, RedirectAttributes RA) {
		
		System.out.println(vo.toString());
		
		int result = boardservice.reviewRegist(vo);
		
		if(result == 1) {
			RA.addFlashAttribute("msg", "등록성공");
		} else {
			RA.addFlashAttribute("msg", "등록실패");
		}
		
		return "redirect:/board/reviewBoard";
	}
	
	@GetMapping("/debateBoard")
	public String debateBoard() {
		return "board/debateBoard";
	}
	
	@GetMapping("/debateReg")
	public String debateReg() {
		
		return "board/debateReg";
	}
	
	
	
}
