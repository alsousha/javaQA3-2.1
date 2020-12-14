package ru.netology.domain;

public class NewsManager extends BlockManager {
    private News[] news;

    @Override
    public String generateBlock(){
        for (News oneNews : news) {
            oneNews.showNews();
        }
        return null;
    }
}
