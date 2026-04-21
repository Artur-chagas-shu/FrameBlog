package com.artur.FrameBlog.services.impl;

import com.artur.FrameBlog.models.Comment;
import com.artur.FrameBlog.services.CommentService;
import com.artur.FrameBlog.services.UserService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl  {


    @Autowired
    private UserService userService;


}