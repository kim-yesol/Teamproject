package com.teamproject.myweb.Controller;

import java.util.ArrayList;

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
	public ArrayList<MainVO> getLocation() {
			
		ArrayList<MainVO> list= boardservice.getLocation();
		System.out.println(list.toString());
		return list;
	}
}
