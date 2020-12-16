package ru.netology.domain;

public class Likes {
    private int likesCount;
    private boolean userLikes; //наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);
    private boolean canLike; // [0,1] — информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
    private boolean canPublish; // integer, [0,1] — информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
