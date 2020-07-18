package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Marque")
public class Marque {
	@Id
    private String id;
    private String mat;
	private String libelleMarq;
	
	 public String getId() {
	        return this.mat;
	    }
	    public void setMat(String mat) {
	        
	        this.mat=this.id;
	    }
}
