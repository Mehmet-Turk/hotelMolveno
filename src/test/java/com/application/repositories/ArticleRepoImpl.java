package com.application.repositories;

import com.application.model.Article;
import com.application.model.Sequence;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArticleRepoImpl implements ArticleRepo{
    private List<Article> articles = new ArrayList<>();
    @Override
    public List<Article> findAll(){
        return articles;
    }
    @Override
    public Article findById(long id){
        Article article=null;
        for (int i = 0; i <articles.size() ; i++) {
            if (articles.get(i).getId() == id){
                article = articles.get(i);}

        }
        return article;

    }
    @Override
    public Article create(Article article){
        long id = Sequence.getNextSequence();
        article.setId(id);
        //article.setId(nextId());
        articles.add(article);
        return article;
    }
    @Override
    public void remove(long id){
        List<Article> newArticles =  new ArrayList<>();
//        for (int i = 0; i <articles.size() ; i++) {
//            if(articles.get(i).getId() == id)
//                articles.remove(articles.get(i));
//        }
        for (Article article:articles){
            if (article.getId() != id){
                newArticles.add(article);
            }
        }
        articles = newArticles;
    }
    @Override
    public void view(List<Article> articles){
        for (Article article: articles) {
            System.out.println(article);
//            System.out.print("id: " + article.getId() + " ");
//            System.out.print("name: "+article.getName() + " ");
//            System.out.print("description: " + article.getDescription() + " ");
//            System.out.print("price: "+article.getPrice() + " ");
//            System.out.print("image: " + Arrays.toString(article.getImage()) + " ");
//            System.out.println();
        }
    }

    private long nextId(){
        List<Long> ids = new ArrayList<>();
        for(Article article:articles){
            ids.add(article.getId());
        }
        Collections.sort(ids, Collections.reverseOrder());
        if (ids.size() == 0){
            return 1;
        }else return ids.get(0) + 1;
    }


    public static void main(String[] args) {
        Article article1 = new Article("Ali ata bak", "basic book", 10, "this is a picture".getBytes(), 2);
        ArticleRepo articleRepoImpl = new ArticleRepoImpl();
        Article article2 = new Article("Car", "basic books", 4, "car picture".getBytes(), 4);
        Article article3 = new Article("Truck", "basic books", 4, "car picture".getBytes(), 7);
        articleRepoImpl.create(article1);
        articleRepoImpl.create(article2);
        articleRepoImpl.create(article3);
        articleRepoImpl.view(articleRepoImpl.findAll());
        System.out.println();
        System.out.println(articleRepoImpl.findById(1).getName());
        articleRepoImpl.remove(1);
        articleRepoImpl.view(articleRepoImpl.findAll());

    }
}
