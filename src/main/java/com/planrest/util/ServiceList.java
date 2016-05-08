package com.planrest.util;

import java.util.ArrayList;

public class ServiceList {

    private static ArrayList<String> serviceList = new ArrayList<String>();

    static {
        serviceList.add("Wi-Fi");
        serviceList.add("А-ля Фуршет");
        serviceList.add("Баня");
        serviceList.add("Барбекю");
        serviceList.add("Без детей");
        serviceList.add("Бизнес-ланч");
        serviceList.add("Бильярд");
        serviceList.add("Боулинг");
        serviceList.add("Винный бар");
        serviceList.add("Гриль");
        serviceList.add("Дартс");
        serviceList.add("Деловой ужин");
        serviceList.add("Детский стол");
        serviceList.add("Диджей");
        serviceList.add("Дискотека");
        serviceList.add("Еда на вынос");
        serviceList.add("Живая музыка");
        serviceList.add("Известный шеф-повар");
        serviceList.add("Кальян");
        serviceList.add("Караоке");
        serviceList.add("Караоке в кабинете");
        serviceList.add("Кафетерий");
        serviceList.add("Кейтеринг");
        serviceList.add("Круглосуточно");
        serviceList.add("Летняя площадка");
        serviceList.add("Место проведения свадьбы");
        serviceList.add("Молодежный");
        serviceList.add("На берегу");
        serviceList.add("Нарды");
        serviceList.add("Обслуживание банкетов");
        serviceList.add("Онлайн заказ");
        serviceList.add("Парковка");
        serviceList.add("Пивоварня");
        serviceList.add("Предварительный заказ");
        serviceList.add("Приватные комнаты");
        serviceList.add("Приготовление на открытом огне");
        serviceList.add("Романтичные");
        serviceList.add("Сауна");
        serviceList.add("Свое спиртное");
        serviceList.add("Сигары");
        serviceList.add("Стриптиз");
        serviceList.add("Танцпол");
        serviceList.add("Тематический ресторан");
        serviceList.add("Топлес");
        serviceList.add("Фейс-контроль");
        serviceList.add("Шахматы");
        serviceList.add("Шашлык");
        serviceList.add("Шоу-программа");
    }

    public static ArrayList<String> getServiceList() {
        return serviceList;
    }

    public static void setServiceList(ArrayList<String> serviceList) {
        ServiceList.serviceList = serviceList;
    }

    public static String[] getAllTitle() {
        String[] names = new String[getServiceList().size()];
        for (int i = 0; i < getServiceList().size(); i++) {
            names[i] = getServiceList().get(i);
        }
        return names;
    }
}
