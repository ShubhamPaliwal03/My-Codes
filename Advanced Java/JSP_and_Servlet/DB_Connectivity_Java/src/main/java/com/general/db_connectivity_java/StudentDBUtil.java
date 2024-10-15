package com.general.db_connectivity_java;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDBUtil {

    private DataSource dataSource;

    public StudentDBUtil(DataSource dataSource) {

        this.dataSource = dataSource;
    }

    public List<Student> getStudents() throws Exception {

        List<Student> students = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try
        {
            // get a connection

            conn = dataSource.getConnection();

            // create a sql query string

            String sql = "SELECT * FROM student ORDER BY firstname";

            // create a sql statement

            stmt = conn.createStatement();

            // store the result set obtained by performing the query

            rs = stmt.executeQuery(sql);

            // process the result set

            while (rs.next()) {

                // retrieve the data from the result set row

                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");

                // create a new student object

                Student student = new Student(firstname, lastname, email, id);

                // add it to the list of students

                students.add(student);
            }

            return students;
        }
        finally
        {
            // clean up the JDBC code

            close(conn, stmt, rs);
        }
    }

    public void addStudent(Student student) throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            // get db connection

            conn = dataSource.getConnection();

            // create sql query string for inserting the record

            String sql = "INSERT INTO student (firstname, lastname, email) VALUES (?,?,?)";

            stmt = conn.prepareStatement(sql);

            // set the param values for the insert query

            stmt.setString(1, student.getFirstname());
            stmt.setString(2, student.getLastname());
            stmt.setString(3, student.getEmail());

            // execute the insert query

            stmt.execute();
        }
        finally
        {
            close(conn, stmt, null);
        }
    }

    public Student getStudent(String studentId) throws Exception {

        int id = Integer.parseInt(studentId);

        Student student = null;

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try
        {
            // get connection

            conn = dataSource.getConnection();

            // create sql query string

            String sql = "SELECT * FROM student WHERE id=?";

            // prepare sql statement

            stmt = conn.prepareStatement(sql);

            // set the params

            stmt.setInt(1, id);

            // execute statement

            rs = stmt.executeQuery(sql);

            // retrieve data from the result set row

            if (rs.next()) {

                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");

                // create student object

                student = new Student(firstname, lastname, email, id);
            }
            else
            {
                throw new StudentNotFoundException("Could not find any student with id = " + id);
            }

            return student;
        }
        finally
        {
            // clean up JDBC objects

            close(conn, stmt, rs);
        }
    }

    public void updateStudent(Student student) throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            // get the db connection

            conn = dataSource.getConnection();

            // create the sql query string

            String sql = "UPDATE TABLE student SET firstname=?, lastname=?, email=?, id=?";

            // prepare the sql statement

            stmt = conn.prepareStatement(sql);

            // set the params

            stmt.setString(1, student.getFirstname());
            stmt.setString(2, student.getLastname());
            stmt.setString(3, student.getEmail());
            stmt.setInt(4, student.getId());

            // execute the sql statement

            stmt.execute();
        }
        finally
        {
            close(conn, stmt, null);
        }
    }

    public void deleteStudent(String studentId) throws Exception {

        int id = Integer.parseInt(studentId);

        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            // get the db connection

            conn = dataSource.getConnection();

            // create the sql query string

            String sql = "DELETE FROM student WHERE id=?";

            // prepare the sql statement

            stmt = conn.prepareStatement(sql);

            // set the params

            stmt.setInt(1, id);

            // execute the query

            stmt.execute();
        }
        finally
        {
            close(conn, stmt, null);
        }
    }

    public void close (Connection conn, Statement stmt, ResultSet rs) {

        try
        {
            if (rs != null) {

                rs.close();
            }

            if (stmt != null) {

                stmt.close();
            }

            if (conn != null) {

                conn.close();
            }
        }
        catch (SQLException se)
        {
            System.out.println(se);
        }
        catch (Exception e)
        {

            System.out.println(e);
        }
    }
}