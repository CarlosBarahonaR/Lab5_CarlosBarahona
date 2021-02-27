/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_carlosbarahona;

/**
 *
 * @author Admin
 */
public class Docente {
    public String nombre;
    public int nRegistro;
    public String apellido;
    public String claseAs;
    public String facultadAs;
    public boolean trabajaDFs;
    public String areaCon;
    public boolean laboratiorio;

    public Docente() {
    }

    public Docente(String nombre, int nRegistro, String apellido, String claseAs, String facultadAs, boolean trabajaDFs, String areaCon, boolean laboratiorio) {
        this.nombre = nombre;
        this.nRegistro = nRegistro;
        this.apellido = apellido;
        this.claseAs = claseAs;
        this.facultadAs = facultadAs;
        this.trabajaDFs = trabajaDFs;
        this.areaCon = areaCon;
        this.laboratiorio = laboratiorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClaseAs() {
        return claseAs;
    }

    public void setClaseAs(String claseAs) {
        this.claseAs = claseAs;
    }

    public String getFacultadAs() {
        return facultadAs;
    }

    public void setFacultadAs(String facultadAs) {
        this.facultadAs = facultadAs;
    }

    public boolean isTrabajaDFs() {
        return trabajaDFs;
    }

    public void setTrabajaDFs(boolean trabajaDFs) {
        this.trabajaDFs = trabajaDFs;
    }

    public String getAreaCon() {
        return areaCon;
    }

    public void setAreaCon(String areaCon) {
        this.areaCon = areaCon;
    }

    public boolean isLaboratiorio() {
        return laboratiorio;
    }

    public void setLaboratiorio(boolean laboratiorio) {
        this.laboratiorio = laboratiorio;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
   
    
}
