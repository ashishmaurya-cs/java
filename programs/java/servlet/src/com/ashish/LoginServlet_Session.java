package com.ashish;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet_Session
 */
public class LoginServlet_Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet_Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		request.getRequestDispatcher("link_Session.html").include(request, response);
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(password.equals("ashish@97")){
			out.print("You are logged in!<br>");
			out.print("Welcome "+name);
			HttpSession session =request.getSession();
			session.setAttribute("name",name);
			
		}
		else{
			out.print("Sorry, wrong password!");
			request.getRequestDispatcher("index_loginSession.html").include(request, response);
		}
	}

}
