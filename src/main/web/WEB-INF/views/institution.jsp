<%@ page import="com.planrest.dao.impl.InstitutionDao" %>
<%@ page import="com.planrest.models.Institution" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/institution_style.css" />" rel="stylesheet" type="text/css">
    <title>L'kafa</title>
</head>
<body>

<%@include file="jspf/top_menu.jspf" %>

<%
    InstitutionDao institutionDao = new InstitutionDao();
    Institution institution = institutionDao.getInstitutionById(Long.valueOf(request.getParameter("institution_id")));

%>

<!-- Форма со всей информацией -->
<div id="institution">

    <!-- Блок в кокором размещяется и логотип и информация(справа от логотипа) -->
    <div id="block-with-information">
        <!-- Блок в котором размещается логотим заведения -->
        <div class="information-block" id="logo">
            <img src="logo1.jpg" id="logo-img">
        </div>
        <!-- Блок в котором размещается мнформация о заведении -->
        <div class="information-block" id="list-of-information">

            <div class="inf">
                <div class = "place_name">
                    <b>Название:</b>
                </div>

                <div class = "place_name" id="pl_nm">
                    <%=institution.getName()%>
                </div>
            </div>

            <div class="inf">
                <div class = "region">
                    <b>Район:</b>
                </div>

                <div class = "region" id="reg">
                    <%=institution.getRegion()%>
                </div>
            </div>

            <div class="inf">
                <div class = "inf-tel">
                    <b>Телефон:</b>
                </div>

                <div class = "inf-tel" id="tel">
                    <%=institution.getPhoneNumber()%>
                </div>
            </div>
            <div class="inf">
                <div class = "inf-adress">
                    <b>Адрес:</b>
                </div>
                <div class = "inf-adress" id="adress"> <%=institution.getAddress()%></div>
            </div>

            <div class="inf">
                <div class = "inf-time-working"><b>Время работы:</b></div>
                <div class = "inf-time-working" id="time-working"> <%=institution.getWorkingHours()%></div>
            </div>

            <div class="inf">
                <div class = "inf-kitchen"><b>Кухня:</b></div>
                <div class = "inf-kitchen" id="kitchen">Европейская, восточная, американская </div>
            </div>

            <div class="inf">
                <div class = "inf-services"><b>Сервис:</b></div>
                <div class = "inf-services" id="services">WI-FI, кальян, караоке, живая музыка, </div>
            </div>

            <div class="inf">
                <div class = "inf-site"><b>Сайт:</b></div>
                <div class = "inf-site" id="site"><a href="http://lkafa-cafe.com.ua/" target="_blank"> <%=institution.getLinkInstitution()%></a></div>
            </div>

            <div class="inf">
                <div class = "inf-above-inst">
                    <b>Описание:</b>
                </div>
                <p id="inf-text">
                    <%=institution.getAboutInstitution()%>
                </p>
            </div>
        </div>
    </div>


    <!-- Афиша заведения -->
    <div id="photos"><h3>Фото заведения</h3></div>
    <!-- Колонки с афишами(картинками) -->
    <div class="layout1">
        <div class="col1">
            <a href="" id="tab1"><img src="lkafa2.jpg" alt="" title="" /></a>
            <!-- <img src="lkafa2.jpg"> -->
        </div>
        <div class="col2">
            <a href="" id="tab1"><img src="lkafa3.jpg" alt="" title="" /></a>
            <!-- <img src="lkafa3.jpg"> -->
        </div>
        <div class="col3">
            <a href="" id="tab1"><img src="lkafa4.jpg" alt="" title="" /></a>
            <!-- <img src="lkafa4.jpg"> -->
        </div>
    </div>

    <!-- Афиша заведения -->
    <div id="afisha"><h3>Афиша</h3></div>
    <!-- Колонки с афишами(картинками) -->
    <div class="layout">
        <div class="col1">
            <img src="afisha1.jpg">
        </div>
        <div class="col2">
            <img src="afisha2.jpg">
        </div>
        <div class="col3">
            <img src="afisha3.jpg">
            <a href="#win1" class="button">Стать участником</a>
        </div>
    </div>
    <!-- Всплівающее окно для заполнения заявки на посищение -->
    <a href="#x" class="overlay" id="win1"></a>
    <div class="popup">
        <h3>Запись на посещение заведения</h3>
        <p>Заполните указаные поля:</p>
        <br/>
        <label for="date">Дата посещения:</label>
        <input type="date" id="date" />
        <br/><br/>
        <label for="time">Время посещения:</label>
        <input type="time" id="time" />
        <br/><br/>
        <p>После заполнения и отправки заявки вы будет внесены в список участников.</p>
        <p>Желаем хорошо провести время)</p>
        <br/>
        <div id="button">
            <input type="submit" class="submit"value="Отправить заявку" />
        </div>
        <a class="close" title="Закрыть" href="#close"></a>
    </div>

    <!-- Таблица запланированіх посищений -->
    <div id="calendar"><h3>Календарь заведения</h3></div>

    <div id="category-of-participant">
        <div class="participant">Участники</div>
        <!-- <div class="participant">Друзья</div> -->
    </div>

    <div id="hint">
        <div class="hint-name">Посетитель</div>
        <div class="hint-date">Дата</div>
        <div class="hint-time">Время</div>
    </div>
    <!-- В єтом div будет список пользоватилей -->
    <div id="table">
        <!-- Сам список -->
        <ul id="list-of_participant">
            <li>
                <div id="participant-in-list">
                    <div class="photo"><img src="fr1.jpg" class="person-photo" alt="Участник"></div>
                    <div class="name"><a href="">Захарчук Дима</a></div>
                    <div class="date">25.05.2016</div>
                    <div class="time">19:00</div>

                </div>
            </li>
            <li>
                <div id="participant-in-list">
                    <div class="photo"><img src="fr1.jpg" class="person-photo" alt="Участник"></div>
                    <div class="name"><a href="">Захарчук Дима</a></div>
                    <div class="date">25.05.2016</div>
                    <div class="time">19:00</div>

                </div>
            </li>
            <li>
                <div id="participant-in-list">
                    <div class="photo"><img src="fr1.jpg" class="person-photo" alt="Участник"></div>
                    <div class="name"><a href="">Захарчук Дима</a></div>
                    <div class="date">25.05.2016</div>
                    <div class="time">19:00</div>

                </div>
            </li>
            <li>
                <div id="participant-in-list">
                    <div class="photo"><img src="fr1.jpg" class="person-photo" alt="Участник"></div>
                    <div class="name"><a href="">Захарчук Дима</a></div>
                    <div class="date">25.05.2016</div>
                    <div class="time">19:00</div>

                </div>
            </li>
            <li>
                <div id="participant-in-list">
                    <div class="photo"><img src="fr1.jpg" class="person-photo" alt="Участник"></div>
                    <div class="name"><a href="">Захарчук Дима</a></div>
                    <div class="date">25.05.2016</div>
                    <div class="time">19:00</div>

                </div>
            </li>
            <li>
                <div id="participant-in-list">
                    <div class="photo"><img src="fr1.jpg" class="person-photo" alt="Участник"></div>
                    <div class="name"><a href="">Захарчук Дима</a></div>
                    <div class="date">25.05.2016</div>
                    <div class="time">19:00</div>

                </div>
            </li>
        </ul>
    </div>
</div>



</body>
</html>