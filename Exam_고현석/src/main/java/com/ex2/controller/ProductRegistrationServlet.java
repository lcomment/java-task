package com.ex2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.Product;


@WebServlet("/ex2/productReg")
public class ProductRegistrationServlet extends HttpServlet {
	private HashMap<String, Product> products = new HashMap<String, Product>();

	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = (String) request.getParameter("id");
		String name = (String) request.getParameter("name");
		String amount = (String) request.getParameter("amount");
		
		if(!validateProduct(id)) {
			products.put(id, new Product(id, name, stoi(amount)));
		} else {
			products.get(id).setAmount(products.get(id).getAmount() + stoi(amount));
		}
		
		request.setAttribute("products", products);
		
		request.getRequestDispatcher("productInfo.jsp").forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("productForm.jsp").forward(request, response);
	}
	
	private int stoi(String s) {
		return Integer.parseInt(s);
	}
	
	private boolean validateProduct(String id) {
		return products.containsKey(id);
	}
}
