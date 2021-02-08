package ru.netology.domain;

public class CommentsInfo {
    private int count; // счетчик комментариев
    private boolean IsPostAllowed; // // может ли текущий пользователь оставлять комментарии оставлять комментарии
    private boolean IsGroupPostAllowed; // могут ли группы оставлять комментарии
    private boolean isCloseAllowed; // может ли текущий пользователь закрыть комментарии к посту (запретить комментирование)
    private boolean isOpenAllowed; // может ли текущий пользователь закрыть комментарии к посту (разрешить комментирование)
}
