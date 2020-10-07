package org.popularparadise;

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
		printWriter.println("<h1 style=\"color:#007e00;\">Welcome to Popular Paradise</h1>");
		printWriter.println("<a href=\"./Exhibition\">Exhibition</a><br/>");
		printWriter.println("<a href=\"./StageShow\">Stage Show</a>");
	}

}
