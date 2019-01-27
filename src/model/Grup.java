/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Set;

/**
 *
 * @author Sandra
 */
public class Grup {

    private String codi;
    private Nivell nivell;
    private Alumne delegat;
    private Set<Alumne> alumnes;

    public Grup() {
    }

    public Grup(String codi, Nivell nivell, Alumne delegat) {
        this.codi = codi;
        this.nivell = nivell;
        this.delegat = delegat;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public Nivell getNivell() {
        return nivell;
    }

    public void setNivell(Nivell nivell) {
        this.nivell = nivell;
    }

    public Alumne getDelegat() {
        return delegat;
    }

    public void setDelegat(Alumne delegat) {
        this.delegat = delegat;
    }

    public Set<Alumne> getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(Set<Alumne> alumnes) {
        this.alumnes = alumnes;
    }

    @Override
    public String toString() {
        return "Grup{" + "codi=" + codi + ", nivell=" + nivell + ", delegat=" + delegat + '}';
    }

}
