package org.popularparadise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exhibition extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Exhibition() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1 style=\"color:#007e00;\">TextFair 2018 expo</h1>");
		printWriter.println("<table border='1'>");
		printWriter.println("<tr><th>Name</th><th>TextFair 2017 expo</th></tr>");
		printWriter.println("<tr><td>Hall Name</td><td>PVR Superplex</td></tr>");
		printWriter.println("<tr><td>Start Date</td><td>10-10-2020</td></tr>");
		printWriter.println("<tr><td>End Date</td><td>10-10-2030</td></tr>");
		printWriter.println("</table>");
		printWriter.close();
	}

}
