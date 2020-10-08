package org.amusingcarnival;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Index() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1>User Details</h1>");
		printWriter.println("<form action=\"./Display\" method=\"POST\">");
		printWriter.println("Name : <input type=\"text\" name=\"name\"><br />");
		printWriter.println("Phone Number : <input type=\"number\" name=\"phoneNumber\"><br />");
		printWriter.println("Email : <input type=\"text\" name=\"email\"><br />");
		printWriter.println("City : <input type=\"text\" name=\"city\"><br />");
		printWriter.println("<input type=\"submit\" value=\"submit\" id=\"submit\">");
		printWriter.println("</form>");
		printWriter.close();
	}

}
