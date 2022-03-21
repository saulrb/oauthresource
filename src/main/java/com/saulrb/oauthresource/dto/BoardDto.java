package com.saulrb.oauthresource.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.time.LocalDateTime;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BoardDto {
    private long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAtl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreatedAtl() {
        return createdAtl;
    }

    public void setCreatedAtl(LocalDateTime createdAtl) {
        this.createdAtl = createdAtl;
    }
}
