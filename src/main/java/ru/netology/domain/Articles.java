package ru.netology.domain;

public class Articles {
    private int idArticles;
    private String urlArticles;
    private String urlImage;
    private int idUser;

    public int getIdArticles() {
        return idArticles;
    }

    public void setIdArticles(int idArticles) {
        this.idArticles = idArticles;
    }

    public String getUrlArticles() {
        return urlArticles;
    }

    public void setUrlArticles(String urlArticles) {
        this.urlArticles = urlArticles;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
