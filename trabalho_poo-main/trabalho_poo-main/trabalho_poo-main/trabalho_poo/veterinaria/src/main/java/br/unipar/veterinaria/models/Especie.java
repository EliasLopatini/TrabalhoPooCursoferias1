/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.veterinaria.models;

/**
 *
 * @author 03016719
 */
public class Especie {
    
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
@Override
public String toString() {
    return "Especie{\n" +
           "  id=" + id + ",\n" +
           "  nome='" + nome + "'\n" +
           '}';
}

    
}
