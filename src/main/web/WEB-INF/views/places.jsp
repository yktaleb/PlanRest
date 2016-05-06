<%@ page import="com.planrest.dao.impl.InstitutionDao" %>
<%@ page import="com.planrest.models.Institution" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/places_style.css" />" rel="stylesheet" type="text/css">


    <title>Выбор заведения</title>
    <!-- Это сккрипты для открытия и закрытия блоков с категориями -->
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $('.type_body').hide();
            $('.type_title').click(function(){
                $(this).toggleClass('opened').toggleClass('closed').next().slideToggle();
                if($(this).hasClass('opened')) {
                    $(this).html('Тип ▲');
                }
                else {
                    $(this).html('Тип ▼');
                }
            });
        });
    </script>

    <script type="text/javascript">
        $(document).ready(function(){
            $('.kitchen_body').hide();
            $('.kitchen_title').click(function(){
                $(this).toggleClass('opened').toggleClass('closed').next().slideToggle();
                if($(this).hasClass('opened')) {
                    $(this).html('Кухня ▲');
                }
                else {
                    $(this).html('Кухня ▼');
                }
            });
        });
    </script>

    <script type="text/javascript">
        $(document).ready(function(){
            $('.region_body').hide();
            $('.region_title').click(function(){
                $(this).toggleClass('opened').toggleClass('closed').next().slideToggle();
                if($(this).hasClass('opened')) {
                    $(this).html('Район ▲');
                }
                else {
                    $(this).html('Район ▼');
                }
            });
        });
    </script>

    <script type="text/javascript">
        $(document).ready(function(){
            $('.service_body').hide();
            $('.service_title').click(function(){
                $(this).toggleClass('opened').toggleClass('closed').next().slideToggle();
                if($(this).hasClass('opened')) {
                    $(this).html('Район ▲');
                }
                else {
                    $(this).html('Район ▼');
                }
            });
        });
    </script>

    <script type="text/javascript">
        $(document).ready(function(){
            $('.type_body').hide();
            $('.a').click(function(){
                $(this).toggleClass('opened').toggleClass('closed').next().slideToggle();

            });
        });
    </script>


</head>
<body>

<!-- Блок верхнего меню -->
<%@include file="jspf/top_menu.jspf" %>

<!-- Главный блок с инфой -->
<div id="main_block">
    <!-- Блок с категориями поиска (находиться в левой колонке) -->

    <%@include file="jspf/search_left_menu.jspf" %>

    <!-- Блок поиска -->
    <div class="right_colum">
        <%@include file="jspf/search_block.jspf" %>

        <!-- Блок в котором отображаеться список заведений -->
        <div class="list_of_places">

            <div class="card_of_place">

                <div class="img_place">
                    <img src="back.jpg" alt="">
                </div>

                <div class="short_inf">
                    <div class="center">
                        <div class="inf">
                            <div class = "place_name">
                                <b>Название:</b>
                            </div>

                            <div class = "place_name" id="pl_nm">
                                L`KAFA
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "region">
                                <b>Район:</b>
                            </div>

                            <div class = "region" id="reg">
                                Оболонский
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "adress">
                                <b>Адрес:</b>
                            </div>

                            <div class = "adress" id="adr">
                                проспект Героев Сталинграда,27
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "time">
                                <b>Вреия работы:</b>
                            </div>

                            <div class = "time" id="tm">
                                Круглосуточно
                            </div>
                        </div>

                    </div>

                </div>

            </div>


            <div class="card_of_place">

                <div class="img_place">
                    <img src="back.jpg" alt="">
                </div>

                <div class="short_inf">
                    <div class="center">
                        <div class="inf">
                            <div class = "place_name">
                                <b>Название:</b>
                            </div>

                            <div class = "place_name" id="pl_nm">
                                L`KAFA
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "region">
                                <b>Район:</b>
                            </div>

                            <div class = "region" id="reg">
                                Оболонский
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "adress">
                                <b>Адрес:</b>
                            </div>

                            <div class = "adress" id="adr">
                                проспект Героев Сталинграда,27
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "time">
                                <b>Вреия работы:</b>
                            </div>

                            <div class = "time" id="tm">
                                Круглосуточно
                            </div>
                        </div>

                    </div>

                </div>

            </div>

            <div class="card_of_place">

                <div class="img_place">
                    <img src="back.jpg" alt="">
                </div>

                <div class="short_inf">
                    <div class="center">
                        <div class="inf">
                            <div class = "place_name">
                                <b>Название:</b>
                            </div>

                            <div class = "place_name" id="pl_nm">
                                L`KAFA
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "region">
                                <b>Район:</b>
                            </div>

                            <div class = "region" id="reg">
                                Оболонский
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "adress">
                                <b>Адрес:</b>
                            </div>

                            <div class = "adress" id="adr">
                                проспект Героев Сталинграда,27
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "time">
                                <b>Вреия работы:</b>
                            </div>

                            <div class = "time" id="tm">
                                Круглосуточно
                            </div>
                        </div>

                    </div>

                </div>

            </div>

            <div class="card_of_place">

                <div class="img_place">
                    <img src="back.jpg" alt="">
                </div>

                <div class="short_inf">
                    <div class="center">
                        <div class="inf">
                            <div class = "place_name">
                                <b>Название:</b>
                            </div>

                            <div class = "place_name" id="pl_nm">
                                L`KAFA
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "region">
                                <b>Район:</b>
                            </div>

                            <div class = "region" id="reg">
                                Оболонский
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "adress">
                                <b>Адрес:</b>
                            </div>

                            <div class = "adress" id="adr">
                                проспект Героев Сталинграда,27
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "time">
                                <b>Вреия работы:</b>
                            </div>

                            <div class = "time" id="tm">
                                Круглосуточно
                            </div>
                        </div>

                    </div>

                </div>

            </div>

            <div class="card_of_place">

                <div class="img_place">
                    <img src="back.jpg" alt="">
                </div>

                <div class="short_inf">
                    <div class="center">
                        <div class="inf">
                            <div class = "place_name">
                                <b>Название:</b>
                            </div>

                            <div class = "place_name" id="pl_nm">
                                L`KAFA
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "region">
                                <b>Район:</b>
                            </div>

                            <div class = "region" id="reg">
                                Оболонский
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "adress">
                                <b>Адрес:</b>
                            </div>

                            <div class = "adress" id="adr">
                                проспект Героев Сталинграда,27
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "time">
                                <b>Вреия работы:</b>
                            </div>

                            <div class = "time" id="tm">
                                Круглосуточно
                            </div>
                        </div>

                    </div>

                </div>

            </div>

            <%
                InstitutionDao institutionDao = new InstitutionDao();
                List<Institution> allInstitution = institutionDao.getAllInstitution();

                for (Institution institution : allInstitution) {
                    %>
            <h1> <%=institution.getAddress()%> </h1>
            </br>
                    <%
                }
            %>

        </div>

    </div>

</div>

</body>
</html>
