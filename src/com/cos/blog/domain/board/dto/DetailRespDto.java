package com.cos.blog.domain.board.dto;

import lombok.Data;

@Data
public class DetailRespDto {
	private int id; //board 테이블
	private String title; //board 테이블
	private String content; //board 테이블
	private int readCount; //board 테이블
	private int userId; //user 아이디
	private String username; //user테이블

	// 루시 필터 적용해보기
	public String getTitle() {
		return title.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	}
}