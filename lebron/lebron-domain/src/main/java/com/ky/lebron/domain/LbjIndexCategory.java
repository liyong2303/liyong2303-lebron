package com.ky.lebron.domain;

public class LbjIndexCategory {
    private Long id;

    private String cateName;

    private Long parentId;

    private String redicctUrl;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getRedicctUrl() {
        return redicctUrl;
    }

    public void setRedicctUrl(String redicctUrl) {
        this.redicctUrl = redicctUrl == null ? null : redicctUrl.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}