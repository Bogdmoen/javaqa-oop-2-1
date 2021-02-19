package ru.netology.domain.attachment;

public class WikiPage {
    private int id;
    private int groupId;
    private int creatorId;
    private String title;
    private boolean currentUserCanEdit;
    private boolean isCurrentUserCanEditAccess;
    private int whoCanView;
    private int whoCanEdit;
    private int edited;
    private int created;
    private int editor_id;
    private int views;
    private String parent;
    private String secondParent;
    private String source;
    private String html;
    private String viewUrl;
}
