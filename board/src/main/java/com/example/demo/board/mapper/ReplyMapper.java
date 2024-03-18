package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.PageVO;
import com.example.demo.board.ReplyVO;

@Mapper
public interface ReplyMapper {
	int addReply(ReplyVO vo);
	List<ReplyVO> getReplyList(ReplyVO vo, PageVO pvo, int bdno);
}
