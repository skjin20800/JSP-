package com.cos.blog.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 이제부터는 내부에서의 모든 요청은 RequestDispatcher로 해야한다. 
// 그래야 다시 필터를 타지 않는다.

public class XssFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
    	HttpServletResponse response = (HttpServletResponse) resp;

    	String test = request.getParameter("title");
    	System.out.println(test+"냠냠");
    	
    	chain.doFilter(request, response);
    	
    	
		
	}
}