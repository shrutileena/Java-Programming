package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	ServletConfig conf;
	
	// lifecycle methods of a servlet
	
	@Override
	public void init(ServletConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		this.conf=conf;
		System.out.println("Creating object...");
	} 
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Servicing....");

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>First Servlet Project!</h1>");
		writer.println("<h2>Today's date and time is: "+new Date()+"</h2>");
		writer.println("<a href=\"secondServlet\">This is my Second Servlet</a>");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroying");
	}

	// Non-lifecycle methods
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created by Shruti";
	}

}
