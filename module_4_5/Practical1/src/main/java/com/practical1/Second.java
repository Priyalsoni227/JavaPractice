package com.practical1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Second extends HttpServlet
{
   public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   PrintWriter out=res.getWriter();
	   out.println("<p>The exterior decorations of the Taj Mahal are among the finest in Mughal architecture."
	   		+ " As the surface area changes, the decorations are refined proportionally. "
	   		+ "The decorative elements were created by applying paint, stucco, stone inlays "
	   		+ "or carvings. In line with the Islamic prohibition against the use of "
	   		+ "anthropomorphic forms, the decorative elements can be grouped into either"
	   		+ " calligraphy, abstract forms or vegetative motifs. Throughout the complex "
	   		+ "are passages from the Qur'an that comprise some of the decorative elements."
	   		+ " Recent scholarship suggests that Amanat Khan chose the passages</p>");
	   
	   out.println("<a href='third' style=\"float:right;margin-right:40px;text-decoration:none;\">Next</a>");
   }
}
