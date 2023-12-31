package com.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet {
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try(PrintWriter out = resp.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet S1</title>");
			out.println("</head>");
			out.println("<body>");
			
			Integer n1 = Integer.parseInt(req.getParameter("n1"));
			Integer n2 = Integer.parseInt(req.getParameter("n2"));
			
			Integer p = n1 * n2;
			
			// setting attribute
			Integer sum = (Integer) req.getAttribute("sum");

			out.println("<h1>");
			out.println("Sum is = " + sum);
			out.println("Product is = " + p);
			out.println("</h1>");
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
