package com.practical2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DetailsServlet extends HttpServlet{
   public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   PrintWriter out=res.getWriter();
	   String firstname=req.getParameter("firstname");
	   String lastname=req.getParameter("lastname");
	   String email=req.getParameter("email");
	   String address=req.getParameter("address");
	   out.println("<b>First name:</b> "+firstname+"<br>"); 
	   out.println("<b>Last name:</b> "+lastname+"<br>");
	   out.println("<b>Email:</b> "+email+"<br>");
	   out.println("<b>Address:</b> "+address);
   }
}
