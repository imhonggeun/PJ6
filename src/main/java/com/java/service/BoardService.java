package com.java.service;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

public interface BoardService {

	String boardlist(Model model, HttpServletRequest req);

	String detail(Model model, HttpServletRequest req);

	String edit(HttpServletRequest req);

	String input(HttpServletRequest req);

	String accept(HttpServletRequest req);

}
