package com.regnant.organiser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateSchemeS
 */
@WebServlet("/UpdateSchemeS")
public class UpdateSchemeS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateSchemeS() {
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

		String customerid = request.getParameter("id");
		String customerScheme = request.getParameter("schemetype");
		String numberOfMonthsPaid = request.getParameter("monthspaid");
		String numberOfMonthsPending = request.getParameter("monthspending");

		SchemeBean s = new SchemeBean();
		s.setId(Integer.parseInt(customerid));
		s.setSchemeType(customerScheme);
		s.setMonthsPaid(numberOfMonthsPaid);
		s.setMonthsPending(numberOfMonthsPending);

		if (customerScheme.equals("A")) {
			int noOfRowsUpdated = DBCRUDOperations.updateSchemeA(s);
			System.out.println("number of rows updated: " + noOfRowsUpdated);
			request.getRequestDispatcher("UpdateSuccess.html").forward(request, response);
		} else if (customerScheme.equals("B")) {
			int noOfRowsUpdated = DBCRUDOperations.updateSchemeB(s);
			System.out.println("number of rows updated: " + noOfRowsUpdated);
			request.getRequestDispatcher("UpdateSuccess.html").forward(request, response);
		} else if (customerScheme.equals("C")) {
			int noOfRowsUpdated = DBCRUDOperations.updateSchemeC(s);
			System.out.println("number of rows updated: " + noOfRowsUpdated);
			request.getRequestDispatcher("UpdateSuccess.html").forward(request, response);

		} else {
			request.getRequestDispatcher("Invalid.html").forward(request, response);

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
