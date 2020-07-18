package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection ="Utilisateur" )
public class Utilisateur {
    @Id
    private String id;
    private String mat;
    private String username ; 
    private String password ; 
    private String nom;
    private String prenom;
    private String role; 
    
    public String getId() {
        return this.mat;
    }
    public void setMat(String mat) {
        
        this.mat=this.id;
    }

 

}
