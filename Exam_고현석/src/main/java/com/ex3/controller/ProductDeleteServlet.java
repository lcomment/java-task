package com.ex3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

@WebServlet("/ProductDeleteServlet")
public class ProductDeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	 }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = (String) request.getParameter("id");
		
		HttpSession session = request.getSession();
		
		if(validateProduct(session, id)) {
			request.getRequestDispatcher("ex3/error.jsp").forward(request, response);
		} else {
			session.removeAttribute(id);
			request.getRequestDispatcher("ex3/productMain.jsp").forward(request, response);
		}
	}
	
	private boolean validateProduct(HttpSession session, String id) {
		return session.getAttribute(id) == null;
	}
}
