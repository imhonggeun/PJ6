package com.java.dao;

import java.util.List;

import com.java.dto.BoardDTO;

public interface BoardDao {
	List<BoardDTO> boardlist(String accept);

	BoardDTO detail(int no);

	int edit(BoardDTO boardDTO);

	int input(BoardDTO boardDTO);

	int accept(BoardDTO boardDTO);
}
