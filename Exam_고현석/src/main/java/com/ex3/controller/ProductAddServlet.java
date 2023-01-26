package com.ex3.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;


@WebServlet("/ProductAddServlet")
public class ProductAddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = (String) request.getParameter("id");
		String name = (String) request.getParameter("name");
		String amount = (String) request.getParameter("amount");
		
		HttpSession session = request.getSession();
		
		if(validateProduct(session, id)) {
			session.setAttribute(id, new Product(id, name, stoi(amount)));
		} else {
			Product existProduct = (Product) session.getAttribute(id);
			existProduct.setAmount(existProduct.getAmount() + stoi(amount));
			session.setAttribute(id, existProduct);
		}
		
		request.getRequestDispatcher("ex3/productMain.jsp").forward(request, response);
	}
	
	private int stoi(String s) {
		return Integer.parseInt(s);
	}
	
	private boolean validateProduct(HttpSession session, String id) {
		return session.getAttribute(id) == null;
	}

}
