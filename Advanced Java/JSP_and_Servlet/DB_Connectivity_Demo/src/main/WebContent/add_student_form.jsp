<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="css/add_student_style.css">
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>Bikaner Technical University</h2>
        </div>
    </div>
    <div id="container">
        <form action="StudentControllerServlet">
            <input type="hidden" name="command" value="ADD">
            <table>
                <tbody>
                    <tr>
                        <td>
                            <label>First Name :</label>
                        </td>
                        <td>
                            <input type="text" name="firstname">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Last Name :</label>
                        </td>
                        <td>
                            <input type="text" name="lastname">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Email :</label>
                        </td>
                        <td>
                            <input type="text" name="email">
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
                <a href="StudentControllerServlet">Back To List Of Students</a>
            </p>
        </div>
    </div>
</body>
</html>