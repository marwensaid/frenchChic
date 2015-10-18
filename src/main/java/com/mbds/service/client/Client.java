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
public class Client {
    
    private String nom;
    private String prenom;
    private String login;
    private String motdepasse;
    private String adressedeFacturation;
    private String adressedeLivraison;
    private String numero;
    
    public Client findbyLogin(String login, String motdepasse){
        return null;
    }
    
    public void creer(){}

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public void setAdressedeFacturation(String adressedeFacturation) {
        this.adressedeFacturation = adressedeFacturation;
    }

    public void setAdressedeLivraison(String adressedeLivraison) {
        this.adressedeLivraison = adressedeLivraison;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogin() {
        return login;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public String getAdressedeFacturation() {
        return adressedeFacturation;
    }

    public String getAdressedeLivraison() {
        return adressedeLivraison;
    }

    public String getNumero() {
        return numero;
    }
    
    
    
    
}
