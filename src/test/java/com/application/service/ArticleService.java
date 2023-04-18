package com.application.service;

import com.application.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> findAll();
    Article findById(long id);
    Article create(Article article);
    void remove(long id);
    void view(List<Article> articles);
    List<Article> minStock(int stock);
}
