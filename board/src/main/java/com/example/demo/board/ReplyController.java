package com.example.demo.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.board.mapper.ReplyMapper;


@RequestMapping("/replies")
@RestController
public class ReplyController {

	@Autowired ReplyMapper mapper;
	
	@GetMapping("/replyMng")
	public ModelAndView replyMng() {
		ModelAndView mv = new ModelAndView("board/replyMng");
		return mv;
	}
	
	@GetMapping("/")
	public List<ReplyVO> repList(ReplyVO vo, PageVO pvo){
		return mapper.getReplyList(vo, pvo);
	}
	
	
	@PostMapping("/insert")
	public ReplyVO insert(ReplyVO vo) {
		System.out.println(vo);
		mapper.addReply(vo);
		return vo;
	}
	
	
}
