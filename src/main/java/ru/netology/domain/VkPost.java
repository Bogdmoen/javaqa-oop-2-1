package ru.netology.domain;

public class VkPost {

    private String id;  // уникальный идентификатор обьекта
    private String date; // дата и время публикации
    private String text; // текст записи
    private int likeCounter; // счетчик количества лайков
    private int commentCounter; // счетчик количества комментариев
    private  int repostCounter; // счетчик количества репостов
    private int viewsCounter; // счетчик колчиества простотор поста
    private boolean isCommentAllowed; // включает \ отключает возможность комментировать запись
    private boolean isAd; // содержит информацию является ли запись рекламой
    private int attachments []; // содержит список id файлов, добавленных в пост
    private String creatorId; // идентификатор создателя поста
}