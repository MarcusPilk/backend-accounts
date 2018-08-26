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

<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Account Number</th>
        <th>Action</th>
    </tr>
    <c:forEach var = "list" items="${lists}">
        <tr>
            <td>${list.account_id}</td>
            <td>${list.first_name}</td>
            <td>${list.last_name}</td>
            <td>${list.account_number}</td>
            <td>
                <a href="/view/${list.account_id}">View</a>
                <a href="/edit/${list.account_id}">Edit</a>
                <a href="/delete/${list.account_id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<hr/>
<form method="post" action="/save">
    <input name="id" type="hidden">
    First name:<br>
    <input type="text" name="firstname">
    <br>
    Last name:<br>
    <input type="text" name="lastname">
    <br>
    Account number:<br>
    <input type="text" name="accountnumber">
    <br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
