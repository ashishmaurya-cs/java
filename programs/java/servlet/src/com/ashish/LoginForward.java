package com.ashish;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForward
 */
public class LoginForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginForward() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//requestDispatcher
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String n=request.getParameter("userName");
		String p=request.getParameter("userPass");
		
		if(n.equals("ashish")&&p.equals(123)){
			RequestDispatcher dispatcher=request.getRequestDispatcher("LoginForwardResult");
			dispatcher.forward(request, response);
		}
		else{
			RequestDispatcher dispatcher=request.getRequestDispatcher("index_loginForward.html");
			dispatcher.include(request, response);
		}
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
