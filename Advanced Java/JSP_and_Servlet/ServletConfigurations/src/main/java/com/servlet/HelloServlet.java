package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String message;

    public void init() {

        message = "Trying out servlet configuration parameters!";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();

        String max_shopping_cart = context.getInitParameter("max_shopping_cart");
        String project_team_name = context.getInitParameter("project_team_name");

        out.println("<html>");
            out.println("<head>");
                out.println("<title>Hello Servlet</title>");
            out.println("</head>");
            out.println("<body>");
                out.println("<h1>" + message + "</h1>");
                out.println("<br>");
                out.println("Max Cart Size: " + max_shopping_cart);
                out.println("<br>");
                out.println("Project Team Name: " + project_team_name);
            out.println("</body>");
        out.println("</html>");
    }
}