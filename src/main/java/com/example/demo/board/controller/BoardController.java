package com.example.demo.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.vo.BoardVo;
import com.example.demo.common.paging.PageInfo;

@RestController
@RequestMapping("/api/board")
public class BoardController {
	private final BoardService boardService;

	public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public PageInfo<BoardVo> getAllBoards(@RequestParam int pageIndex, @RequestParam int pageSize) {
        return boardService.getAllBoards(pageIndex,pageSize);
    }
    
    @GetMapping("/{id}")
    public BoardVo getBoard(@PathVariable int id) {
        return boardService.getBoardById(id);
    }
    
    @PostMapping
    public int createBoard(@RequestBody BoardDto boardDto) {
        return boardService.createBoard(boardDto);
    }

    @PutMapping
    public int updateBoard(@RequestBody BoardDto boardDto) {
        return boardService.updateBoard(boardDto);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable int id) {
        boardService.deleteBoard(id);
    }
}