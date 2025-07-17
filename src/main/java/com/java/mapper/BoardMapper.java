package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.java.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	
	@Select({"<script>"
			+ "SELECT no, title, content, accept, regDate FROM test "
			+ "<if test='accept == 1'>WHERE accept = 1</if> "
			+ "<if test='accept == 0'>WHERE accept = 0</if> "
			+ "</script>"})
	List<BoardDTO> boardlist(String accept);

	@Select("select title,content from test where no=#{no}")
	BoardDTO detail(BoardDTO boardDTO);

}
