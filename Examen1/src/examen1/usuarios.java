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
public class usuarios {
    private String nombre;
    private int edad;
    private String correo;
    private String username;
    private String password;
    private ArrayList<clases> clase=new ArrayList();

    public usuarios() {
    }

    public usuarios(String nombre, int edad, String correo, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<clases> getClase() {
        return clase;
    }

    public void setClase(ArrayList<clases> clase) {
        this.clase = clase;
    }
    
}
