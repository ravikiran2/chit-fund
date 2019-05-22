package com.regnant.organiser;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.regnant.admin.OrganiserBean;

/**
 * Servlet implementation class RetrieveOrganiserServlet
 */
@WebServlet("/OrganiserLogin")
public class OrganiserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrganiserLogin() {
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
		String organiserid = request.getParameter("organiserid");
		String organiserpassword = request.getParameter("organiserpassword");
		String organiserscheme = request.getParameter("organiserScheme");
		HttpSession ht= request.getSession();
		ht.setAttribute("id", organiserid);
		ht.setAttribute("Scheme", organiserscheme);
		OrganiserBean o = new OrganiserBean();
		o.setId(Integer.parseInt(organiserid));
		o.setPassword(organiserpassword);
		o.setScheme(organiserscheme);

		boolean b = DBCRUDOperations.checkOrganiser(o);

		if (b) {
			if (organiserscheme.equals("A")) {

				request.getRequestDispatcher("OperationsOrganiserA.html").forward(request, response);
			} else if (organiserscheme.equals("B")) {
				request.getRequestDispatcher("OperationsOrganiserB.html").forward(request, response);

			} else if (organiserscheme.equals("C")) {
				request.getRequestDispatcher("OperationsOrganiserC.html").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("OrganiserLogin.html").forward(request, response);
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
