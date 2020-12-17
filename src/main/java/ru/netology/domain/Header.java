package ru.netology.domain;

public class Header {
    private int id;
    private String imgUrl;
    private String headerTextUrl;
    private String mainTextUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getHeaderTextUrl() {
        return headerTextUrl;
    }

    public void setHeaderTextUrl(String headerTextUrl) {
        this.headerTextUrl = headerTextUrl;
    }

    public String getMainTextUrl() {
        return mainTextUrl;
    }

    public void setMainTextUrl(String mainTextUrl) {
        this.mainTextUrl = mainTextUrl;
    }
}
