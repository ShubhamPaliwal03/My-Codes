package com.general.definingperservletparameters;

import java.io.*;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.*;

public class PerServletParametersDemo extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // set content type

        response.setContentType("text/html");

        // get printwriter

        PrintWriter out = response.getWriter();

        // obtain the servlet context, and read thr configuration parameters

        ServletContext context = getServletContext();

        String maxCartSize = context.getInitParameter("max-shopping-cart-size");
        String teamName = context.getInitParameter("project-team-name");

        // read per servlet parameter

        String greetingMessage = getInitParameter("greeting");
        String serviceLevel = getInitParameter("service-level");

        // generate HTML content

        out.println("<html><body>");
        out.println("<h1>Servlet PerServletParametersDemo</h1>");
        out.println("<br>");
        out.println("<h2>Global Servlet Parameters :-</h2>");
        out.println("<br>");
        out.println("Max Cart : " + maxCartSize);
        out.println("<br>");
        out.println("Team Name : " + teamName);
        out.println("<br>");
        out.println("<h2>Per Servlet Parameters :-</h2>");
        out.println("Greeting Message : " + greetingMessage);
        out.println("<br>");
        out.println("Service Level : " + serviceLevel);
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        doGet(request, response);
    }
}