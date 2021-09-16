package com.practical1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Third extends HttpServlet{
  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	 PrintWriter out=res.getWriter();
	 out.println("<p>Abstract forms are used throughout, especially in the plinth, minarets, gateway,"
	 		+ " mosque, jawab and, to a lesser extent, on the surfaces of the tomb. The domes and "
	 		+ "vaults of the sandstone buildings are worked with tracery of incised painting to"
	 		+ " create elaborate geometric forms. Herringbone inlays define the space between many "
	 		+ "of the adjoining elements. White inlays are used in sandstone buildings, and dark or"
	 		+ " black inlays on the white marbles. Mortared areas of the marble buildings have been"
	 		+ " stained or painted in a contrasting colour which creates a complex array of "
	 		+ "geometric patterns. Floors and walkways use contrasting tiles or blocks in "
	 		+ "tessellation patterns.</p>");
  }
}
