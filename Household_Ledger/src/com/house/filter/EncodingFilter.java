package com.house.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class EncodingFilter
 */

//@WebFilter("/*")	WebFilter의 default는 url-pattern
// /*는 root로 부터 들어오는 모든 행위에 filter를 적용
//밑에가 긴 이유는 initParams도 주고, servletNames도 주어야 하기 때문
@WebFilter(
//		urlPatterns = { "/loginCheck.jsp" }, 
		urlPatterns = { "/*" },
		initParams = { 
				@WebInitParam(name = "encoding", value = "utf-8")
		}
//		servletNames = { "loginCheckServlet" }
		)
public class EncodingFilter implements Filter {
	String encoding;
	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//post방식 인코딩 처리
		request.setCharacterEncoding(encoding);
		
		
		chain.doFilter(request, response);
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		encoding = fConfig.getInitParameter("encoding");
	}

}
