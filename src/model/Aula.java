/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Sandra
 */
public class Aula implements Serializable{
    private String codiAula;
    private String nom;

    public Aula() {
    }

    public Aula(String codiAula, String nom) {
        this.codiAula = codiAula;
        this.nom = nom;
    }

    public String getCodiAula() {
        return codiAula;
    }

    public void setCodiAula(String codiAula) {
        this.codiAula = codiAula;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Aula{" + "codiAula=" + codiAula + ", nom=" + nom + '}';
    }
    
    
}
