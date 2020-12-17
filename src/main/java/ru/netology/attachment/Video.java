package ru.netology.attachment;

import ru.netology.domain.Likes;

import javax.xml.crypto.Data;

public class Video {
    private int id; //идентификатор видеозаписи.
    private int owner_id; //идентификатор владельца видеозаписи.
    private String title; //название видеозаписи.
    private String description;//текст описания видеозаписи.
    private int duration; //длительность ролика в секундах.
    private Photo[] image; //Изображение обложки.
    private Photo[] first_frame; //	Изображение первого кадра
    private Data date; //дата создания видеозаписи в формате Unixtime.
    private int adding_date; //дата добавления видеозаписи пользователем или группой в формате Unixtime.
    private int views; //количество просмотров видеозаписи.
    private int local_views; //Если видео внешнее, количество просмотров в ВК.
    private int comments; //количество комментариев к видеозаписи.
    private String player; //URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере. Поддерживается flash и html5, плеер всегда масштабируется по размеру окна.
    private String platform; //название платформы (для видеозаписей, добавленных с внешних сайтов).
    private boolean can_edit; // [1]	поле возвращается, если пользователь может редактировать видеозапись, всегда содержит 1.
    private int can_add; // [0,1]	Может ли пользователь добавить видеозапись к себе.
    private int is_private; //[1]	поле возвращается, если видеозапись приватная (например, была загружена в личное сообщение), всегда содержит 1.
    private String access_key; //ключ доступа к объекту. Подробнее см. Ключ доступа к данным access_key.
    private int processing; //[1]	поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
    private boolean is_favorite; //	true, если объект добавлен в закладки у текущего пользователя.
    private int can_comment; //[0,1]	Может ли пользователь комментировать видео.
    private int can_like; //[0,1]	'Может ли пользователь добавить видео в список <<Мне нравится>>.
    private int can_repost; //Может ли пользователь сделать репост видео.
    private int can_subscribe; // [0,1]	Может ли пользователь подписаться на автора видео.
    private int can_add_to_faves; //[0,1]	Может ли пользователь добавить видео в избранное.
    private int can_attach_link; //[0,1]	Может ли пользователь прикрепить кнопку действия к видео.
    private int width; //Ширина видео.
    private int height; //Высота видео.
    private int user_id; //Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников.
    private boolean converting; //[0,1]	Конвертируется ли видео.
    private boolean added; //[0,1]	Добавлено ли видео в альбомы пользователя.
    private boolean is_subscribed; //[0,1]	Подписан ли пользователь на автора видео.
    private int repeat; //поле возвращается в том случае, если видео зациклено, всегда содержит 1
    private String type; //	Тип видеозаписи. Может принимать значения: "video", "music_video", "movie".
    private int balance; //Баланс донатов в прямой трансляции.
    private String live_status; //Статус прямой трансляции. Может принимать значения: "waiting", "started", "finished", "failed", "upcoming".
    private int live; //[1]	поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1. Обратите внимание, в этом случае в поле duration содержится значение 0.
    private int upcoming; // [1]	(для live = 1). Поле свидетельствует о том, что трансляция скоро начнётся.
    private int spectators; //Количество зрителей прямой трансляции.
    private Likes likes; //Содержит объект отметки <<Мне нравится>>.
}
