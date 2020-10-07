package org.hallparadise;

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
    public Index() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1 style=\"color:#ff1292;\">Welcome to Hall Paradise</h1>");
		printWriter.println("<p>The type of events are</p>");
		printWriter.println("<ul><li>Exhibition</li>");
		printWriter.println("<li>Stage Show</li></ul>");
	}

}
