<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/admin_new_place_style.css" />" rel="stylesheet" type="text/css">
    <title>Создание странички нового заведения</title>
</head>
<body>


<div id="main-block">
    <p><h3>Заполните поля указаной информацией о заведении</h3></p>
    <ol>
        <li><p>Текстовая информация:</p>
            <label for="name" >Название:</label>
            <input type="text" id="name" />
            <br/><br/>
            <label for="region" >Район:</label>
            <input type="text" id="region" />
            <br/><br/>
            <label for="telephone">Телефон:</label>
            <input type="tel" id="telephone" />
            <br/><br/>
            <label for="adress">Адрес:</label>
            <input type="text" id="adress" />
            <br/><br/>
            <label for="time_worcking">Время работы:</label>
            <input type="text" id="time_worcking" />
            <br/><br/>
            <label for="kitchen">Кухня:</label>
            <input type="text" id="kitchen" />
            <br/><br/>
            <label for="service">Сервис:</label>
            <input type="text" id="service" />
            <br/><br/>
            <label for="sait">Сайт:</label>
            <input type="url" id="sait" />
            <br/><br/>
            <label for="about">Описание:</label>
            <textarea name="text_about" id="about" cols="100" rows="15" wrap="soft"></textarea>
            <br/><br/>
        </li>

        <li><p>Изображение заведения:</p>
            <input type="file" class="img_place"/>
            <br/><br/>
            <input type="file" class="img_place"/>
            <br/><br/>
            <input type="file" class="img_place"/>
            <br/><br/>
        </li>

        <li><p>Изображение афиш:</p>
            <input type="file" class="img_afisha"/>
            <br/><br/>
            <input type="file" class="img_afisha"/>
            <br/><br/>
            <input type="file" class="img_afisha"/>
            <br/><br/>
        </li>

        <li><p>После проверки всей информации нажмите кнопку готово:</p>
            <input type="submit" value="Готово" class="add_new_place"/>
        </li>
    </ol>
</div>

</body>
</html>