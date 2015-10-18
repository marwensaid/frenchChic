/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbds.service.produit;

/**
 *
 * @author BENATHMANE
 */
public class Produit {
    
    private double reference;
    private String libelle;
    private String description;
    private double prix;

    public Produit(double reference, String libelle, String description, double prix) {
        this.reference = reference;
        this.libelle = libelle;
        this.description = description;
        this.prix = prix;
    }

    public double getReference() {
        return reference;
    }

    public void setReference(double reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
    
    
}
