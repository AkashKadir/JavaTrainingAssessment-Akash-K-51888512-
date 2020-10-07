package org.sescook;

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
		pw.println("<h1>Event Management Sysytem</h1>");
		pw.println("<form action=\"./Welcome\" method=\"POST\">");
		pw.println("Event Name: <input type=\"text\" name=\"eventName\">");
		pw.println("<input type=\"submit\" id=\"submit\" value=\"Go\">");
		pw.println("</form>");
		pw.close();
	}

}
