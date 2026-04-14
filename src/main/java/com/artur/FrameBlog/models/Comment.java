package com.artur.FrameBlog.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name= "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long commentId;
    private String content;
    private Date date;
    @ManyToOne
    private User userId;
    @OneToMany
    private Post postId ;

    public Comment() {
    }

    public Comment(final long commentId,final  String content, final Date date,final User userId, final Post postId) {
        this.commentId = commentId;
        this.content = content;
        this.date = date;
        this.userId = userId;
        this.postId = postId;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Post getPostId() {
        return postId;
    }

    public void setPostId(Post postId) {
        this.postId = postId;
    }
}
