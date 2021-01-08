package com.cos.blog.domain.user.dto;

import lombok.Data;

@Data
public class UpdateReqDtoUser {
	private String password;
	private String email;
	private String address;
}