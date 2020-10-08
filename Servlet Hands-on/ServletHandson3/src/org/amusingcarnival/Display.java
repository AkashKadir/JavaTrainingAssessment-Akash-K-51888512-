package org.amusingcarnival;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Display() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1>User Details</h1>");
		printWriter.println("<table border='1' id=\"user\">");
		printWriter.println("<tr><td>Name</td><td>"+request.getParameter("name")+"</td></tr>");
		printWriter.println("<tr><td>Phone Number</td><td>"+request.getParameter("phoneNumber")+"</td></tr>");
		printWriter.println("<tr><td>Email</td><td>"+request.getParameter("email")+"</td></tr>");
		printWriter.println("<tr><td>City</td><td>"+request.getParameter("city")+"</td></tr>");
		printWriter.println("</table>");
		printWriter.close();
	}

}
