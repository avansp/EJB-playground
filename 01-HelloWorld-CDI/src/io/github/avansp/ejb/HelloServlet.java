package io.github.avansp.ejb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.inject.Inject;

/**
 * Servlet implementation class HelloServlet
 */
@SuppressWarnings("serial")  
@WebServlet("/my-servlet")    
public class HelloServlet extends HttpServlet {
	
	@Inject
	HelloService helloService;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println("<html><head><title>My Servlet</title></head><body>");
		writer.println("<h1>Hello, World</h1>");
		
		writer.println("<p>This is a servlet, served at: " + request.getContextPath() + "</p>");
		
		writer.println("<p>" + helloService.getHelloMessage("servlet") + "</p>");
		
		writer.println("</body></html>");
		writer.close();
	}

}
