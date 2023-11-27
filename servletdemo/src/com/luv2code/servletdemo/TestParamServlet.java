package com.luv2code.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestParamServlet
 */
@WebServlet("/TestParamServlet")
public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// set the content type
				response.setContentType("text/html");
				
				//get printwriter
				PrintWriter out = response.getWriter();
				
				//read the configuration params
				ServletContext context = getServletContext();
				String maxCartSize = context.getInitParameter("max-shopping-cart-size");
				String teamName = context.getInitParameter("project-team-name");
				
				//generate HTML content 
				out.println("<html><body>");
				
				out.println("Cart size: " + maxCartSize);
				out.println("</br></br>");
				out.println("Team name: " + teamName);
				
				out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
