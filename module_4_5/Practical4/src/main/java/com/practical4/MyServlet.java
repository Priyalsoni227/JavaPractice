package com.practical4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		out.println("Hi<br>");
		
		ServletContext ctx= getServletContext();
		ServletConfig cnf=getServletConfig();
		
		String name=ctx.getInitParameter("name");
		String name2=cnf.getInitParameter("name");
		String phone=ctx.getInitParameter("phone");
		out.println(name);
		out.println(name2);
		out.println(phone);
	}

}
