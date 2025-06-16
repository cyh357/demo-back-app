package com.example.demo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.vo.BoardVo;
import com.example.demo.common.paging.PageInfo;

@Service
public class BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	public PageInfo<BoardVo> getAllBoards(int pageIndex, int pageSize) {
		int totalCount = boardMapper.selectTotalCount();
		List<BoardVo> boards = boardMapper.selectAll((pageIndex -1)*pageSize, pageSize);
        return new PageInfo<BoardVo>(pageIndex, pageSize, totalCount, boards);
    }

    public BoardVo getBoardById(int id) {
        return boardMapper.selectById(id);
    }

    public int createBoard(BoardDto boardDto) {
        return boardMapper.insertBoard(new BoardVo(boardDto));
    }

    public int updateBoard(BoardDto boardDto) {
        return boardMapper.updateBoard(new BoardVo(boardDto));
    }

    public int deleteBoard(int id) {
        return boardMapper.deleteBoard(id);
    }

	public int getTotalCount() {
		// TODO Auto-generated method stub
		return boardMapper.selectTotalCount();
	}
}