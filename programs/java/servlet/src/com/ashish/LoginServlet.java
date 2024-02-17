package com.ashish;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		out.println();
		String name=request.getParameter("name");
		String password=request.getParameter("pass");
		if(password.equals("ashish97")){
			out.print("You are logged in!");
			out.print("Welcome "+name);
			
			Cookie ck=new Cookie("name",name);
			response.addCookie(ck);
		}
		else{
			out.print("Sorry, Your name or password is incorrect");
			request.getRequestDispatcher("index_loginCookie.html").include(request, response);
		}
	}

}
