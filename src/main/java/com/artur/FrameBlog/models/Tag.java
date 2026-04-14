package com.artur.FrameBlog.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tagId;
    String name;

    public Tag() {
    }

    public Tag(final long tagId, final String name) {
        this.tagId = tagId;
        this.name = name;
    }

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
