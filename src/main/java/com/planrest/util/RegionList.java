package com.planrest.util;

import java.util.ArrayList;

public class RegionList {

    private static ArrayList<String> regionList = new ArrayList<String>();

    static {
        regionList.add("Голосеевский");
        regionList.add("Дарницкий");
        regionList.add("Деснянский ");
        regionList.add("Днепровский");
        regionList.add("Оболонский");
        regionList.add("Печерский");
        regionList.add("Подольский");
        regionList.add("Святошинский");
        regionList.add("Соломенский");
        regionList.add("Шевченковский");
    }

    public static ArrayList<String> getRegionList() {
        return regionList;
    }

    public static void setRegionList(ArrayList<String> regionList) {
        RegionList.regionList = regionList;
    }

    public static String[] getAllTitle() {
        String[] names = new String[getRegionList().size()];
        for (int i = 0; i < getRegionList().size(); i++) {
            names[i] = getRegionList().get(i);
        }
        return names;
    }
}
