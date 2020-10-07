package org.displayevent;

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
		pw.println("<h1>Search Event</h1>");
		pw.println("<form action=\"./Display\" method=\"POST\">");
		pw.println("Enter Date <input type=\"text\" name=\"date\">");
		pw.println("<input type=\"submit\" id=\"search\" value=\"Search\">");
		pw.println("</form>");
		pw.close();
	}

}
