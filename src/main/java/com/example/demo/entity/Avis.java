package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "Avis")
public class Avis {
	@Id
    private String id;
    private String mat;
	private String avis ; 
	private LocalDateTime dateAvis ; 
	
	private Client client;
	
	public String getId() {
	        return this.mat;
	    }
	    public void setMat(String mat) {
	        
	        this.mat=this.id;
	    }
	

}
