package com.regnant.organiser;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddSchemeAServlet
 */
@WebServlet("/AddSchemeAServlet")
public class AddSchemeAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSchemeAServlet() {
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
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String schemeType = request.getParameter("schemeType");
		String monthsPaid = request.getParameter("monthsPaid");
		String monthsPending = request.getParameter("monthsPending");
		String status = request.getParameter("status");
		String password = request.getParameter("password");

		SchemeBean u = new SchemeBean();
		u.setId(Integer.parseInt(id));
		u.setName(name);
		u.setSchemeType(schemeType);
		u.setMonthsPaid(monthsPaid);
		u.setMonthsPending(monthsPending);
		u.setStatus(status);
		u.setPassword(password);
		DBCRUDOperations dbop = new DBCRUDOperations();
		int row_count = dbop.AddSchemeA(u);
		System.out.println(row_count + "is inserted");
		if (row_count == 1) {

			ServletContext sc = getServletContext();
			String mail = (String) sc.getAttribute("mail");

			SendMail sm = new SendMail(mail);
			sm.setname(name);
			sm.Mailsend1();
			request.getRequestDispatcher("success.html").forward(request, response);
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
