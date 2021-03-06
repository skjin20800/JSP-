package com.cos.blog.service;

import java.util.List;

import com.cos.blog.domain.board.Board;
import com.cos.blog.domain.board.BoardDao;
import com.cos.blog.domain.board.dto.DetailRespDto;
import com.cos.blog.domain.board.dto.SaveReqDto;
import com.cos.blog.domain.board.dto.UpdateReqDto;

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
		int result = boardDao.insertReadCount(id);
		
		if(result ==1) {
			System.out.println("result : "+ result);
			return boardDao.findById(id);	
		}else {
			return null;
		}	
	}
	
	public List<Board> 검색(String keyword, int page) {
		return boardDao.search(keyword, page);
	}
	
	public int 검색게시글수(String keyword) {
		return boardDao.searchAllPage(keyword);
	}
	
	public int 글수정(UpdateReqDto dto) {
		return boardDao.update(dto);
	}
	
	public int 글삭제(int id) {
		return boardDao.deleteById(id);
	}
}