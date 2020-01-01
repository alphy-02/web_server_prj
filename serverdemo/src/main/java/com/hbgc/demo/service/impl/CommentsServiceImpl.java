package com.hbgc.demo.service.impl;

import com.hbgc.demo.domain.Comment;
import com.hbgc.demo.repository.CommentsRepository;
import com.hbgc.demo.service.CommentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl extends BaseServiceImpl<Comment,Integer, CommentsRepository> implements CommentsService {
    @Override
    public List<Comment> findAllByAid(int aid) {
        return super.dao.findAllByAid(aid);
    }
}
