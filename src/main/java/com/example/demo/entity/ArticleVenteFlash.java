package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "ArticleVenteFlash")
public class ArticleVenteFlash extends Article {
    
    private  double prixArtVF;
    private int qteStockArtVF;
    

 

    
}