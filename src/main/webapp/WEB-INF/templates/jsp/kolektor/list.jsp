<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="<%= request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Daftar Kolektor</title>
    </head>
    <body>
        <h1>Daftar Kolektor</h1>

        <div class="row">
            <div class="span12">
                <div style="overflow: auto;">
                    <table class="table table-striped table-hover table-condensed table-bordered">
                        <thead>
                            <tr>
                                <th>Perusahaan</th>
                                <th>Cabang</th>
                                <th>Kode</th>
                                <th>Nama</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="k" items="${daftarKolektor}">
                                <tr>
                                    <td>${k.perusahaan}</td>
                                    <td>${k.cabang}</td>
                                    <td>${k.kode}</td>
                                    <td>${k.nama}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <!-- javascript ditaruh di akhir file supaya page bisa loading -->
        <script src="<%= request.getContextPath()%>/js/jquery.min.js"></script>
        <script src="<%= request.getContextPath()%>/js/bootstrap.min.js"></script> 
    </body>
</html>
