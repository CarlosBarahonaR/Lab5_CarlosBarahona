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
public class Estudiante {
    public String nombre;
    public int nRegistro;
    public String apellido;
    public String carrera;
    public boolean equipoDep;
    public String facultad;
    public int clasesCursar;
    public boolean beca;
    public boolean automovil;

    public Estudiante() {
    }

    public Estudiante(String nombre, int nRegistro, String apellido, String carrera, boolean equipoDep, String facultad, int clasesCursar, boolean beca, boolean automovil) {
        this.nombre = nombre;
        this.nRegistro = nRegistro;
        this.apellido = apellido;
        this.carrera = carrera;
        this.equipoDep = equipoDep;
        this.facultad = facultad;
        this.clasesCursar = clasesCursar;
        this.beca = beca;
        this.automovil = automovil;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public boolean isEquipoDep() {
        return equipoDep;
    }

    public void setEquipoDep(boolean equipoDep) {
        this.equipoDep = equipoDep;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getClasesCursar() {
        return clasesCursar;
    }

    public void setClasesCursar(int clasesCursar) {
        this.clasesCursar = clasesCursar;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public boolean isAutomovil() {
        return automovil;
    }

    public void setAutomovil(boolean automovil) {
        this.automovil = automovil;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
