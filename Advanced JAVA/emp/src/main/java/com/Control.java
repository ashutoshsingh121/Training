package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		EmployeeDAOImpl impl = new EmployeeDAOImpl();
		
		String task=request.getParameter("task");
		
		switch(task) {
		case "add":
			
			int res = impl.add(new Employee(0,request.getParameter("name"),Float.parseFloat(request.getParameter("salary"))));
			
			request.setAttribute("res","Employee added successfully");
			
			request.getRequestDispatcher("result.jsp").forward(request, response);;
			
			break;
			
			default:
				 System.out.println("Default");
		}
	}

}

