package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Livraison")
public class Livraison {
	
	@Id
    private String id;
    private String mat;
	private String modeLiv ; 
	
	public String getId() {
        return this.mat;
    }
    public void setMat(String mat) {
        
        this.mat=this.id;
    }
}
