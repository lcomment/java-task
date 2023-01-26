package com.ex1.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reserveTicket")
public class ReserveTicketServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String birth = (String) request.getParameter("birthday");
		String type = (String) request.getParameter("type");
		int age = calculateAge(birth);
		int cost = calculateCost(age, stoi(type));
		
		
		request.setAttribute("birth", birth);
		request.setAttribute("classification", classification(age));
		request.setAttribute("type", type);
		request.setAttribute("age", String.valueOf(age));
		request.setAttribute("dc", String.valueOf(stoi(type) - cost));
		request.setAttribute("cost", String.valueOf(cost));
		
		request.getRequestDispatcher("ex1/reservationInfo.jsp").forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ex1/ticket.jsp").forward(request, response);
	}
	
	private int calculateAge(String birthday) {
		String[] birthdaySplit = birthday.split("/");
		String curYear = getTodayYYYYMMDD().substring(0, 4);
		System.out.println(birthdaySplit[0]);
		System.out.println(curYear);
		return stoi(curYear) - stoi(birthdaySplit[0]);
	}
	
	private String classification(int age) {
		if(age <= 19) { return "미성년자"; } 
		else if(age <= 60) { return "성인"; }
		else { return "경로우대"; }
	}
	
	private int calculateCost(int age, int cost) {
		if(age <= 19) { return cost / 10 * 4; } 
		else if(age <= 60) { return cost / 10 * 9; }
		else { return cost / 2; }
	}
	
	private String getTodayYYYYMMDD() {
		SimpleDateFormat today = new SimpleDateFormat("yyyyMMdd");

        return today.format(Calendar.getInstance().getTime());
	}
	
	private int stoi(String s) {
		return Integer.parseInt(s);
	}
}
