package com.practical5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet{
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	   PrintWriter out=res.getWriter();
	   String name=req.getParameter("name");
	   String pass=req.getParameter("password");
	   
	   if((name.equals("abc")) && (pass.equals("123"))){
		   RequestDispatcher dis=req.getRequestDispatcher("welcome");
		   dis.forward(req, res);
	   }
	   else {
		   out.println("username or password incorrect");
		   RequestDispatcher dis=req.getRequestDispatcher("index.html");
		   dis.include(req, res);
	   }
	   
   }
}
