package org.eventcreation;

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
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<html><body>");
		pw.println("<h1 style=\"color:#007b00;\">Event Creation</h1>");
		pw.println("<div id=\"empty\">");
		pw.println("</div>");
		pw.println("<form action=\"./Validate\" method=\"POST\">");
		pw.println("Event Name <input type=\"text\" name=\"eventName\"><br />");
		pw.println("Hall Name <input type=\"text\" name=\"hallName\"><br />");
		pw.println("Event Type <input type=\"radio\" value=\"Exhibition\" name=\"type\">Exhibition<br />");
		pw.println("<input type=\"radio\" value=\"StageShow\" name=\"type\">StageShow<br />");
		pw.println("Details <input type=\"text\" name=\"details\"><br />");
		pw.println("Owner <input type=\"text\" name=\"owner\"><br />");
		pw.println("Start Date <input type=\"text\" name=\"startDate\"><br />");
		pw.println("End Date <input type=\"text\" name=\"endDate\"><br />");
		pw.println("<input type=\"submit\" value=\"Create\" id=\"submit\">");
		pw.println("</form>");
		pw.println("</body></html>");
		pw.close();
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.println("<html><body>");
		pw.println("<form action=\"./Validate\" method=\"POST\">");
		pw.println("Event Name <input type=\"text\" name=\"eventName\"><br />");
		pw.println("Hall Name <input type=\"text\" name=\"hallName\"><br />");
		pw.println("Event Type <input type=\"radio\" value=\"Exhibition\" name=\"type\">Exhibition<br />");
		pw.println("<input type=\"radio\" value=\"StageShow\" name=\"type\">StageShow<br />");
		pw.println("Details <input type=\"text\" name=\"details\"><br />");
		pw.println("Owner <input type=\"text\" name=\"owner\"><br />");
		pw.println("Start Date <input type=\"text\" name=\"startDate\"><br />");
		pw.println("End Date <input type=\"text\" name=\"endDate\"><br />");
		pw.println("<input type=\"submit\" value=\"Create\" id=\"submit\">");
		pw.println("</form>");
		pw.println("</body></html>");
		pw.close();
	}
}
