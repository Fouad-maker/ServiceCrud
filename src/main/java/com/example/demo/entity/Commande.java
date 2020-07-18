package com.example.demo.entity;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection  = "Commande")
public class Commande {
	
	 @Id
	private String id;
	private String mat;
	private Date dateCmd; 
	private double totalCmd; 
	private String modePaiement;
	
	private LigneCommande ligneCmd ; 
	
	private Client clientCmd;
	
	private LigneLivraison ligneLivraisonCmd;
	
	  
    public String getId() {
        return this.mat;
    }
    public void setMat(String mat) {
        
        this.mat=this.id;
    }


	
}
