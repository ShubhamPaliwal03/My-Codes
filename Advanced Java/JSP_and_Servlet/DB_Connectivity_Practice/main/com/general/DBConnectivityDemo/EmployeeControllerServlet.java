package com.general.DBConnectivityDemo;

import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

@WebServlet("/EmployeeControllerServlet")
public class EmployeeControllerServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	private EmployeeDBUtil employeeDBUtil;
	
	@Resource(name="jdbc/web_employee_tracker")
	private DataSource datasource;
	
	@Override
	public void init() throws ServletException {
		
		super.init();
		
		try
		{
			employeeDBUtil = new EmployeeDBUtil(datasource);
		}
		catch(Exception e)
		{
			throw new ServletException(e);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			String command = request.getParameter("command");
			
			if (command == null) {
				
				command = "LIST";
			}
			
			switch (command) {
			
				case "ADD" -> addEmployee(request, response);
				
				case "LOAD" -> loadEmployee(request, response);
				
				case "UPDATE" -> updateEmployee(request, response);
				
				case "DELETE" -> deleteEmployee(request, response);
				
				default -> listEmployees(request, response);
			}
		}
		catch (Exception e)
		{
			throw new ServletException(e);
		}
	}
	
	private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {

		int salary = Integer.parseInt(request.getParameter("salary"));
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String designation = request.getParameter("designation");
		
		Employee employee = new Employee(salary, firstname, lastname, email, designation);
		
		employeeDBUtil.addEmployee(employee);
		
		listEmployees(request, response);
	}
	
	private void loadEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String id = request.getParameter("employeeId");
		
		Employee employee = employeeDBUtil.getEmployee(id);
		
		request.setAttribute("EMPLOYEE", employee);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update_employee_form.jsp");
		
		dispatcher.forward(request, response);
	}
	
	private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int id = Integer.parseInt(request.getParameter("employeeId"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String designation = request.getParameter("designation");
		
		Employee employee = new Employee(id, salary, firstname, lastname, email, designation);
		
		employeeDBUtil.updateEmployee(employee);
		
		listEmployees(request, response);
	}
	
	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String id = request.getParameter("employeeId");
		
		employeeDBUtil.deleteEmployee(id);
		
		listEmployees(request, response);
	}
	
	private void listEmployees(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Employee> employees = employeeDBUtil.getEmployees();
		
		request.setAttribute("EMPLOYEES", employees);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list_employees.jsp");
		
		dispatcher.forward(request, response);
	}
}