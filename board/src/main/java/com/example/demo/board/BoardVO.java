package com.example.demo.board;

import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BoardVO {
	int boardNo;
	String title;
	String content;
	String writer;
	Date writerDate;
	int clickCnt;
	String image;
}
