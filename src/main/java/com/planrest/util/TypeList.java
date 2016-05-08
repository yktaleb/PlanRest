package com.planrest.util;

import java.util.ArrayList;

public class TypeList {

    private static ArrayList<String> typeList = new ArrayList<String>();

    static {
        typeList.add("Арт-кафе");
        typeList.add("Банкетный зал");
        typeList.add("Баня");
        typeList.add("Бар");
        typeList.add("Бар-ресторан");
        typeList.add("Бильярд");
        typeList.add("Бистро");
        typeList.add("Блюз-бар");
        typeList.add("Боулинг");
        typeList.add("Брассери");
        typeList.add("Винный ресторан");
        typeList.add("Гостиничный комплекс");
        typeList.add("Гриль-бар");
        typeList.add("Доставка пиццы");
        typeList.add("Еда на вынос");
        typeList.add("Загородный ресторан");
        typeList.add("Закусочная");
        typeList.add("Кабаре");
        typeList.add("Казино");
        typeList.add("Кальянная");
        typeList.add("Караоке");
        typeList.add("Кафе");
        typeList.add("Кафе-бар");
        typeList.add("Кафетерий");
        typeList.add("Кафетерий-ресторан");
        typeList.add("Кейтеринг");
        typeList.add("Клуб");
        typeList.add("Коктейль-бар");
        typeList.add("Кондитерская");
        typeList.add("Кофейня");
        typeList.add("Ночной клуб");
        typeList.add("Паб");
        typeList.add("Пивной бар");
        typeList.add("Пивной ресторан");
        typeList.add("Пивоварня");
        typeList.add("Пиццерия");
        typeList.add("Пре-пати");
        typeList.add("Развлекательный комплекс");
        typeList.add("Ресторан");
        typeList.add("Ресторан при гостинице");
        typeList.add("Ретро-ресторан");
        typeList.add("Рыбный ресторан");
        typeList.add("Сауна");
        typeList.add("Семейный ресторан");
        typeList.add("Сигарный клуб");
        typeList.add("Служба доставки");
        typeList.add("Спорт-бар");
        typeList.add("Столовая");
        typeList.add("Стриптиз-клуб");
        typeList.add("Суши-бар");
        typeList.add("Таверна");
        typeList.add("Тематический ресторан");
        typeList.add("Топлес");
        typeList.add("Фаст-фуд");
        typeList.add("Фуд-корт");
        typeList.add("Чайная");
        typeList.add("Чайный ресторан");
        typeList.add("Шашлычная");
        typeList.add("Шведский стол");
    }

    public static ArrayList<String> getTypeList() {
        return typeList;
    }

    public static void setTypeList(ArrayList<String> typeList) {
        TypeList.typeList = typeList;
    }

    public static String[] getAllTitle() {
        String[] names = new String[getTypeList().size()];
        for (int i = 0; i < getTypeList().size(); i++) {
            names[i] = getTypeList().get(i);
        }
        return names;
    }
}
