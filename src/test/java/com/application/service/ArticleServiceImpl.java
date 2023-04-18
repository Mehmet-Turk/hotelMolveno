package com.application.service;

import com.application.model.Article;
import com.application.repositories.ArticleRepo;
import com.application.repositories.ArticleRepoImpl;

import java.util.ArrayList;
import java.util.List;

public class ArticleServiceImpl implements ArticleService{
    ArticleRepo articleRepo = new ArticleRepoImpl();
    @Override
    public List<Article> findAll() {
        return articleRepo.findAll();
    }

    @Override
    public Article findById(long id) {
        return articleRepo.findById(id);
    }

    @Override
    public Article create(Article article) {
        return articleRepo.create(article);
    }

    @Override
    public void remove(long id) {
        articleRepo.remove(id);
    }

    @Override
    public void view(List<Article> articles) {
        articleRepo.view(articles);

    }

    @Override
    public List<Article> minStock(int stock) {
        List<Article> minArticles =  new ArrayList<>();
        for (Article article:articleRepo.findAll()){
            if (article.getStock() <= stock){
                minArticles.add(article);
            }
        }
        return  minArticles;
    }
}
