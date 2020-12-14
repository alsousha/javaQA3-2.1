package ru.netology.domain;

public class PostManager extends BlockManager {

    private Post[] posts; //массив всех постов

    @Override
    public String generateBlock() {
        for (Post post : posts) {

            //вывод всех постов в цикле
            post.showPost();
        }
        return null;
    }
}
