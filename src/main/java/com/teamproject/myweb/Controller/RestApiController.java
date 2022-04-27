package com.teamproject.myweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamproject.myweb.Service.boardService;
import com.teamproject.myweb.command.MainVO;

@RestController
public class RestApiController {

	@Autowired
	boardService boardservice;
	
	@GetMapping("/getLocation")
	public MainVO getLocation() {
		
		MainVO vo= boardservice.getLocation(); 
		return vo;
	}
}
