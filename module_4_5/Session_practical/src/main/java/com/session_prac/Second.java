package com.session_prac;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Second extends HttpServlet{
	 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		   PrintWriter out=res.getWriter();
		   
		   HttpSession session=req.getSession(false);
		  String name=(String)session.getAttribute("name");
		   out.println("Hello: "+name);
		   out.close();
	   }

}
