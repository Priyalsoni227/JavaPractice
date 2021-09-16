package com.practical5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet{
	 public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		   PrintWriter out=res.getWriter();
		   String name=req.getParameter("name");
		  out.println("Hello "+name);
		   
		   
		   
	   }

}
