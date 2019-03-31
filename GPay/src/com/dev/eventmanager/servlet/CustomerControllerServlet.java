package com.dev.eventmanager.servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.dev.eventmanager.beans.Customer;
import com.dev.eventmanager.dbutils.CustomerDbUtil;

/**
 * Servlet implementation class CustomerControllerServlet
 */
@WebServlet("/CustomerControllerServlet")
public class CustomerControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CustomerDbUtil customerDbUtil;
	
	@Resource(name="jdbc/event_registration")
	private DataSource datasource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		try{
			customerDbUtil = new CustomerDbUtil(datasource);
		}catch(Exception e){
			throw new ServletException(e);
		}
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		
		boolean isValid = false;
		Customer customer = null;
		String name = request.getParameter("name");
		String emailAddress = request.getParameter("emailAddress");
		String phoneNumber = request.getParameter("phoneNumber");
		String price = request.getParameter("price");

		if(name.isEmpty() || emailAddress.isEmpty() || phoneNumber.isEmpty() || price.isEmpty()){
			isValid = false;
		}else if(!price.isEmpty() && Integer.parseInt(price) <= 0){
			isValid = false;
		}else{
			customer = new Customer(name,emailAddress,phoneNumber,Integer.parseInt(price));
			isValid = true;
		}
		
		if(!isValid){
			rd = request.getRequestDispatcher("/customer-login-fail.jsp");
			rd.forward(request, response);
		}
		
		boolean isSuccess = customerDbUtil.insertIntoDB(customer);
		
		if(!isSuccess){
			rd = request.getRequestDispatcher("/customer-login-fail.jsp");
		}else{
			rd = request.getRequestDispatcher("/customer-login-success.jsp");
		}
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
