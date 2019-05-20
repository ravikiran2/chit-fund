package com.regnant.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Organisers
 */
@WebServlet("/OrganisersS")
public class OrganisersS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrganisersS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		String organiserId=request.getParameter("id");
		String organiserName=request.getParameter("name");
		String organiserPassword= request.getParameter("password");
		String organiserScheme= request.getParameter("scheme");
		OrganiserBean o=new OrganiserBean();
		o.setId(Integer.parseInt(organiserId));
		o.setName(organiserName);
		o.setPassword(organiserPassword);
		o.setScheme(organiserScheme);
		
		int noOforaganisers=CRUDoperations.insertOrganisers(o);
		System.out.println("no of organisers inserted= "+noOforaganisers);
		request.getRequestDispatcher("OrganiserRegistered.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
