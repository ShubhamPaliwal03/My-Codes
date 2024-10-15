package com.general.calculator_using_servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private String message;

    public void init() {

        message = "Servlet is running...";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String operation = request.getParameter("operation");
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        Calculator calculator = new Calculator();

        String result = calculator.getResult(num1, num2, operation);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h3>" + message + "</h3>");
        out.println("<br><br>");
        out.println("<h2 id='result'>"+ result + "</h2>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        doGet(request, response);
    }
}