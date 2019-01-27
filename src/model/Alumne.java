/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Sandra
 */
public class Alumne implements Serializable {

    private int nexp;
    private String nom;
    private Telefono telefono;
    private Sexe sexe;
    private Date datanaix;
    private int susp;
    private Grup grup;
    private Set<Grup> grups;

    public Alumne() {
    }

    public Alumne(String nom, Telefono telefono, Sexe sexe, Date datanaix, int susp, Grup grup) {
        this.nom = nom;
        this.telefono = telefono;
        this.sexe = sexe;
        this.datanaix = datanaix;
        this.susp = susp;
        this.grup = grup;
    }

    public int getNexp() {
        return nexp;
    }

    public Set<Grup> getGrups() {
        return grups;
    }

    public void setGrups(Set<Grup> grups) {
        this.grups = grups;
    }

    public void setNexp(int nexp) {
        this.nexp = nexp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public Date getDatanaix() {
        return datanaix;
    }

    public void setDatanaix(Date datanaix) {
        this.datanaix = datanaix;
    }

    public int getSusp() {
        return susp;
    }

    public void setSusp(int susp) {
        this.susp = susp;
    }

    public Grup getGrup() {
        return grup;
    }

    public void setGrup(Grup grup) {
        this.grup = grup;
    }

    @Override
    public String toString() {
        return "Alumne{" + "nexp=" + nexp + ", nom=" + nom + ", telefono=" + telefono + ", sexe=" + sexe + ", datanaix=" + datanaix + ", susp=" + susp + ", grup=" + grup + '}';
    }

}
