package com.general.db_connectivity_java;

import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.sql.DataSource;

@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private StudentDBUtil studentDBUtil;

    // Resource Injection of Database (data source)
    @Resource(name="jdbc/web_student_tracker")
    private DataSource dataSource;

    @Override
    public void init() throws ServletException {

        super.init();

        // create an object of StudentDBUtil,
        // and pass in the connection pool / datasource

        try
        {
            studentDBUtil = new StudentDBUtil(dataSource);
        }
        catch (Exception exc)
        {
            throw new ServletException(exc);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        try
        {
            // read the "command" parameter

            String command = request.getParameter("command");

            // if command is missing, then default to listing students

            if (command == null) {

                command = "LIST";
            }

            switch (command) { 

                case "ADD" -> addStudent(request, response);

                case "LOAD" -> loadStudent(request, response);

                case "UPDATE" -> updateStudent(request, response);

                case "DELETE" -> deleteStudent(request, response);

                default -> listStudents(request, response);
            }
        }
        catch (Exception exc)
        {
            throw new ServletException(exc);
        }
    }

    private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // get list of students from db util

        List<Student> students = studentDBUtil.getStudents();

        // add the list object of students to the request

        request.setAttribute("STUDENT_LIST", students);

        // obtain the object of request dispatcher

        RequestDispatcher dispatcher = request.getRequestDispatcher("/list_students.jsp");

        // forward to request to the JSP page (view)

        dispatcher.forward(request, response);
    }

    private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // get the data from the form submitted by the user

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");

        // create Student object, having the above extracted attributes

        Student student = new Student(firstname, lastname, email);

        // add the student to the database

        studentDBUtil.addStudent(student);

        // redirect the user back to the main page (list_students.jsp)

        listStudents(request, response);
    }

    private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // read student id from the data

        String studentId = request.getParameter("studentId");

        // get student from the database

        Student student = studentDBUtil.getStudent(studentId);

        // place the student in the request attribute

        request.setAttribute("STUDENT", student);

        // obtain an object of request dispatcher

        RequestDispatcher dispatcher = request.getRequestDispatcher("/update_student_form.jsp");

        // forward (dispatch) the request to the JSP page (view)

        dispatcher.forward(request, response);
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // read student data from the form response
    	
    	int id = Integer.parseInt(request.getParameter("studentId"));
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");

        // create a new student object

        Student student = new Student(firstname, lastname, email, id);

        // update the data in the database

        studentDBUtil.updateStudent(student);

        // redirect the user back to the main page (list_students.jsp)

        listStudents(request, response);
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // read the student id from the form data

        String studentId = request.getParameter("studentId");

        // delete the record from the database

        studentDBUtil.deleteStudent(studentId);

        // redirect the user back to the main page (list_students.jsp)

        listStudents(request, response);
    }
}