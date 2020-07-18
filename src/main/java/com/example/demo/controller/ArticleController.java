package com.example.demo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Article;
import com.example.demo.entity.Client;
import com.example.demo.entity.Fournisseur;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.FournisseurRepository;

import lombok.var;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
public class ArticleController {
	
	
	/*
	
		@RequestMapping(value = "/sid/{imageName}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getImage(@PathVariable("imageName") String imageName) throws IOException {
		var imgFile = new ClassPathResource("static/images/"+imageName+".jpg");
		return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
    */

}






