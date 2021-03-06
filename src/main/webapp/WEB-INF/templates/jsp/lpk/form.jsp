<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="<%= request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Form LPK</title>
    </head>
    <body>
        <h1>${namaScreen}</h1>
        
        <div class="row">

            <form class="form-horizontal" action="" method="post">
                <div class="span6">
                    <div class="control-group">
                        <label class="control-label" for="noLpk">No LPK</label>
                        <div class="controls">
                            <input type="text" id="noLpk" name="noLpk" placeholder="No. LPK">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="kolektor">Kolektor</label>
                        <div class="controls">
                            <select id="kolektor" name="kolektor">
                                <c:forEach var="kolektor" items="${daftarKolektor}">
                                <option value="${kolektor.id}">${kolektor.nama}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="span6">
                    <div class="control-group">
                        <label class="control-label" for="tanggalLpk">Tanggal</label>
                        <div class="controls">
                            <input type="date" id="tanggalLpk" name="tanggalLpk" placeholder="Tanggal">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="nilai">Nilai</label>
                        <div class="controls">
                            <input type="text" id="nilai" name="nilai" placeholder="Nilai">
                        </div>
                    </div>
                </div>

                <input type="submit" class="btn btn-primary" value="Simpan"/>
            </form>
        </div>

        <div class="row">
            <div class="span12">
                <div style="overflow: auto;">
                    <table class="table table-striped table-hover table-condensed table-bordered">
                        <thead>
                            <tr>
                                <th>No. Booking</th>
                                <th>Nama Konsumen</th>
                                <th>Nilai</th>
                                <th>Status</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>123</td>
                                <td>Endy</td>
                                <td>123.000</td>
                                <td>OK</td>
                            </tr>
                            <tr>
                                <td>123</td>
                                <td>Endy</td>
                                <td>123.000</td>
                                <td>OK</td>
                            </tr>
                            <tr>
                                <td>123</td>
                                <td>Endy</td>
                                <td>123.000</td>
                                <td>OK</td>
                            </tr>
                            <tr>
                                <td>123</td>
                                <td>Endy</td>
                                <td>123.000</td>
                                <td>OK</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="span12">
                <div style="overflow: auto; height: 200px;">
                    <table class="table table-striped table-hover table-condensed table-bordered">
                        <thead>
                            <tr>
                                <th>No. Kwitansi</th>
                                <th>Ke</th>
                                <th>Angsuran</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>123</td>
                                <td>001</td>
                                <td>123.000</td>
                            </tr>
                            <tr>
                                <td>123</td>
                                <td>001</td>
                                <td>123.000</td>
                            </tr>
                            <tr>
                                <td>123</td>
                                <td>001</td>
                                <td>123.000</td>
                            </tr>
                            <tr>
                                <td>123</td>
                                <td>001</td>
                                <td>123.000</td>
                            </tr>
                            <tr>
                                <td>123</td>
                                <td>001</td>
                                <td>123.000</td>
                            </tr>
                            <tr>
                                <td>123</td>
                                <td>001</td>
                                <td>123.000</td>
                            </tr>
                            <tr>
                                <td>123</td>
                                <td>001</td>
                                <td>123.000</td>
                            </tr>
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
