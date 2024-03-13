package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.BoardVO;
import com.example.demo.board.PageVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> getBoardList(BoardVO vo, PageVO pvo);
	BoardVO getBoardInfo(int bno);
	int addBoard(BoardVO vo);
	int deleteBoard(int bno);
	int updateBoard(BoardVO vo);
}
