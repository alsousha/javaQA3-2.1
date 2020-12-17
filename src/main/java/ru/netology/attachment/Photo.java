package ru.netology.attachment;

import javax.xml.crypto.Data;

public class Photo {
    private int id; //идентификатор фотографии.
    private int album_id; //идентификатор альбома, в котором находится фотография.
    private int owner_id; //идентификатор владельца фотографии.
    private int user_id; //идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    private String text; //текст описания фотографии.
    private Data date; //дата добавления в формате Unixtime.
    private String sizes[]; //массив с копиями изображения в разных размерах. Каждый объект массива содержит следующие поля:

}
