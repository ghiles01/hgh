package net.javaguides.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

import java.util.Objects;





@Entity

@Table(name="calibrateur")

public class Calibrateur  {



    private static final long serialVersionUID = 1L;

    @Id

    @GeneratedValue(strategy=GenerationType.IDENTITY)

   

    @Column(name="désignation",length= 50)

    private String désignation;

    @Column(name="marque",length= 50)

    private String marque;

    @Column(name="mod_éle",length= 50)

    private String mod_éle;

    @Column(name="par_de_mesure",length= 50)

    private String par_de_mesure;

    @Column(name="etendu_de_mesure",length= 50)

    private String etendu_de_mesure;

    @Column(name="case_de_pression",length= 50)

    private String case_de_pression;

    @Column(name="etat",length= 50)

    private String etat;


  
    public Calibrateur() {}
    
    public Calibrateur( String désignation, String marque, String mod_éle, String par_de_mesure, String etendu_de_mesure, String case_de_pression, String etat) {

        

        this.désignation = désignation;

        this.marque = marque;

        this.mod_éle = mod_éle;

        this.par_de_mesure = par_de_mesure;

        this.etendu_de_mesure = etendu_de_mesure;

        this.case_de_pression = case_de_pression;

        this.etat = etat;

    }
    

    



    public static long getSerialVersionUID() {

        return serialVersionUID;

    }



    



    public String getDésignation() {

        return désignation;

    }



    public String getMarque() {

        return marque;

    }



    public String getMod_éle() {

        return mod_éle;

    }



    public String getPar_de_mesure() {

        return par_de_mesure;

    }



    public String getEtendu_de_mesure() {

        return etendu_de_mesure;

    }



    public String getCase_de_pression() {

        return case_de_pression;

    }



    public String getEtat() {

        return etat;

    }



    


    public void setDésignation(String désignation) {

        this.désignation = désignation;

    }



    public void setMarque(String marque) {

        this.marque = marque;

    }



    public void setMod_éle(String mod_éle) {

        this.mod_éle = mod_éle;

    }



    public void setPar_de_mesure(String par_de_mesure) {

        this.par_de_mesure = par_de_mesure;

    }



    public void setEtendu_de_mesure(String etendu_de_mesure) {

        this.etendu_de_mesure = etendu_de_mesure;

    }



    public void setCase_de_pression(String case_de_pression) {

        this.case_de_pression = case_de_pression;

    }



    public void setEtat(String etat) {

        this.etat = etat;

    }
}