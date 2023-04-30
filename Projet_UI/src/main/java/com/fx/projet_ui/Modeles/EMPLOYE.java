package com.fx.projet_ui.Modeles;

public class EMPLOYE {
    private int id;
    private String nom, prenom, adresse, poste, code_user, password;
    private int telephone;
    public EMPLOYE(){

    }



    public EMPLOYE(int id, String nom, String prenom, String adresse, String poste, int telephone, String code_user, String password)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.poste = poste;
        this.telephone = telephone;
        this.code_user = code_user;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode_user() {
        return code_user;
    }

    public void setCode_user(String code_user) {
        this.code_user = code_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "EMPLOYE{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", poste='" + poste + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}
