package com.example.demo.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection  = "Article")
public class Article {
	@Id
    private String id;
    private String mat;
	private String designtationArt;
	private String descriptionArt;
	private  double prixArt;
	private int qteStockArt;
	private double tauxRemiseArt;
				
	
	
	private Marque marqueArt;
	
	private SousCategorie sousCategorieArt;
	
	private Fournisseur fournisseurArt;
	
	private Avis avisArt ; 
	

	private ImageModel imageModel ;
	
	public String getId() {
        return this.mat;
    }
    public void setMat(String mat) {
        
        this.mat=this.id;
    }
	
}
