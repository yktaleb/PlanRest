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
<div class="menu">
    <nav class="topmenu">
        <ul>
            <li><a href="">Заведения</a></li>
            <li><a href="">Пользователи</a></li>
            <li><a href="">Календарь</a></li>
            <li><a href="">Настройки</a></li>
            <li><a href="">Выход</a></li>
        </ul>
    </nav>
</div>
<!-- Главный блок с инфой -->
<div id="main_block">
    <!-- Блок с категориями поиска (находиться в левой колонке) -->
    <div class="category_block">


        <h3>Категории поиска:</h3>
        <!-- Категория тип (Всплывающий список) -->
        <b class="type_title closed">Тип ▼</b>

        <div class="type_body">
            <div class="col_1">
                <a class="a opened" href="">Бар</a>
                <a class="a opened" href="">Бар-ресторан</a>
                <a class="a opened" href="">Бильярд</a>
                <a class="a opened" href="">Бистро</a>
                <a class="a opened" href="">Гриль-бар</a>
                <a class="a opened" href="">Кальянная</a>
                <a class="a opened" href="">Кафе</a>
                <a class="a opened" href="">Караоке</a>
                <a class="a opened" href="">Кафе-бар</a>
                <a class="a opened" href="">Клуб</a>
                <a class="a opened" href="">Паб</a>
                <a class="a opened" href="">Пивной бар</a>

            </div>

            <div class="col_2">
                <a class="a opened" href="">Ресторан</a>
                <a class="a opened" href="">Спорт-бар</a>

            </div>
        </div>

        <br/><br/>

        <!-- Категория кухня (Всплывающий список) -->
        <b class="kitchen_title closed">Кухня ▼</b>

        <div class="kitchen_body">
            <div class="col_1">
                <a class="a opened" href="">Азиатская</a>
                <a class="a opened" href="">Американская</a>
                <a class="a opened" href="">Английская</a>
                <a class="a opened" href="">Армянская</a>
                <a class="a opened" href="">Вегетарианская</a>
                <a class="a opened" href="">Восточная</a>
                <a class="a opened" href="">Греческая</a>
                <a class="a opened" href="">Грузинская</a>
                <a class="a opened" href="">Домашняя</a>
                <a class="a opened" href="">Европейская</a>
                <a class="a opened" href="">Испанская</a>
                <a class="a opened" href="">Итальянская</a>

            </div>

            <div class="col_2">
                <a class="a opened" href="">Азиатская</a>
                <a class="a opened" href="">Американская</a>
                <a class="a opened" href="">Английская</a>
                <a class="a opened" href="">Армянская</a>
                <a class="a opened" href="">Вегетарианская</a>
                <a class="a opened" href="">Восточная</a>
                <a class="a opened" href="">Греческая</a>
                <a class="a opened" href="">Грузинская</a>
                <a class="a opened" href="">Домашняя</a>
                <a class="a opened" href="">Европейская</a>
                <a class="a opened" href="">Испанская</a>
                <a class="a opened" href="">Итальянская</a>

            </div>

            <div class="col_3">
                <a class="a opened" href="">Азиатская</a>
                <a class="a opened" href="">Американская</a>
                <a class="a opened" href="">Английская</a>
                <a class="a opened" href="">Армянская</a>
                <a class="a opened" href="">Вегетарианская</a>
                <a class="a opened" href="">Восточная</a>
                <a class="a opened" href="">Греческая</a>
                <a class="a opened" href="">Грузинская</a>
                <a class="a opened" href="">Домашняя</a>
                <a class="a opened" href="">Европейская</a>
                <a class="a opened" href="">Испанская</a>
                <a class="a opened" href="">Итальянская</a>

            </div>
        </div>

        <br/><br/>

        <!-- Категория район (Всплывающий список) -->
        <b class="region_title closed">Район ▼</b>

        <div class="region_body">
            <div class="col_1">
                <a class="a opened" href="">Голосеевский</a>
                <a class="a opened" href="">Дарницкий</a>
                <a class="a opened" href="">Деснянский </a>
                <a class="a opened" href="">Днепровский</a>
                <a class="a opened" href="">Оболонский</a>
                <a class="a opened" href="">Печерский</a>
                <a class="a opened" href="">Подольский</a>
                <a class="a opened" href="">Святошинский</a>
                <a class="a opened" href="">Соломенский</a>
                <a class="a opened" href="">Шевченковский</a>

            </div>

        </div>

        <br/><br/>

        <!-- Категория услуги (Всплывающий список) -->
        <b class="service_title closed">Услуги ▼</b>

        <div class="service_body">
            <div class="col_1">
                <a class="a opened" href="">Wi-Fi</a>
                <a class="a opened" href="">Бильярд</a>
                <a class="a opened" href="">Винный бар</a>
                <a class="a opened" href="">Диджей</a>
                <a class="a opened" href="">Дискотека</a>
                <a class="a opened" href="">Живая музыка</a>
                <a class="a opened" href="">Кальян</a>
                <a class="a opened" href="">Караоке</a>
                <a class="a opened" href="">Летняя площадка</a>
                <a class="a opened" href="">На берегу</a>

            </div>

        </div>

    </div>

    <!-- Блок поиска -->
    <div class="right_colum">
        <div class="search_block">
            <input type="text" placeholder="Поиск..." class="search_text" />
            <input type="submit" value="Поиск" id="btn_search" />

            <br/><br/>
        </div>
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
        </div>

    </div>

</div>

</body>
</html>
