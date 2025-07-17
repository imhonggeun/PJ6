package com.java.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.dto.BoardDTO;
import com.java.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardDaoImp implements BoardDao{
	private final BoardMapper boardMapper;
	@Override
	public List<BoardDTO> boardlist(String accept) {
		return boardMapper.boardlist(accept);
	}
	@Override
	public BoardDTO detail(int no) {
		return boardMapper.detail(no);
	}
	@Override
	public int edit(BoardDTO boardDTO) {
		return boardMapper.edit(boardDTO);
	}
	@Override
	public int input(BoardDTO boardDTO) {
		return boardMapper.input(boardDTO);
	}
	@Override
	public int accept(BoardDTO boardDTO) {
		return boardMapper.accept(boardDTO);
	}

}
