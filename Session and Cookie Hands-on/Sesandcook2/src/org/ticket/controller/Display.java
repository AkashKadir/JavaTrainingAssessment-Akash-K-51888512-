package org.ticket.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String[] cookieNames = {"Ticket Type","Number of Tickets","Ticket Cost"};
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1>Ticket booked Successfully</h1>");
		pw.println("<table border='1' id=\"ticketDetail\">");
		Cookie cookie[]=req.getCookies();
		for(int i=0;i<cookie.length;i++) {
			pw.println("<tr><td>"+cookieNames[i]+"</td><td>"+cookie[i].getValue()+"</td></tr>");
		}
		pw.println("</table>");
		pw.close();
	}

}
