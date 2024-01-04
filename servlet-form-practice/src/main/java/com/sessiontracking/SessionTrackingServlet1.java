package com.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTrackingServlet1 extends HttpServlet {

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
			
			String name = req.getParameter("user_name");
			
			HttpSession session = req.getSession();
			session.setAttribute("user", name);
			
			out.println("<h1>Welcome "+name+"</h1>");
			out.println("<a href='SessionTrackingServlet2'>Go to Second Servlet</a>");
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
