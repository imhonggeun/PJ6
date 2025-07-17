package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.java.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	
	@Select({"<script>"
			+ "SELECT no, title, content, accept, regDate FROM test "
			+ "<if test='accept == 1'>WHERE accept = 1</if> "
			+ "<if test='accept == 0'>WHERE accept = 0</if> "
			+ "</script>"})
	List<BoardDTO> boardlist(String accept);

	@Select("select * from test where no=#{no}")
	BoardDTO detail(int no);

	@Update("update test set title=#{title},content=#{content} where no=#{no}")
	int edit(BoardDTO boardDTO);
	
	
	@Insert("insert into test (title,content) values (#{title},#{content})")
	int input(BoardDTO boardDTO);
	
	@Update("update test set accept=#{accept} where no=#{no}")
	int accept(BoardDTO boardDTO);

}
