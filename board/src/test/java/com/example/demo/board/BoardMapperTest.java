package com.example.demo.board;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.BoardMapper;

@SpringBootTest
public class BoardMapperTest {
	@Autowired
	BoardMapper mapper;

//	@Test
	public void 게시글목록() {
		BoardVO vo = new BoardVO();
		PageVO pvo = new PageVO();
//		vo.setTitle("첫번째 글");
//		vo.setContent("불코딩하자");
		vo.setWriter("최승민");
		List<BoardVO> list = mapper.getBoardList(vo, pvo);
		for(BoardVO board : list) {
			System.out.println("제목 : "+board.getTitle());
			System.out.println("내용 : "+board.getContent());
			System.out.println("작성자 : "+board.getWriter());
		}
	}
//	@Test
	public void 게시글단건조회() {
		int boardNo = 21;
		BoardVO vo = mapper.getBoardInfo(boardNo);
		System.out.println(vo);
	}
	
//	@Test
	public void 게시글등록() {
		BoardVO vo = new BoardVO();
		vo.setTitle("테스트제목");
		vo.setContent("테스트내용");
		vo.setWriter("작성자");
		vo.setWriterDate(new Date(24,2,13));
		vo.setClickCnt(10);
		int result = mapper.addBoard(vo);
		System.out.println("등록됨 "+result);
	}
	
//	@Test
	public void 게시글수정() {
		BoardVO vo = new BoardVO();
		vo.setContent("야호");
//		vo.setTitle("하하하");
//		vo.setWriter("xxx");
		vo.setBoardNo(41);
		int cnt = mapper.updateBoard(vo);
//		System.out.println("수정 부분 : "+vo);
		System.out.println("수정됨 "+cnt);
	}
	@Test
	public void 게시글삭제() {
		int boardNo = 41;
		int cnt = mapper.deleteBoard(boardNo);
		System.out.println("삭제됨 "+cnt);
	}
}
