<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>

<html>
<head>
    <title>Spring Boot Accounts</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>HTML Table</h2>

<form method="post" action="/save">
    <table>
        <tr>
            <th>ID</th>
            <td>${account.account_id}</td>
            <input type="hidden" name="id" value="${account.account_id}" >
        </tr>
        <tr>
            <th>First Name</th>
            <td> <input name="firstname" value="${account.first_name}"></td>
        </tr>
        <tr>

            <th>Last Name</th>
            <td> <input name="lastname" value="${account.last_name}"></td>
        </tr>
        <tr>

            <th>Account Number</th>
            <td> <input name="accountnumber" value="${account.account_number}"></td>

        </tr>
    </table>
    <hr/>

    <th><input type="submit" value="Save Changes"></th>
</form>
</body>
</html>
