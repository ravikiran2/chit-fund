package com.regnant.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServletA")
public class CustomerServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerServletA() {
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
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		SchemeBean b = new SchemeBean();
		b.setId(Integer.parseInt(id));
		b.setPassword(password);
		boolean checkA = DBCRUDOperations.checkloginA(b);
		boolean checkB = DBCRUDOperations.checkloginA(b);
		boolean checkC = DBCRUDOperations.checkloginA(b);
		if (checkA) {
			List<SchemeBean> CustomerDetails = DBCRUDOperations.customerLoginA(b);
			request.setAttribute("abcd", CustomerDetails);

			RequestDispatcher rs = request.getRequestDispatcher("CustomerA.jsp");
			rs.forward(request, response);
		} else if (checkB) {
			List<SchemeBean> CustomerDetails = DBCRUDOperations.customerLoginB(b);
			request.setAttribute("abcd", CustomerDetails);

			RequestDispatcher rs = request.getRequestDispatcher("CustomerB.jsp");
			rs.forward(request, response);
		} else if (checkC) {
			List<SchemeBean> CustomerDetails = DBCRUDOperations.customerLoginC(b);
			request.setAttribute("abcd", CustomerDetails);

			RequestDispatcher rs = request.getRequestDispatcher("CustomerC.jsp");
			rs.forward(request, response);
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
