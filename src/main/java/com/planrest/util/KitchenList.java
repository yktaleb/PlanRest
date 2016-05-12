package com.planrest.util;

import java.util.ArrayList;

public class KitchenList {

    private static ArrayList<String> kitchenList = new ArrayList<String>();

    static {
        kitchenList.add("Nothing");
        kitchenList.add("Австрийская");
        kitchenList.add("Авторская");
        kitchenList.add("Азербайджанская");
        kitchenList.add("Азиатская");
        kitchenList.add("Американская");
        kitchenList.add("Английская");
        kitchenList.add("Арабская");
        kitchenList.add("Армянская");
        kitchenList.add("Бельгийская");
        kitchenList.add("Вегетарианская");
        kitchenList.add("Восточная");
        kitchenList.add("Выпечка");
        kitchenList.add("Вьетнамская");
        kitchenList.add("Греческая");
        kitchenList.add("Грузинская");
        kitchenList.add("Домашняя");
        kitchenList.add("Еврейская");
        kitchenList.add("Европейская");
        kitchenList.add("Европейская / Восточная");
        kitchenList.add("Европейская / Фьюжн");
        kitchenList.add("Индийская");
        kitchenList.add("Ирландская");
        kitchenList.add("Испанская");
        kitchenList.add("Итальянская");
        kitchenList.add("Итальянская / Северная");
        kitchenList.add("Итальянская / Южная");
        kitchenList.add("Кавказская");
        kitchenList.add("Карибская");
        kitchenList.add("Китайская");
        kitchenList.add("Корейская");
        kitchenList.add("Кошерная");
        kitchenList.add("Латиноамериканская");
        kitchenList.add("Ливанская");
        kitchenList.add("Марокканская");
        kitchenList.add("Мексиканская");
        kitchenList.add("Молдавская");
        kitchenList.add("Морепродукты");
        kitchenList.add("Немецкая");
        kitchenList.add("Пекарня");
        kitchenList.add("Пивные рестораны");
        kitchenList.add("Пицца");
        kitchenList.add("Польская");
        kitchenList.add("Русская");
        kitchenList.add("Сендвичи");
        kitchenList.add("Сербская");
        kitchenList.add("Средиземноморская");
        kitchenList.add("Суши");
        kitchenList.add("Тайская");
        kitchenList.add("Турецкая");
        kitchenList.add("Узбекская");
        kitchenList.add("Украинская");
        kitchenList.add("Французская");
        kitchenList.add("Цыпленок");
        kitchenList.add("Чешская");
        kitchenList.add("Швейцарская");
        kitchenList.add("Шотландская");
        kitchenList.add("Японская");
    }

    public static ArrayList<String> getKitchenList() {
        return kitchenList;
    }

    public static void setKitchenList(ArrayList<String> kitchenList) {
        KitchenList.kitchenList = kitchenList;
    }

    public static String[] getAllTitle() {
        String[] names = new String[getKitchenList().size()];
        for (int i = 0; i < getKitchenList().size(); i++) {
            names[i] = getKitchenList().get(i);
        }
        return names;
    }
}
