package com.planrest.util;

import com.planrest.dao.impl.*;
import com.planrest.models.Institution;
import com.planrest.models.Profile;

import java.util.ArrayList;

public class SelectedUsersList {

    private ArrayList<Profile> profiles = null;

    private String title;

    public SelectedUsersList(String parameterName, int parameterValue) {
        ProfileDao profileDao = null;
        switch (parameterName) {
            case "region_id":
                RegionList regionList = new RegionList();
                if (parameterValue > regionList.getRegionList().size() || parameterValue < 0)
                    break;

                ProfileDao profileDao1 = new ProfileDao();
                profiles = new ArrayList<Profile>();

                title = "Район";

                String region = regionList.getRegionList().get(parameterValue);
                for (Profile profile : profileDao1.getAllProfile()) {
                    if (profile.getRegion()!=null) {
                        if (profile.getRegion().equals(region)) {
                            profiles.add(profile);
                        }
                    }
                }

                break;
            case "status_id":
                StatusList statusList = new StatusList();
                if (parameterValue > statusList.getStatusList().size() || parameterValue < 0)
                    break;

                profileDao = new ProfileDao();
                profiles = new ArrayList<Profile>();

                title = "Семейное положение";

                String status = statusList.getStatusList().get(parameterValue);
                for (Profile profile : profileDao.getAllProfile()) {
                    if (profile.getRelationshipStatus()!=null) {
                        if (profile.getRelationshipStatus().equals(status)) {
                            profiles.add(profile);
                        }
                    }
                }
                break;
            case "sex":
                KitchenList kitchenList = new KitchenList();

                if (parameterValue > 2 || parameterValue < 0)
                    break;

                profileDao = new ProfileDao();
                profiles = new ArrayList<Profile>();

                switch (parameterValue) {
                    case 0:
                        for (Profile profile : profileDao.getAllProfile()) {
                            if (profile.getSex().equals("man")) {
                                profiles.add(profile);
                            }
                        }
                        break;
                    case 1:
                        for (Profile profile : profileDao.getAllProfile()) {
                            if (profile.getSex().equals("woman")) {
                                profiles.add(profile);
                            }
                        }
                        break;
                    case 2:
                        profiles = (ArrayList<Profile>) profileDao.getAllProfile();
                        break;
                }

                title = "Пол";

                break;
        }
    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public String getTitle() {
        return title;
    }
}
