package com.theone.sc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Servlet1 accepted the request");
		RequestDispatcher dispatchar = request.getRequestDispatcher("Servlet2");
		dispatchar.include(request,response);
		System.out.println("Servlet 1 get the response from Servlet 2 and then include it and return back to UI");
		response.getWriter().print("<br> Response sendback from Servlet 1");
		
	}

}
