/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;


public class CategoriaFactory {
       
    public Categoria getCategoria(String tipo)
    {
        switch(tipo)
        {
            case "Aseo":
                return new Aseo();
            case "Electronica":
                return new Electronica();
            case "Alimentos":
                return new Alimentos();
            default: return new Otro();
        }
        
    }
}
