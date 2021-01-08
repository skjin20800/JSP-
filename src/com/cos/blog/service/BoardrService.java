package com.cos.blog.service;

import java.util.List;

import com.cos.blog.domain.board.Board;
import com.cos.blog.domain.board.BoardDao;
import com.cos.blog.domain.board.dto.DetailRespDto;
import com.cos.blog.domain.board.dto.SaveReqDto;

public class BoardrService {
	private BoardDao boardDao;

	public BoardrService() {
		boardDao = new BoardDao();
	}

	public int 글쓰기(SaveReqDto dto) { 
		return boardDao.save(dto);
	}
	
	public List<Board> 목록보기(int page) {
		return boardDao.findAll(page);
	}
	public int 전체게시글수() {
		return boardDao.findAllPage();
	}
	
	public DetailRespDto 글상세보기(int id) {
		// 조회수 업데이트치기
		boardDao.insertReadCount(id);
		return boardDao.findById(id);
	}
	
}