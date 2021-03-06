package com.briup.shopping.service;

import com.briup.shopping.bean.Comment;
import com.briup.shopping.bean.ex.CommentEXg;

import java.util.List;

public interface ICommentServiceg {
    List<CommentEXg> findAll() throws RuntimeException;
    void saveComment(Comment comment) throws RuntimeException;
    void deleteById(int id) throws RuntimeException;
    void updateComment(Comment comment) throws RuntimeException;
}
