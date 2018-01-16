package com.house.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.model.dto.BoardDTO;
import com.house.model.service.BoardService;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class InsertBoardAction
 */
@WebServlet("/write")
public class InsertBoardAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("insertboard 들어옴");
		String saveDir = request.getSession().getServletContext().getRealPath("/save/");

		int maxSize = 1024 * 1024 * 100;// 100m
		String encoding = "UTF-8";

		try {

			MultipartRequest m = new MultipartRequest(request, saveDir, maxSize, encoding,
					new DefaultFileRenamePolicy());
			
			String userId = "명환";
			String title = m.getParameter("title");
			String content = m.getParameter("content");
			String fileName = m.getParameter("fileName");
			// 입력유뮤 유효성 체크
			if (title == null || content == null) {

				throw new Exception("입력값이 충분하지 않습니다.");
			}

			content = content.replaceAll("<", "&lt;");

			BoardDTO bdto = new BoardDTO(userId, title, content, fileName);
			if (m.getFilesystemName("file") != null) {// 파일첨부되었다면
				bdto.setFileName(m.getFilesystemName("file"));
			}

			BoardService.insert(bdto);
			response.sendRedirect("select");
			return;

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}

		request.getRequestDispatcher("errorView/error.jsp").forward(request, response);
	}

}
