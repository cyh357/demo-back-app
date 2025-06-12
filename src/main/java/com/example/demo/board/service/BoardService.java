package com.example.demo.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.vo.BoardVo;

@Service
public class BoardService {
	private final BoardMapper boardMapper;

	public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }
	
	public List<BoardVo> getAllBoards() {
        return boardMapper.selectAll();
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
}