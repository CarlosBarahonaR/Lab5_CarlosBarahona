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
public class Administrativos {
    public String nombre;
    public int nRegistro;
    public String apellido;
    public String cargo;
    public String areaAs;
    public int cantidadSub;
    public String nombreAsis;
    public String nombreJefe;

    public Administrativos() {
    }

    public Administrativos(String nombre, int nRegistro, String apellido, String cargo, String areaAs, int cantidadSub, String nombreAsis, String nombreJefe) {
        this.nombre = nombre;
        this.nRegistro = nRegistro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.areaAs = areaAs;
        this.cantidadSub = cantidadSub;
        this.nombreAsis = nombreAsis;
        this.nombreJefe = nombreJefe;
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

    public String getAreaAs() {
        return areaAs;
    }

    public void setAreaAs(String areaAs) {
        this.areaAs = areaAs;
    }

    public int getCantidadSub() {
        return cantidadSub;
    }

    public void setCantidadSub(int cantidadSub) {
        this.cantidadSub = cantidadSub;
    }

    public String getNombreAsis() {
        return nombreAsis;
    }

    public void setNombreAsis(String nombreAsis) {
        this.nombreAsis = nombreAsis;
    }

    public String getNombreJefe() {
        return nombreJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
