/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.veterinaria.models;

/**
 *
 * @author 03016719
 */
public class Telefone {
    
    private int id;
    private String ddd;
    private String numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

   @Override
public String toString() {
    return "Telefone{\n" +
           "  id=" + id + ",\n" +
           "  ddd='" + ddd + "',\n" +
           "  numero='" + numero + "'\n" +
           '}';
}

    
    
}
