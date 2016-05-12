package com.planrest.util;

import com.planrest.dao.impl.InstitutionDao;
import com.planrest.dao.impl.KitchenDao;
import com.planrest.dao.impl.ServiceDao;
import com.planrest.dao.impl.TypeDao;
import com.planrest.models.Institution;

import java.util.ArrayList;

public class SelectedInstitutionList {

    private ArrayList<Institution> institutions = null;
    private String title;

    public SelectedInstitutionList(String parameterName, int parameterValue) {
        switch (parameterName) {
            case "type_id":
                TypeList typeList = new TypeList();
                if (parameterValue > typeList.getTypeList().size() || parameterValue <= 0)
                    break;

                TypeDao typeDao = new TypeDao();

                title = "Тип";

                institutions = typeDao.getAllInstitutionByTypeTitle(typeList.getTypeList().get(parameterValue));
                break;
            case "kitchen_id":
                KitchenList kitchenList = new KitchenList();

                if (parameterValue > kitchenList.getKitchenList().size() || parameterValue <= 0)
                    break;

                KitchenDao kitchenDao = new KitchenDao();

                title = "Кухня";

                institutions = kitchenDao.getAllInstitutionByTypeTitle(kitchenList.getKitchenList().get(parameterValue));
                break;
            case "region_id":
                RegionList regionList = new RegionList();
                if (parameterValue > regionList.getRegionList().size() || parameterValue < 0)
                    break;

                InstitutionDao institutionDao = new InstitutionDao();
                institutions = new ArrayList<Institution>();

                title = "Район";

                String region = regionList.getRegionList().get(parameterValue);
                for (Institution institution : institutionDao.getAllInstitution()) {
                    if (institution.getRegion().equals(region)) {
                        institutions.add(institution);
                    }
                }

                break;
            case "service_id":
                ServiceList serviceList = new ServiceList();
                if (parameterValue > serviceList.getServiceList().size() || parameterValue <= 0)
                    break;

                ServiceDao serviceDao = new ServiceDao();

                title = "Услуги";

                institutions = serviceDao.getAllInstitutionByTypeTitle(serviceList.getServiceList().get(parameterValue));
                break;
        }
    }

    public ArrayList<Institution> getInstitutions() {
        return institutions;
    }

    public String getTitle() {
        return title;
    }
}
