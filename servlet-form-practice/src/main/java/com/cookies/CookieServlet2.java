package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet2 extends HttpServlet {

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try(PrintWriter out = resp.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet CookieServlet2</title>");
			out.println("</head>");
			out.println("<body>");
			
			String name = "";
			
			// getting all cookies
			
			Cookie[] cookies = req.getCookies();
			boolean f = false;
			if(cookies==null) {
				out.println("<h1>You are new user go to home page and submit ur name : <a href=\"statelessproblem.html\">Home</a></h1>");
			} else {
				for(Cookie c: cookies){
					String tempName = c.getName();
					if(tempName.equals("user_name")) {
						f = true;
						name = c.getValue();
						name = name.replace("+", " ");
						break;
					}
				}
			}
			
			if(f) {
				out.println("<h1>Hello, "+name+" welcome back to my website...</h1>");
				out.println("<h1>Thank You!</h1>");
			} else {
				out.println("<h1>You are new user go to home page and submit ur name : <a href=\\\"statelessproblem.html\\\">Home</a></h1>");
			}
			
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
