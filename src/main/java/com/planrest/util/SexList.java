package com.planrest.util;

import java.util.ArrayList;

public class SexList {

    private static ArrayList<String> sexList = new ArrayList<String>();

    static {
        sexList.add("мужской");
        sexList.add("женский");
        sexList.add("любой");
    }

    public static ArrayList<String> getSexList() {
        return sexList;
    }

    public static void setSexList(ArrayList<String> sexList) {
        SexList.sexList = sexList;
    }

}
