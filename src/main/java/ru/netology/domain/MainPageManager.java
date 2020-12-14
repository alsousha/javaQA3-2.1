package ru.netology.domain;

public class MainPageManager {

    private BlockManager[] managers; //массив со всеми менеджерами

    public void generate(){

        //запускает всех менднжеров
        for (BlockManager manager: managers){
            manager.generateBlock();
        }
    }

}
