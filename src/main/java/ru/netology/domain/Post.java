package ru.netology.domain;

public class Post {
    private int postCount;
    private String postId;
    private Likes[] likes;
    private Articles[] articles;
    private Comments[] comments;

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    private String ownerId;


    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }


}
