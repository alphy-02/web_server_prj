package com.hbgc.demo.repository;

import com.hbgc.demo.domain.Article;

import java.util.List;

public interface ArticleRepository extends BaseRepository<Article,Integer> {
    List<Article> queryAllByType(String type);
    List<Article> queryAllByAuth(String auth);

}
