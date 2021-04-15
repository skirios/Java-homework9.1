package ru.netology.domain;

public class Post {
    private String publicName; // название паблика
    private String postLink;// ссылка на пост
    private String postText; // текст поста
    private String imageUrl; // картинка для поста
    private String like;  // метод который будет хранить лайки
    private String comment; // комментарии
    private String repost;  // репосты
    private String postViews; // колличество просмотров

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    public String getPostLink() {
        return postLink;
    }

    public void setPostLink(String postLink) {
        this.postLink = postLink;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRepost() {
        return repost;
    }

    public void setRepost(String repost) {
        this.repost = repost;
    }

    public String getPostViews() {
        return postViews;
    }

    public void setPostViews(String postViews) {
        this.postViews = postViews;
    }
}
