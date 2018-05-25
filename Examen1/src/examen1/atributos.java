/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author david
 */
public class atributos {
    private String atri;

    public atributos() {
    }

    public atributos(String atri) {
        this.atri = atri;
    }

    public String getAtri() {
        return atri;
    }

    public void setAtri(String atri) {
        this.atri = atri;
    }

    @Override
    public String toString() {
        return "atributos{" + "atri=" + atri + '}';
    }
    
}
