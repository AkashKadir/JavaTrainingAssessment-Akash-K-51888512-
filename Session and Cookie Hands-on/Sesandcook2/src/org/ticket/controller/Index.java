package org.ticket.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1>Book My Show</h1>");
		pw.println("<form action=\"./Confirm\" method=\"POST\">");
		pw.println("Select Ticket Type: <select name=\"seatType\" id=\"SeatingSection\">"
				+ "<option value=\"Platinum\">Platinum</option>"
				+ "<option value=\"Gold\">Gold</option>"
				+ "<option value=\"Silver\">Silver</option>"
				+ "<option value=\"Bronze\">Bronze</option>");
		pw.println("Enter the number of ticket <input type=\"number\" name=\"ticketCount\">");
		pw.println("<input type=\"submit\" value=\"Book Ticket\" id=\"book\">");
		pw.println("</form>");
		pw.close();
	}

}
