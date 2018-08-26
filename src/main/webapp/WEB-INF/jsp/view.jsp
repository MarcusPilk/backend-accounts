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
        <td>${account.account_id}</td>
    </tr>
    <tr>
        <th>First Name</th>
        <td>${account.first_name}</td>
    </tr>
    <tr>

        <th>Last Name</th>
        <td>${account.last_name}</td>
    </tr>
    <tr>

        <th>Account Number</th>
        <td>${account.account_number}</td>

    </tr>
</table>

</body>
</html>
