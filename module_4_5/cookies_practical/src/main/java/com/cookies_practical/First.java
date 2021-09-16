package com.cookies_practical;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class First extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		  PrintWriter out=res.getWriter();
		  String n=req.getParameter("userName");
		  out.println("Welcome "+n);
		  Cookie cookie=new Cookie("uname",n);
		  res.addCookie(cookie);
		  out.println("<a href='servlet2'>visit</a>");
	   }
}
