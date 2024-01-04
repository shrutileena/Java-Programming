package com.hiddenformfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenFormFieldServlet2 extends HttpServlet {

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		try(PrintWriter out = resp.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet CookieServlet1</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 style='color: blue;'>Welcome to Servlet 2</h1>");
			
			String name = req.getParameter("user");
			out.println("<h1 style='color: blue;'>Welcome back "+name+"</h1>");
			
			out.println("</body>");
			out.println("</html>");
			
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	
}
