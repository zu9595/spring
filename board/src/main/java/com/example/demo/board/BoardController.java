package com.example.demo.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.board.mapper.BoardMapper;

@RequestMapping("/boards")
@RestController
public class BoardController {
	
	@Autowired BoardMapper mapper;
	
	@GetMapping("/boardList")
	public ModelAndView boardList() {
		ModelAndView mv = new ModelAndView("board/boardList");
		return mv;
	}
	
	@GetMapping("/")
	public List<BoardVO> BoardList(BoardVO vo, PageVO pvo){
		return mapper.getBoardList(vo, pvo);
	}
	
	
	@PostMapping("/insert")
	public BoardVO insert(BoardVO vo) {
		System.out.println(vo);
		mapper.addBoard(vo);
		return vo;
	}
}
