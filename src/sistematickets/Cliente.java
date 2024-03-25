/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematickets;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JDANIEL
 */
public class Cliente {

private int id;
private String dni,nombre,apellido;
List<Tickets> tikets;
    public Cliente() {
        tikets =  new ArrayList<>();
    }

    public Cliente(int id, String dni, String nombre, String apellido, List<Tickets> tikets) {
       this();
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tikets = tikets;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Tickets> getTikets() {
        return tikets;
    }

    public void setTikets(List<Tickets> tikets) {
        this.tikets = tikets;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", tikets=" + tikets + '}';
    }

    
    

}
