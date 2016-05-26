<%@ page import="java.util.ArrayList" %>
<%@ page import="com.planrest.util.KitchenList" %>
<%@ page import="com.planrest.util.ServiceList" %>
<%@ page import="com.planrest.util.TypeList" %>
<%@ page import="com.planrest.util.RegionList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/admin_pages/admin_new_place_style.css" />" rel="stylesheet" type="text/css">
    <title>Создание странички нового заведения</title>

    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
    <script type="text/javascript">

        function DropDown(el) {
            this.dd = el;
            this.opts = this.dd.find('ul.dropdown > li');
            this.val = [];
            this.index = [];
            this.initEvents();
        }
        DropDown.prototype = {
            initEvents : function() {
                var obj = this;

                obj.dd.on('click', function(event){
                    $(this).toggleClass('active');
                    event.stopPropagation();
                });

                obj.opts.children('label').on('click',function(event){
                    var opt = $(this).parent(),
                            chbox = opt.children('input'),
                            val = chbox.val(),
                            idx = opt.index();

                    ($.inArray(val, obj.val) !== -1) ? obj.val.splice( $.inArray(val, obj.val), 1 ) : obj.val.push( val );
                    ($.inArray(idx, obj.index) !== -1) ? obj.index.splice( $.inArray(idx, obj.index), 1 ) : obj.index.push( idx );
                });
            },
            getValue : function() {
                return this.val;
            },
            getIndex : function() {
                return this.index;
            }
        }

        $(function() {

            var dd = new DropDown( $('#dd1') );

            $(document).click(function() {
                // all dropdowns
                $('.wrapper-dropdown-1').removeClass('active');
            });

        });

    </script>

    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>

    <script type="text/javascript">

        function DropDown(el) {
            this.dd = el;
            this.opts = this.dd.find('ul.dropdown > li');
            this.val = [];
            this.index = [];
            this.initEvents();
        }
        DropDown.prototype = {
            initEvents : function() {
                var obj = this;

                obj.dd.on('click', function(event){
                    $(this).toggleClass('active');
                    event.stopPropagation();
                });

                obj.opts.children('label').on('click',function(event){
                    var opt = $(this).parent(),
                            chbox = opt.children('input'),
                            val = chbox.val(),
                            idx = opt.index();

                    ($.inArray(val, obj.val) !== -1) ? obj.val.splice( $.inArray(val, obj.val), 1 ) : obj.val.push( val );
                    ($.inArray(idx, obj.index) !== -1) ? obj.index.splice( $.inArray(idx, obj.index), 1 ) : obj.index.push( idx );
                });
            },
            getValue : function() {
                return this.val;
            },
            getIndex : function() {
                return this.index;
            }
        }

        $(function() {

            var dd = new DropDown( $('#dd3') );

            $(document).click(function() {
                // all dropdowns
                $('.wrapper-dropdown-3').removeClass('active');
            });

        });

    </script>

    <script type="text/javascript">

        function DropDown(el) {
            this.dd = el;
            this.opts = this.dd.find('ul.dropdown > li');
            this.val = [];
            this.index = [];
            this.initEvents();
        }
        DropDown.prototype = {
            initEvents : function() {
                var obj = this;

                obj.dd.on('click', function(event){
                    $(this).toggleClass('active');
                    event.stopPropagation();
                });

                obj.opts.children('label').on('click',function(event){
                    var opt = $(this).parent(),
                            chbox = opt.children('input'),
                            val = chbox.val(),
                            idx = opt.index();

                    ($.inArray(val, obj.val) !== -1) ? obj.val.splice( $.inArray(val, obj.val), 1 ) : obj.val.push( val );
                    ($.inArray(idx, obj.index) !== -1) ? obj.index.splice( $.inArray(idx, obj.index), 1 ) : obj.index.push( idx );
                });
            },
            getValue : function() {
                return this.val;
            },
            getIndex : function() {
                return this.index;
            }
        }

        $(function() {

            var dd = new DropDown( $('#dd4') );

            $(document).click(function() {
                // all dropdowns
                $('.wrapper-dropdown-4').removeClass('active');
            });

        });

    </script>

</head>

<body>
    <%request.setCharacterEncoding("UTF-8");%>

    <%@include file="/WEB-INF/views/jspf/top_menu.jspf" %>

    <%
        ArrayList<String> kitchenTitles = KitchenList.getKitchenList();
        ArrayList<String> serviceTitles = ServiceList.getServiceList();
        ArrayList<String> typeTitles = TypeList.getTypeList();
        ArrayList<String> regionLists = RegionList.getRegionList();

    %>

    <form method="GET"  action="admin_new_place_check" acceptCharset="UTF-8" enctype="multipart/form-data">
        <div id="main-block">
            <p><h3>Заполните поля указаной информацией о заведении</h3></p>
            <ol>
                <li>
                    <p>Аватар:</p>
                    <input type="file" class="img_place" name="avatar"/>
                    <br/>
                    <p>Текстовая информация:</p>
                    <label for="name" >Название:</label>
                    <input type="text" id="name" name="value"/>
                    <br/><br/>
                    <label for="type" >Тип заведения:</label>
                    <!-- <input type="text" id="type" /> -->

                    <div id="dd1" class="wrapper-dropdown-1">
                        Выберите тип
                        <ul class="dropdown">
                            <%
                                for (String typeTitle : typeTitles) {
                            %>
                            <li><input type="checkbox" name="type" value="<%=typeTitle%>"/><label><%=typeTitle%></label></li>
                            <%
                                }
                            %>
                        </ul>
                    </div>

                    <br/><br/>
                    <label for="region" >Район:</label>
                    <div class="region_list">
                        <ol class="rg_list">
                            <li><input type="radio" name="region" value="Голосеевский" /> <label for="region">Голосеевский</label></li>
                            <li><input type="radio" name="region" value="Дарницкий" /> <label for="region">Дарницкий</label></li>
                            <li><input type="radio" name="region" value="Деснянкий" /> <label for="region">Деснянский</label></li>
                            <li><input type="radio" name="region" value="Днепровский" /> <label for="region">Днепровский</label></li>
                            <li><input type="radio" name="region" value="Оболонский" /> <label for="region">Оболонский</label></li>
                            <li><input type="radio" name="region" value="Печерский" /> <label for="region">Печерский</label></li>
                            <li><input type="radio" name="region" value="Подольский" /> <label for="region">Подольский</label></li>
                            <li><input type="radio" name="region" value="Святошинский" /> <label for="region">Святошинский</label></li>
                            <li><input type="radio" name="region" value="Соломенский" /> <label for="region">Соломенский</label></li>
                            <li><input type="radio" name="region" value="Шевченковский" /> <label for="region">Шевченковский</label></li>
                        </ol>
                    </div>

                    <br/><br/>
                    <label for="telephone">Телефон:</label>
                    <input type="tel" id="telephone" name="value"/>
                    <br/><br/>
                    <label for="adress">Адрес:</label>
                    <input type="text" id="adress" name="value"/>
                    <br/><br/>
                    <label for="time_worcking">Время работы:</label>
                    <input type="text" id="time_worcking" name="value"/>
                    <br/><br/>
                    <label for="kitchen">Кухня:</label>
                    <!-- <input type="text" id="kitchen" /> -->

                    <div id="dd3" class="wrapper-dropdown-3">
                        Выберите кухню
                        <ul class="dropdown">
                            <%
                                for (String kitchenTitle : kitchenTitles) {
                            %>
                            <li><input type="checkbox" name="kitchen" value="<%=kitchenTitle%>" /><label ><%=kitchenTitle%></label></li>
                            <%
                                }
                            %>

                        </ul>
                    </div>

                    <br/><br/>
                    <label for="service">Сервис:</label>
                    <!-- <input type="text" id="service" /> -->

                    <div id="dd4" class="wrapper-dropdown-4">
                        Выберите сервис
                        <ul class="dropdown">
                            <%
                                for (String serviceTitle : serviceTitles) {
                            %>
                            <li><input type="checkbox" name="service" value="<%=serviceTitle%>" /><label><%=serviceTitle%></label></li>
                            <%
                                }
                            %>
                        </ul>
                    </div>

                    <br/><br/>
                    <label for="sait">Сайт:</label>
                    <input type="url" id="sait" name="value" />
                    <br/><br/>
                    <label for="about">Описание:</label>
                    <textarea id="about" cols="100" rows="15" wrap="soft" name="value"></textarea>
                    <br/><br/>
                </li>

                <li><p>Изображение заведения:</p>
                    <input type="file" class="img_place" name="image"/>
                    <br/><br/>
                    <input type="file" class="img_place" name="image"/>
                    <br/><br/>
                    <input type="file" class="img_place" name="image"/>
                    <br/><br/>
                </li>

                <li><p>Изображение афиш:</p>
                    <input type="file" class="img_afisha" name="affiche"/>
                    <br/><br/>
                    <input type="file" class="img_afisha" name="affiche"/>
                    <br/><br/>
                    <input type="file" class="img_afisha" name="affiche"/>
                    <br/><br/>
                </li>

                <li><p>После проверки всей информации нажмите кнопку готово:</p>
                    <input type="submit" value="Готово" class="add_new_place"/>
                </li>
            </ol>
        </div>
    </form>>

</body>
</html>