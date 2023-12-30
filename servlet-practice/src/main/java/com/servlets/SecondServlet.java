package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is second servlet (service method of GenericServlet class)");
		PrintWriter w = res.getWriter();
		res.setContentType("text/html");
		w.println("<h1>Hello! This is Second Servlet using GenericServlet class.</h1>");
		w.println("<h1><a href=\"thirdServlet\">This is Third Servlet</a></h1>");
	}

}
