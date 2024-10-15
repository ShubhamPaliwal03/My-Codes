<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>Bikaner Technical University</h2>
        </div>
    </div>
    <div id="container">
        <h3>Update Student</h3>
        <form action="StudentControllerServlet">
            <input type="hidden" name="command" value="UPDATE">
            <input type="hidden" name="studentId" value="${STUDENT.id}">
            <table>
                <tbody>
                    <tr>
                        <td>
                            <label>First Name:</label>
                        </td>
                        <td>
                            <input type="text" name="firstname" value="${STUDENT.firstname}">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Last Name:</label>
                        </td>
                        <td>
                            <input type="text" name="lastname" value="${STUDENT.lastname}">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Email:</label>
                        </td>
                        <td>
                            <input type="text" name="email" value="${STUDENT.email}">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label></label>
                        </td>
                        <td>
                            <input type="submit" value="Save" class="save">
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
        <div style="clear: both;">
            <p>
                <a href="StudentControllerServlet">Back To Student List</a>
            </p>
        </div>
    </div>
</body>
</html>