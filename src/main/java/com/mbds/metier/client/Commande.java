/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbds.service.client;

/**
 *
 * @author BENATHMANE
 */
public class Commande {
    private double noCommande;
    private String date;
    private String montant;
    private String statut;

    public Commande(double noCommande, String date, String montant, String statut) {
        this.noCommande = noCommande;
        this.date = date;
        this.montant = montant;
        this.statut = statut;
    }

    public double getNoCommande() {
        return noCommande;
    }

    public String getDate() {
        return date;
    }

    public String getMontant() {
        return montant;
    }

    public String getStatut() {
        return statut;
    }

    public void setNoCommande(double noCommande) {
        this.noCommande = noCommande;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    
    
}
