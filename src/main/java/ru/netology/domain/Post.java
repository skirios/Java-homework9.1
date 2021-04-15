package ru.netology.domain;

public class Post {
    private int id; // идентификатор записи
    private int ownerId; // иденетификатор владельца стены на которой размещена запись
    private int fromId; //  идентификатор автора записи
    private int createdBy; // идентификатор администратора опубликовавщего запись
    private int date; // время публикации
    private String text; // текст записи
    private int replyOwnerId; // идентификатор  владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; // идентификатор записи, в ответ на которую была оставлена текущая
    private int onlyFrends; // запись с опцией "только для друзей"
    private CommentsInfo commentsInfo; //информация о комментариях к записи
    private Copyringh copyringh; // источник материала, объект с полями
    private LikeInfo likeInfo; // информация о лайках, обьект с полями
    private RepostsInfo repostsInfo; // информация о репостах записи
    private WievsInfo wievsInfo; // информация о проспотрах
    private String postType; //тип записи
    private Geo geo; // местоположение
    private int signerId; // идентификатор автора если запись была добалена на странице сообщества и подписана автором
    private boolean canPin; // информация о том, может ли текущий пользователь закрепить запись
    private boolean canDelete; // информация о том, может ли текущий пользователь удалить запись
    private boolean canEdit; // информация о том, может ли текущий пользователь редактировать запись
    private boolean isPinned; // информация о том, что запись закреплена
    private boolean markedAsAds; // информация о том, содержит ли текущая запись отметку реклама
    private boolean isFavorite; // добавлен ли пользователь в закладки
    private Donut donut; //
    private int postponedId; // идентификатор отложенной записи

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getOnlyFrends() {
        return onlyFrends;
    }

    public void setOnlyFrends(int onlyFrends) {
        this.onlyFrends = onlyFrends;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Copyringh getCopyringh() {
        return copyringh;
    }

    public void setCopyringh(Copyringh copyringh) {
        this.copyringh = copyringh;
    }

    public LikeInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikeInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public WievsInfo getWievsInfo() {
        return wievsInfo;
    }

    public void setWievsInfo(WievsInfo wievsInfo) {
        this.wievsInfo = wievsInfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}

