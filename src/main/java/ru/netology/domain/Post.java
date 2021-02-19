package ru.netology.domain;

public class Post {

    private String id;  // уникальный идентификатор обьекта
    private String date; // дата и время публикации
    private String creatorId; // идентификатор создателя поста
    private String text; // текст записи
    private int ownerId; // идентификатор владельца стены, на которой размещена запись
    private int viewsCounter; // счетчик колчиества просмотров поста
    private boolean isAd; // содержит информацию является ли запись рекламой
    private boolean isBookmark; // информация о том, добавил ли текущий пользователь запись в "избранное"
    private boolean isEditAllowed; // Содержит информацию о том, может ли текущай пользователь редактировать пост
    private boolean isDeleteAllowed; // Содержит информацию о том, может ли текущай пользователь удалить пост
    private boolean isPinAllowed; // Содержит информацию о том, может ли текущай пользователь закрепить пост
    private boolean isReposted; // Содержит информацию о том, делал ли текущий пользователь репост записи
    private boolean isPinned; // Содержит информацию о том, закреплена ли запись
    private CommentsInfo commentsInfo; // содержит информацию  коментариях (счетчики, разрешения..)
    private LikesInfo likesInfo;  // содержит информацию о лайках
    private RepostsInfo repostsInfo; // содержит информацию о репостах

}
