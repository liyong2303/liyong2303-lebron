package com.ky.lebron.domain;

import java.util.Date;

public class LbjContent {
    private Long id;

    private Long indexCategoryId;

    private String title;

    private Date createTime;

    private String resource;

    private String author;

    private String titlePicture;

    private String contentPicture;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIndexCategoryId() {
        return indexCategoryId;
    }

    public void setIndexCategoryId(Long indexCategoryId) {
        this.indexCategoryId = indexCategoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTitlePicture() {
        return titlePicture;
    }

    public void setTitlePicture(String titlePicture) {
        this.titlePicture = titlePicture == null ? null : titlePicture.trim();
    }

    public String getContentPicture() {
        return contentPicture;
    }

    public void setContentPicture(String contentPicture) {
        this.contentPicture = contentPicture == null ? null : contentPicture.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}