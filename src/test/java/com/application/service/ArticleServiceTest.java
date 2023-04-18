package com.application.service;

import com.application.model.Article;

import java.util.List;

public class ArticleServiceTest {
    static ArticleService articleService = new ArticleServiceImpl();
    private static void minStockTest(int askedMinStock, int expectedNbrOfArticles){
        List<Article> test = articleService.minStock(askedMinStock);
        System.out.println(test.size());
        if(test.size() == expectedNbrOfArticles){
            System.out.println("Test passed!");
        }else {
            System.out.println("Test failed!");
        }
    }
    public static void main(String[] args) {
        Article article1 = new Article("Ali ata bak", "basic book", 10, "this is a picture".getBytes(),20);
        Article article2 = new Article("Car", "basic books", 4, "car picture".getBytes(), 2);
        Article article3 = new Article("Truck", "basic books", 4, "car picture".getBytes(), 7);
        Article article4 = new Article("Bike", "Bikes", 15, "bike picture".getBytes(),21);
        Article article5 = new Article("Laptop", "Laptops", 500, "laptop picture".getBytes(), 4);
        Article article6 = new Article("Mouse", "mouse books", 9, "mouse picture".getBytes(), 5);
        articleService.create(article1);
        articleService.create(article2);
        articleService.create(article3);
        articleService.create(article4);
        articleService.create(article5);
        articleService.create(article6);
        //20 2 7 21 4 5

        minStockTest(5, 3);
        minStockTest(100, 6);
    }
}
