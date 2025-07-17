package com.java.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.java.dao.BoardDao;
import com.java.dto.BoardDTO;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImp implements BoardService{
	
	private final BoardDao baordDao;
	

	@Override
	public String boardlist(Model model, HttpServletRequest req) {
		String accept = req.getParameter("accept");
		if(accept == null || accept == "") accept ="2";
		List<BoardDTO> boardDTO = baordDao.boardlist(accept);
		model.addAttribute("result", boardDTO);
		return "list";
	}

}
