package com.practical1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class First extends HttpServlet{
     public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	 PrintWriter out=res.getWriter();
    	 out.println("<p>The tomb is the central focus of the entire complex of the Taj Mahal. "
    	 		+ "It is a large, white marble structure standing on a square plinth and consists of "
    	 		+ "a symmetrical building with an iwan (an arch-shaped doorway) topped by a large dome "
    	 		+ "and finial. Like most Mughal tombs, "
    	 		+ "the basic elements are Indo-Islamic in origin.</p><br>"
    	 		+ "<p>The base structure is a large multi-chambered cube with chamfered corners "
    	 		+ "forming an unequal eight-sided structure that is approximately 55 metres (180 ft) "
    	 		+ "on each of the four long sides. Each side of the iwan is framed with a huge pishtaq or"
    	 		+ " vaulted archway with two similarly shaped arched balconies stacked on either side. "
    	 		+ "This motif of stacked pishtaqs is replicated on the chamfered corner areas, making "
    	 		+ "the design completely symmetrical on all sides of the building. Four minarets frame "
    	 		+ "the tomb, one at each corner of the plinth facing the chamfered corners. The main"
    	 		+ " chamber houses"
    	 		+ " the false sarcophagi of Mumtaz Mahal and Shah Jahan; the actual graves are at a lower "
    	 		+ "level</p>");
    	 
    	 out.println("<a href='second' style=\"float:right;margin-right:40px;text-decoration:none;\">Next</a>");
     }
}
