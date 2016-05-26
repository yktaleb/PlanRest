package com.planrest.util;

import java.util.ArrayList;

public class StatusList {

    private static ArrayList<String> statusList = new ArrayList<String>();

    static {
        statusList.add("Не женат(а)");
        statusList.add("Встречается");
        statusList.add("Помолвлен(а)");
        statusList.add("Женат(а)");
        statusList.add("Влюблен(а)");
        statusList.add("Все сложно");
        statusList.add("В активном поиске");

    }

    public static ArrayList<String> getStatusList() {
        return statusList;
    }

    public static void setStatusList(ArrayList<String> statusList) {
        StatusList.statusList = statusList;
    }
    
}
