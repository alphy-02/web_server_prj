package com.hbgc.demo.service.impl;

import com.hbgc.demo.domain.Article;
import com.hbgc.demo.repository.ArticleRepository;
import com.hbgc.demo.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl extends BaseServiceImpl<Article,Integer, ArticleRepository> implements ArticleService {
    @Override
    public List<Article> queryAllByType(String type) {
        return super.dao.queryAllByType(type);
    }

    @Override
    public List<Article> queryAllByAuth(String auth) {
        return super.dao.queryAllByAuth(auth);
    }


}
