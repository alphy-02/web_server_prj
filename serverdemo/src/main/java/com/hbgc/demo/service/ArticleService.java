package com.hbgc.demo.service;

import com.hbgc.demo.domain.Article;
import com.hbgc.demo.repository.ArticleRepository;

import java.util.List;

public interface ArticleService extends BaseService<Article,Integer, ArticleRepository> {
    public List<Article> queryAllByType(String type);
    public List<Article> queryAllByAuth(String auth);

}
