package com.general.DBConnectivityDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

public class EmployeeDBUtil {
	
	private DataSource datasource;
	
	EmployeeDBUtil(DataSource datasource) {
		
		this.datasource = datasource;
	}
	
	public Employee getEmployee(String id) throws Exception {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int ID = Integer.parseInt(id);
		
		Employee employee = null;
		
		try
		{
			conn = datasource.getConnection();
			
			String sql = "SELECT * FROM employee WHERE id=?";
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, ID);
			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				int salary = rs.getInt("salary");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String email = rs.getString("email");
				String designation = rs.getString("designation");
				
				employee = new Employee(ID, salary, firstname, lastname, email, designation);
			}
			else
			{
				throw new EmployeeNotFoundException("Couldn't find an employee with id = " + id);
			}
			
			return employee;
		}
		finally
		{
			closeAll(conn, stmt, rs);
		}
	}
	
	public List<Employee> getEmployees() throws Exception {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Employee> employees = new ArrayList<>();
		
		try
		{
			conn = datasource.getConnection();
			
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM employee";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				int id = rs.getInt("id");
				int salary = rs.getInt("salary");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String designation = rs.getString("designation");
				String email = rs.getString("email");
				
				Employee employee = new Employee(id, salary, firstname, lastname, designation, email);
				
				employees.add(employee);
			}
			
			return employees;
		}
		finally
		{
			closeAll(conn, stmt, rs);
		}
	}
	
	public void addEmployee(Employee employee) throws Exception {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try
		{
			conn = datasource.getConnection();
			
			String sql = "INSERT INTO employee (firstname, lastname, email, designation, salary) VALUES (?, ?, ?, ?, ?)";
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, employee.getFirstname());
			stmt.setString(2, employee.getLastname());
			stmt.setString(3, employee.getEmail());
			stmt.setString(4, employee.getDesignation());
			stmt.setInt(5, employee.getSalary());
			
			stmt.executeUpdate();
		}
		finally
		{
			closeAll(conn, stmt, null);
		}
	}
	
	public void updateEmployee(Employee employee) throws Exception {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		int id = employee.getId();
		int salary = employee.getSalary();
		String firstname = employee.getFirstname();
		String lastname = employee.getLastname();
		String email = employee.getEmail();
		String designation = employee.getDesignation();
		
		try
		{
			conn = datasource.getConnection();
			
			String sql = "UPDATE employee SET salary=?, firstname=?, lastname=?, email=?, designation=? WHERE id=?";
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, salary);
			stmt.setString(2, firstname);
			stmt.setString(3, lastname);
			stmt.setString(4, email);
			stmt.setString(5, designation);
			stmt.setInt(6, id);
			
			stmt.executeUpdate();
		}
		finally
		{
			closeAll(conn, stmt, null);
		}
	}
	
	public void deleteEmployee(String id) throws Exception {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		int ID = Integer.parseInt(id);
		
		try
		{
			conn = datasource.getConnection();
			
			String sql = "DELETE FROM employee WHERE id=?";
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, ID);
			
			stmt.executeUpdate();
		}
		finally
		{
			closeAll(conn, stmt, null);
		}
	}
	
	public void closeAll(Connection conn, Statement stmt, ResultSet rs) {
		
		try
		{
			if (conn != null) {
				
				conn.close();
			}
			
			if (stmt != null) {
				
				stmt.close();
			}
			
			if (rs != null) {
				
				rs.close();
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
