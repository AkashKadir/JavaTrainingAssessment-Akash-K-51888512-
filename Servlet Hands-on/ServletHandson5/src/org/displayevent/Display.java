package org.displayevent;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1>Event Details</h1>");
		pw.println("<table border='1' id=\"event\">");
		pw.println("<tr><th>Event Name</th><th>Hall Name</th><th>Price</th></tr>");
		ServletContext context = getServletContext();
		Enumeration<String> eventNames = context.getInitParameterNames();
		while(eventNames.hasMoreElements()) {
			String eventCheck = (String) eventNames.nextElement();
			if(!(eventCheck.substring(eventCheck.length()-4).equals("Cost"))) {
				pw.println("<tr><td>"+eventCheck+"</td><td>"+context.getInitParameter(eventCheck)+"</td><td>"+context.getInitParameter(eventCheck+" Cost")+"</td></tr>");
			}
		}
		pw.close();
	}

}
