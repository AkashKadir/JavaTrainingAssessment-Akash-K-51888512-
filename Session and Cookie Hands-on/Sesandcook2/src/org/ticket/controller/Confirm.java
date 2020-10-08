package org.ticket.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Confirm")
public class Confirm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String ticketType = req.getParameter("seatType");
		String noOfTicket = req.getParameter("ticketCount");
		int numberOfTicket = Integer.parseInt(noOfTicket);
		int cost =0;
		if(ticketType.equals("Platinum")) {
			cost = 250*numberOfTicket;
		}
		else if(ticketType.equals("Gold")) {
			cost = 200*numberOfTicket;
		}
		else if(ticketType.equals("Silver")) {
			cost = 150*numberOfTicket;
		}
		else if(ticketType.equals("Bronze")) {
			cost = 100*numberOfTicket;
		}
		Integer costInt = cost;
		Cookie seatType = new Cookie("seatType",ticketType);
		Cookie numberOfTickets = new Cookie("numberOfTickets",noOfTicket);
		Cookie ticketCost = new Cookie("ticketCost",costInt.toString());
		res.addCookie(seatType);
		res.addCookie(numberOfTickets);
		res.addCookie(ticketCost);
		pw.println("<h1>Ticket Confirmation</h1>");
		pw.println("<div>The Ticket Cost is "+cost+"</div>");
		pw.println("<p>Do you want to confirm your ticket?</p>");
		pw.println("<form action=\"./Display\" method=\"GET\">");
		pw.println("<input type=\"submit\" value=\"Confirm\"></form>");
		pw.println("<form action=\"./Index\" method=\"GET\">");
		pw.println("<input type=\"submit\" value=\"Cancel\"></form>");
		pw.close();
	}

}
