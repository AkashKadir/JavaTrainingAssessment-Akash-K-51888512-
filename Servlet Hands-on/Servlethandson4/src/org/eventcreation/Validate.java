package org.eventcreation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String eventName = req.getParameter("eventName");	
		String hallName = req.getParameter("hallName");	
		String type = req.getParameter("type");	
		String details = req.getParameter("details");	
		String owner = req.getParameter("owner");
		String startDate = req.getParameter("startDate");
		String endDate = req.getParameter("endDate");
		if(eventName==""||hallName==""||type==""||details==""||owner==""||startDate==""||endDate=="") {
			RequestDispatcher rd = req.getRequestDispatcher("/Index");
			pw.println("<h1 style=\"color:#007b00;\">Event Creation</h1>");
			pw.println("<div>");
			if(eventName=="") {				
				pw.println("<p style=\"color:red;\">Event name must not be empty.</p>");				
			}
			if(hallName=="") {				
				pw.println("<p style=\"color:red;\">Hall name must not be empty.</p>");				
			}
			if(type==null) {	
				
				pw.println("<p style=\"color:red;\">Event Type must not be empty.</p>");				
			}
			if(details=="") {				
				pw.println("<p style=\"color:red;\">Event details must not be empty.</p>");				
			}
			if(owner=="") {				
				pw.println("<p style=\"color:red;\">Event Owner name must not be empty.</p>");				
			}
			if(startDate=="") {				
				pw.println("<p style=\"color:red;\">Start Date must not be empty.</p>");				
			}
			if(endDate=="") {				
				pw.println("<p style=\"color:red;\">End Date must not be empty.</p>");				
			}
			pw.println("</div>");
			rd.include(req, res);
		}else {
			pw.println("<h1>Event Created Successfully!!!</h1>");
			pw.println("<h3>Event Details</h3>");
			pw.println("<table border='1' id=\"event\">");
			pw.println("<tr><td>Event Name</td><td>"+eventName+"</td></tr>");
			pw.println("<tr><td>Hall Name</td><td>"+hallName+"</td></tr>");
			pw.println("<tr><td>Event Type</td><td>"+type+"</td></tr>");
			pw.println("<tr><td>Details</td><td>"+details+"</td></tr>");
			pw.println("<tr><td>Owner</td><td>"+owner+"</td></tr>");
			pw.println("<tr><td>Start Date</td><td>"+startDate+"</td></tr>");
			pw.println("<tr><td>End Date</td><td>"+endDate+"</td></tr>");
			pw.println("</table>");
			pw.close();
		}
		pw.close();
	}

}
