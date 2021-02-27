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
public class CEO {
    public String nombre;
    public int nRegistro;
    public String apellido;
    public String nacionalidad;
    public String tituloU;
    public int edad;
    public int añosEx;
    public int añosLab;

    public CEO() {
    }

    public CEO(String nombre, int nRegistro, String apellido, String nacionalidad, String tituloU, int edad, int añosEx, int añosLab) {
        this.nombre = nombre;
        this.nRegistro = nRegistro;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.tituloU = tituloU;
        this.edad = edad;
        this.añosEx = añosEx;
        this.añosLab = añosLab;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTituloU() {
        return tituloU;
    }

    public void setTituloU(String tituloU) {
        this.tituloU = tituloU;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosEx() {
        return añosEx;
    }

    public void setAñosEx(int añosEx) {
        this.añosEx = añosEx;
    }

    public int getAñosLab() {
        return añosLab;
    }

    public void setAñosLab(int añosLab) {
        this.añosLab = añosLab;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
