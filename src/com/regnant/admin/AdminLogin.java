package com.regnant.admin;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet(name = "AdminLogin", urlPatterns = { "/AdminLoginServlet" }, initParams = {
		@WebInitParam(name = "AdminId", value = "Admin121"), @WebInitParam(name = "password", value = "Admin@123") })
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletConfig sc = getServletConfig();
		String AdminId = sc.getInitParameter("AdminId");
		String password = sc.getInitParameter("password");

		String adminId = request.getParameter("Admin_id");
		String pwd = request.getParameter("pwd");
		if (AdminId.equals(adminId) && password.equals(pwd)) {
			request.getRequestDispatcher("AddOrganiser.html").forward(request, response);
		} else {
			request.getRequestDispatcher("AdminLogin.html").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
