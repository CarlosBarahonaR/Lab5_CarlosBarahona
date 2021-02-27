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
public class PersonalDeConsejo {

    public String nombre;
    public int nRegistro;
    public String apellido;
    public String cargo;
    public String puestoAsesor;
    public int becados;
    public int personasCargo;
    public String segundoTrab;
    public String cargoST;
    public String nombreAcuerdo;

    public PersonalDeConsejo() {
    }

    public PersonalDeConsejo(String nombre, int nRegistro, String apellido, String cargo, String puestoAsesor, int becados, int personasCargo, String segundoTrab, String cargoST, String nombreAcuerdo) {
        this.nombre = nombre;
        this.nRegistro = nRegistro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.puestoAsesor = puestoAsesor;
        this.becados = becados;
        this.personasCargo = personasCargo;
        this.segundoTrab = segundoTrab;
        this.cargoST = cargoST;
        this.nombreAcuerdo = nombreAcuerdo;
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

    public String getPuestoAsesor() {
        return puestoAsesor;
    }

    public void setPuestoAsesor(String puestoAsesor) {
        this.puestoAsesor = puestoAsesor;
    }

    public int getBecados() {
        return becados;
    }

    public void setBecados(int becados) {
        this.becados = becados;
    }

    public int getPersonasCargo() {
        return personasCargo;
    }

    public void setPersonasCargo(int personasCargo) {
        this.personasCargo = personasCargo;
    }

    public String getSegundoTrab() {
        return segundoTrab;
    }

    public void setSegundoTrab(String segundoTrab) {
        this.segundoTrab = segundoTrab;
    }

    public String getCargoST() {
        return cargoST;
    }

    public void setCargoST(String cargoST) {
        this.cargoST = cargoST;
    }

    public String getNombreAcuerdo() {
        return nombreAcuerdo;
    }

    public void setNombreAcuerdo(String nombreAcuerdo) {
        this.nombreAcuerdo = nombreAcuerdo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
