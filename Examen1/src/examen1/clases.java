/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class clases {
    private String id;
    private ArrayList<atributos> atri=new ArrayList();
    private ArrayList<metodos> met=new ArrayList();

    public clases() {
    }

    public clases(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<atributos> getAtri() {
        return atri;
    }

    public void setAtri(ArrayList<atributos> atri) {
        this.atri = atri;
    }

    public ArrayList<metodos> getMet() {
        return met;
    }

    public void setMet(ArrayList<metodos> met) {
        this.met = met;
    }

    @Override
    public String toString() {
        return "clases{" + "id=" + id + ", atri=" + atri + ", met=" + met + '}';
    }
    
}
