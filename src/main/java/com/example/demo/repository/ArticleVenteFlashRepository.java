package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.ArticleVenteFlash;

@RepositoryRestResource
public interface ArticleVenteFlashRepository extends  MongoRepository <ArticleVenteFlash, String>{

}
