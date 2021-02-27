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
public class PersonalPlanta {
    public String nombre;
    public int nRegistro;
    public String apellido;
    public String cargo;
    public String facultad;
    public String carreraAs;
    public String claseAs;

    public PersonalPlanta() {
    }

    public PersonalPlanta(String nombre, int nRegistro, String apellido, String cargo, String facultad, String carreraAs, String claseAs) {
        this.nombre = nombre;
        this.nRegistro = nRegistro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.facultad = facultad;
        this.carreraAs = carreraAs;
        this.claseAs = claseAs;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarreraAs() {
        return carreraAs;
    }

    public void setCarreraAs(String carreraAs) {
        this.carreraAs = carreraAs;
    }

    public String getClaseAs() {
        return claseAs;
    }

    public void setClaseAs(String claseAs) {
        this.claseAs = claseAs;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
