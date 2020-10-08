package org.popularparadise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public StageShow() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1 style=\"color:#007e00;\">New Year Eve</h1>");
		printWriter.println("<table border='1'>");
		printWriter.println("<tr><th>Name</th><th>New Year Eve</th></tr>");
		printWriter.println("<tr><td>Hall Name</td><td>PVR Lulu Mall</td></tr>");
		printWriter.println("<tr><td>Date</td><td>10-10-2020</td></tr>");
		printWriter.println("<tr><td>Start Time</td><td>10:00:00</td></tr>");
		printWriter.println("<tr><td>End Time</td><td>12:00:00</td></tr>");
		printWriter.println("</table>");
		printWriter.close();
	}

}
