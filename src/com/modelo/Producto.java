/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.util.ArrayList;


public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private Categoria c;
    private ArrayList <Proveedor>p= new ArrayList<Proveedor>();
    
    Producto()
    {
        
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the c
     */
    public Categoria getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Categoria c) {
        this.c = c;
    }

    /**
     * @return the p
     */
    public ArrayList <Proveedor> getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(ArrayList <Proveedor> p) {
        this.p = p;
    }
    
}

