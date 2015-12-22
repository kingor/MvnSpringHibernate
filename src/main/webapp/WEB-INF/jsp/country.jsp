<%-- 
    Document   : country
    Created on : 21.12.2015, 15:55:56
    Author     : asup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <c:forEach var="country" items="${listCountry}">
                <tr>
                    <td>
                        <c:out value="${country.getCountryId()}"></c:out>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
