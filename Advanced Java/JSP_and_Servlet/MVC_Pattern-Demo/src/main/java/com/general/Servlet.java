package com.general;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Servlet", value = "/servlet")
public class Servlet extends HttpServlet {

    String[] students = {"Tarun", "Abhi", "Sarjeet", "Swati", "Ranu", "Akshay", "Narendra", "Shubham"};

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        // add the attribute to the request object
        request.setAttribute("student_list", students);

        // get request dispatcher
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view_students.jsp");

        // (forward) dispatch the request and response to the JSP
        dispatcher.forward(request, response);
    }
}