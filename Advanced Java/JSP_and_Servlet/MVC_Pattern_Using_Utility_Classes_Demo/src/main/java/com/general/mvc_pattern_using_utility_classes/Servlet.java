package com.general.mvc_pattern_using_utility_classes;

import java.util.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.RequestDispatcher;

@WebServlet(name="Servlet", value="/servlet")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // get the data from the utility class

        List<Student> students = StudentDataUtil.getStudents();

        // add the data to the request

        request.setAttribute("students", students);

        // get request dispatcher

        RequestDispatcher rd = request.getRequestDispatcher("view_students.jsp");

        // forward the request to the JSP

        rd.forward(request, response);
    }
}