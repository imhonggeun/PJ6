package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	@GetMapping("/")
	public String boardlist(Model model, HttpServletRequest req) {
		return boardService.boardlist(model,req);
	}
	
	@GetMapping("/detail")
	public String detail(Model model,HttpServletRequest req) {
		return boardService.detail(model,req);
	}
	@PostMapping("/edit")
	public String edit(HttpServletRequest req) {
		return boardService.edit(req);
	}
	@GetMapping("/input")
	public String input() {
		return "input";
	}
	@PostMapping("/input")
	public String input(HttpServletRequest req) {
		return boardService.input(req);
	}

}
