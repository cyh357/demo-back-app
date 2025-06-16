package com.example.demo.board.mapper;

import java.util.List;
import com.example.demo.board.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardMapper {
	List<BoardVo> selectAll(@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize);

	BoardVo selectById(int id);

	int insertBoard(BoardVo boardVO);

	int updateBoard(BoardVo boardVO);

	int deleteBoard(int id);

	int selectTotalCount();
}