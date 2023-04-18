package com.application.controller;

import com.application.model.Article;
import com.application.service.ArticleService;
import com.application.service.ArticleServiceImpl;

import java.util.List;

public class ArticleController {

    ArticleService articleService = new ArticleServiceImpl();
    //endpoint
    //http://localhost:8080/api/article
    //GET
    public List<Article> getAllArticles(){
        return articleService.findAll();
    }

    //endpoint
    //http://localhost:8080/api/article/stock/5
    //GET
    public List<Article> getMinStockArticles(int stock){
        return articleService.minStock(stock);
    }

    //endpoint
    //http://localhost:8080/api/article/2
    //GET
    public Article findById(long id){
        return articleService.findById(id);
    }

    //http://localhost:8080/api/article/
    //PUT
    public Article createArticle(Article article){
        return articleService.create(article);
    }

    //http://localhost:8080/api/article
    //DEL
    public void deleteArticle(long id){
        articleService.remove(id);
    }
    public void view(List<Article> articles){
        articleService.view(articles);
    }



}
