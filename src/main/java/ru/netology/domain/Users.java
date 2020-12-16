package ru.netology.domain;

import javax.xml.crypto.Data;

public class Users {
    private int userId;
    private String photoUserUrl;
    private String userName;
    private String userSurename;
    private int ageUser;
    private String userAdress;
    private boolean isMarried;
    private boolean haveChild;
    private String urlAbout;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhotoUserUrl() {
        return photoUserUrl;
    }

    public void setPhotoUserUrl(String photoUserUrl) {
        this.photoUserUrl = photoUserUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurename() {
        return userSurename;
    }

    public void setUserSurename(String userSurename) {
        this.userSurename = userSurename;
    }

    public int getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(int ageUser) {
        this.ageUser = ageUser;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public boolean isHaveChild() {
        return haveChild;
    }

    public void setHaveChild(boolean haveChild) {
        this.haveChild = haveChild;
    }

    public String getUrlAbout() {
        return urlAbout;
    }

    public void setUrlAbout(String urlAbout) {
        this.urlAbout = urlAbout;
    }
}
