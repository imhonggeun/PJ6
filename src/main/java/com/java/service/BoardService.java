package com.java.service;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

public interface BoardService {

	String boardlist(Model model, HttpServletRequest req);

}
