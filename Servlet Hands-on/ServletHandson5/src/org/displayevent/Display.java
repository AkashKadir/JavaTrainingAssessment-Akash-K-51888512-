package org.displayevent;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		ServletContext context = getServletContext();

		String date = req.getParameter("date");

		Enumeration<String> eventDates = context.getInitParameterNames();
		int j,count=0;

		while (eventDates.hasMoreElements()) {
			String dateParam = (String) eventDates.nextElement();

			if (date.equals(dateParam)) {

				pw.println("<h1>Event Details</h1>");
				pw.println("<table border='1' id=\"event\">");
				pw.println("<tr><th>Event Name</th><th>Hall Name</th><th>Price</th></tr>");
				String value = context.getInitParameter(dateParam);
				String[] details = value.split("/");

				for (int i = 0; i < details.length; i++) {
					String[] eventDetails = details[i].split(",");
					j = 0;
					pw.println("<tr><td>" + eventDetails[j++] + "</td><td>" + eventDetails[j++] + "</td><td>"
							+ eventDetails[j] + "</td></tr>");
				}
				pw.println("</table>");
				count++;
				break;
			}
			
		}

		if(count==0) {
			RequestDispatcher rd = req.getRequestDispatcher("Index");
			pw.println("<p style='color:red;'>No Events are scheduled on this date.</p>");
			rd.include(req, res);
		}

	}

}
