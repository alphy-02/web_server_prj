package com.hbgc.demo.service;

import com.hbgc.demo.domain.Comment;
import com.hbgc.demo.repository.CommentsRepository;

import java.util.List;

public interface CommentsService extends BaseService<Comment,Integer, CommentsRepository> {
    public List<Comment> findAllByAid(int aid);
}
