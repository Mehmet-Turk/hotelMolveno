package com.application;

import com.application.controller.ArticleController;
import com.application.model.Article;

public class Application {
    public static void main(String[] args) {
        ArticleController articleController = new ArticleController();
        Article article1 = new Article("Ali ata bak", "basic book", 10, "this is a picture".getBytes(),20);
        Article article2 = new Article("Car", "basic books", 4, "car picture".getBytes(), 2);
        Article article3 = new Article("Truck", "basic books", 4, "car picture".getBytes(), 7);
        articleController.createArticle(article1);
        articleController.createArticle(article2);
        articleController.createArticle(article3);
        articleController.view(articleController.getAllArticles());
        System.out.println("---------------");
        System.out.println(articleController.findById(1).getName());
        articleController.deleteArticle(1);
        articleController.view(articleController.getAllArticles());
        System.out.println("----------------");
        Article article4 = new Article("Bike", "Bikes", 15, "bike picture".getBytes(),21);
        Article article5 = new Article("Laptop", "Laptops", 500, "laptop picture".getBytes(), 4);
        Article article6 = new Article("Mouse", "mouse books", 9, "mouse picture".getBytes(), 5);
        articleController.createArticle(article4);
        articleController.createArticle(article5);
        articleController.createArticle(article6);
        System.out.println("Min");
        articleController.view(articleController.getMinStockArticles(5));

    }
}