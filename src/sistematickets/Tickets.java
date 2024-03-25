/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematickets;

import java.util.Date;

/**
 *
 * @author JDANIEL
 */
public class Tickets {

private int numero,fila,asiento;
private Date fechaCompra,fechaValidez;
private double precio;


    public Tickets(int numero, int fila, int asiento, Date fechaCompra, Date fechaValidez, double precio) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
        this.precio = precio;
    }

    public Tickets() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ticket" + "numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", fechaCompra=" + fechaCompra + ", fechaValidez=" + fechaValidez + ", precio=" + precio;
    }

    

}
