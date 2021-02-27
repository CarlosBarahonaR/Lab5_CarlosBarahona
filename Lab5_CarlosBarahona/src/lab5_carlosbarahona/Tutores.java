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
public class Tutores extends Estudiante {
    public String clase;
    public boolean laboratorio;

    public Tutores() {
    }

    public Tutores(String clase, boolean laboratorio, String nombre, int nRegistro, String apellido, String carrera, boolean equipoDep, String facultad, int clasesCursar, boolean beca, boolean automovil) {
        super(nombre, nRegistro, apellido, carrera, equipoDep, facultad, clasesCursar, beca, automovil);
        this.clase = clase;
        this.laboratorio = laboratorio;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean isLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(boolean laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
     
}
