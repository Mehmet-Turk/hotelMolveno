package com.application.repositories;

import com.application.model.Article;

import java.util.List;

public interface ArticleRepo {
    List<Article> findAll();
    Article findById(long id);
    Article create(Article article);
    void remove(long id);
    void view(List<Article> articles);

}
