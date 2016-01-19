package com.tom.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		

        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
	//	response.setHeader("Content-Type", "text/html");
		PrintWriter out = response.getWriter();
		
		//out.print("Good days are here :)");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
	  //  out.println("<meta http-equiv=Content-Type content=text/html;charset=ISO-8859-1/>");
		out.println("<title>servlet demo");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>Helloworld");
		out.println("</body>");
		out.println("</html>");
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
