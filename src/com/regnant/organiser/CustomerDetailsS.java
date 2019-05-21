package com.regnant.organiser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CustomerDetailsS
 */
@WebServlet("/CustomerDetailsS")
public class CustomerDetailsS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerDetailsS() {
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
		long startTime=System.currentTimeMillis();
		String customerID = request.getParameter("customerid");
		String customerFirstName = request.getParameter("firstname");
		String customerLastName = request.getParameter("lastname");
		String customerAge = request.getParameter("age");
		String customerGender = request.getParameter("gender");
		String customerContactNumber = request.getParameter("contactnumber");
		String customerMailId = request.getParameter("mailid");
		String customerAddress = request.getParameter("address");
		String customerSchemeType = request.getParameter("schemetype");

		CustomerBean c = new CustomerBean();
		c.setcustomerId(Integer.parseInt(customerID));
		c.setfirstname(customerFirstName);
		c.setlastname(customerLastName);
		c.setage(customerAge);
		c.setgender(customerGender);
		c.setcontactno(customerContactNumber);
		c.setmailID(customerMailId);
		c.setAddress(customerAddress);
		c.setSchemeType(customerSchemeType);

		int noOFCustomers = DBCRUDOperations.insertCustomers(c);
		System.out.println("number of customers added : " + noOFCustomers);
		if (noOFCustomers == 1) {
			SendMail sm = new SendMail(customerMailId);
			sm.setname(c.lastname);
			sm.start();
			//sm.Mailsend(customerMailId);
			if (customerSchemeType.equals("A")) {
				request.getRequestDispatcher("AddPeopleToSchemeA.html").forward(request, response);
			} else if (customerSchemeType.equals("B")) {
				request.getRequestDispatcher("AddPeopleToSchemeB.html").forward(request, response);
			} else if (customerSchemeType.equals("C")) {
				request.getRequestDispatcher("AddPeopleToSchemeC.html").forward(request, response);
			}
			long endTime= System.currentTimeMillis();
			long totalTime= endTime-startTime;
			System.out.println("total time"+totalTime);
		}
		else{
			request.getRequestDispatcher("CustomerDetails.html").forward(request, response);
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
