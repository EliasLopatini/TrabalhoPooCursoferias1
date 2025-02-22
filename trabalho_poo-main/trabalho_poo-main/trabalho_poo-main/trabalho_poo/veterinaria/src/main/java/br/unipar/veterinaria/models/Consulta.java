package br.unipar.veterinaria.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Consulta {
	
    private int id;
    private Animal animal;
    private Proprietario proprietario;
    private Veterinario veterinario;
    private Date dataConsulta;
    private List<Medicamento> medicamentos = new ArrayList<>();
    private List<Exame> exames = new ArrayList<>();
    private double valorConsulta;
    private double valorTotal;

    public Consulta() {
    }

    public Consulta(int id, Animal animal, Proprietario proprietario, Veterinario veterinario, Date dataConsulta, double valorConsulta, double valorTotal) {
        this.id = id;
        this.animal = animal;
        this.proprietario = proprietario;
        this.veterinario = veterinario;
        this.dataConsulta = dataConsulta;
        this.valorConsulta = valorConsulta;
        this.valorTotal = valorTotal;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
    return "Consulta{\n" +
           "  id=" + id + "\n" +
           "  animal=" + animal + "\n" +
           "  proprietario=" + proprietario + "\n" +
           "  veterinario=" + veterinario + "\n" +
           "  dataConsulta=" + dataConsulta + "\n" +
           "  medicamentos=" + medicamentos + "\n" +
           "  exames=" + exames + "\n" +
           "  valorConsulta=" + valorConsulta + "\n" +
           "  valorTotal=" + valorTotal + "\n" +
           '}';
}

    
}
