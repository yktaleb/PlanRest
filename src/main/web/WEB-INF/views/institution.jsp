<%@ page import="com.planrest.models.Institution" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.planrest.models.Affiche" %>
<%@ page import="com.planrest.dao.impl.*" %>
<%@ page import="com.planrest.models.PhotosInstitution" %>
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
    long institutionId = Long.valueOf(request.getParameter("institution_id"));

    InstitutionDao institutionDao = new InstitutionDao();
    Institution institution = institutionDao.getInstitutionById(institutionId);

    KitchenDao kitchenDao = new KitchenDao();
    ArrayList<String> kitchens = kitchenDao.getKitchenListByInstitutionId(institutionId);

    ServiceDao serviceDao = new ServiceDao();
    ArrayList<String> services = serviceDao.getServiceListByInstitutionId(institutionId);


%>

<!-- Форма со всей информацией -->
<div id="institution">

    <!-- Блок в кокором размещяется и логотип и информация(справа от логотипа) -->
    <div id="block-with-information">
        <!-- Блок в котором размещается логотим заведения -->
        <div class="information-block" id="logo">
            <%if (institution.getAvatar() == null) {
            %>
                <img src="/resources/images/camera_200.png" id="logo-img">
            <%} else {%>
                <img src="<%=request.getContextPath()%>/ShowInstitutionLogo?index=<%=institution.getId()%>" id="logo-img">
            <%}%>
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
                <%
                    if (!institution.getWorkingHours().equals("")) {
                %>
                        <div class = "inf-time-working"><b>Время работы:</b></div>
                        <div class = "inf-time-working" id="time-working">
                            <%
                                if (institution.getWorkingHours()==null)
                            %>
                            <%=institution.getWorkingHours()%>
                        </div>
                <%
                    }
                %>
            </div>


            <div class="inf">
                <%
                    if (kitchens.size() != 0) {
                %>
                        <div class = "inf-kitchen"><b>Кухня:</b></div>
                        <div class = "inf-kitchen" id="kitchen">
                            <%
                                for (int i = 0; i < kitchens.size(); i++) {
                            %>
                                    <%=kitchens.get(i)%>
                                    <%if (!(i == kitchens.size()-1)) {
                            %>
                                    <%=", "%>
                            <%
                                    }%>
                            <%
                                }%>
                        </div>
                <%
                    }
                %>
            </div>

            <div class="inf">
                <%
                    if (services.size() != 0) {
                %>
                        <div class = "inf-services"><b>Сервис:</b></div>
                        <div class = "inf-services" id="services">
                            <%
                                for (int i = 0; i < services.size(); i++) {
                            %>
                                    <%=services.get(i)%>
                                    <%if (!(i == services.size()-1)) {
                            %>
                                        <%=", "%>
                            <%
                                    }%>
                            <%
                                }%>
                        </div>
                <%
                    }
                %>
            </div>

            <div class="inf">
                <%
                    if (!institution.getLinkInstitution().equals("")) {
                %>
                        <div class = "inf-site"><b>Сайт:</b></div>
                        <div class = "inf-site" id="site"><a href="<%=institution.getLinkInstitution()%>" target="_blank"> <%=institution.getLinkInstitution()%></a></div>

                <%
                    }
                %>
            </div>


            <div class="inf">
                <%
                    if (!institution.getAboutInstitution().equals("")) {
                %>
                        <div class = "inf-above-inst">
                            <b>Описание:</b>
                        </div>
                        <p id="inf-text">
                            <%=institution.getAboutInstitution()%>
                        </p>

                <%
                    }
                %>
            </div>
        </div>
    </div>

    <!-- Афиша заведения -->
    <div id="photos">
        <%
            PhotosInstitutionDao photosInstitutionDao = new PhotosInstitutionDao();
            ArrayList<PhotosInstitution> photosInstitution = photosInstitutionDao.getPhotosInstitutionListByInstitutionId(institutionId);
            if (photosInstitution.size()!=0) {
        %>
                <h3>Фото заведения</h3></div>
                <!-- Колонки с афишами(картинками) -->
                <div class="layout1">
                <%
                    for (PhotosInstitution photoInstitution : photosInstitution) {
                %>
                        <div class="col">
                            <a><img src="<%=request.getContextPath()%>/ShowInstitutionPhotoInstitution?index=<%=photoInstitution.getId()%>" alt="" title="" /></a>
                        </div>
                <%
                    }
                %>
        <%
            } else {
        %>
                </div>
                <!-- Колонки с афишами(картинками) -->
                <div class="layout1">
        <%
            }
        %>


    </div>


    <!-- Афиша заведения -->
    <div id="afisha">
        <%
            AfficheDao afficheDao = new AfficheDao();
            ArrayList<Affiche> affiches = afficheDao.getAfficheListByInstitutionId(institutionId);
            if (affiches.size()!=0) {
        %>
            <h3>Афиша</h3></div>
            <!-- Колонки с афишами(картинками) -->
            <div class="layout">

            <%
                for (Affiche affiche : affiches) {
            %>
                <div class="col">
                    <img src="<%=request.getContextPath()%>/ShowInstitutionAffiche?index=<%=affiche.getId()%>">
                </div>
             <%
                }
            %>

        <%
            } else {
        %>
                </div>
                <!-- Колонки с афишами(картинками) -->
                <div class="layout">
        <%
            }
        %>
    </div>

    <a href="#win1" class="button">Стать участником</a>

    <!-- Всплівающее окно для заполнения заявки на посищение -->
    <a href="#x" class="overlay" id="win1"></a>
    <div class="popup">
        <form method="post" action="become_a_party" acceptCharset="UTF-8" >
            <input type="hidden" name="participantId" value="<%=myProfile.getId()%>">
            <input type="hidden" name="institutionId" value="<%=institution.getId()%>">
            <h3>Запись на посещение заведения</h3>
            <p>Заполните указаные поля:</p>
            <br/>
            <label for="date">Дата посещения:</label>
            <input type="date" id="date" name="date"/>
            <br/><br/>
            <label for="time">Время посещения:</label>
            <input type="time" id="time" name="time"/>
            <br/><br/>
            <p>После заполнения и отправки заявки вы будет внесены в список участников.</p>
            <p>Желаем хорошо провести время)</p>
            <br/>
            <div id="button">
                <input type="submit" class="submit"value="Отправить заявку" />
            </div>
            <a class="close" title="Закрыть" href="#close"></a>
        </form>
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