package com.hbgc.demo.repository;

import com.hbgc.demo.domain.Comment;

import java.util.List;

public interface CommentsRepository extends BaseRepository<Comment,Integer> {
    List<Comment> findAllByAid(int aid);
}
