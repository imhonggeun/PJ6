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
	public BoardDTO detail(BoardDTO boardDTO) {
		return boardMapper.detail(boardDTO);
	}
	@Override
	public int edit(BoardDTO boardDTO) {
		return boardMapper.edit(boardDTO);
	}

}
