package org.sescook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		HttpSession session = req.getSession();
		session.setAttribute("eventname",req.getParameter("eventName"));
		pw.println("<h1>Event Management System</h1>");
		pw.println("<form action=\"./Display\" method=\"POST\">");
		pw.println("<div>Welcome to this event "+req.getParameter("eventName")+" </div>");
		pw.println("<input value=\"Get Detail\" type=\"submit\" id=\"detail\">");
		pw.println("</form>");
		pw.close();
	}

}
