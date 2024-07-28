package br.unipar.veterinaria;

import br.unipar.veterinaria.models.Animal;
import br.unipar.veterinaria.models.Consulta;
import br.unipar.veterinaria.models.Endereco;
import br.unipar.veterinaria.models.Especie;
import br.unipar.veterinaria.models.Exame;
import br.unipar.veterinaria.models.Medicamento;
import br.unipar.veterinaria.models.Proprietario;
import br.unipar.veterinaria.models.RacaAnimal;
import br.unipar.veterinaria.models.Telefone;
import br.unipar.veterinaria.models.TosaBanho;
import br.unipar.veterinaria.models.Vacina;
import br.unipar.veterinaria.models.Veterinario;
import br.unipar.veterinaria.models.enums.Especialidade;
import java.util.Date;
import javax.swing.JOptionPane;

/*
   Desenvolver a camada de modelagem de domínio(Classes de Modelo) de uma aplicação de clínica veterinária
   atendendo aos requisitos abaixo:

    RQF.001 - Manter animais 
    Poder ter acesso às informações sobre todos os animais que são tratados na clínica.

    RQF.002 - Manter proprietários 
    Poder ter acesso às informações sobre todos o proprietários que visitam a clínica

    RQF.003 - Manter Médicos Veterinarios 
    Manter os dados dos profissionais médicos veterinários que atendem na clínica e realizam as consultas.

    RQF.004 - Controlar Consultas 
    Saber quais animais estão sendo consultados e quais são as medicações que cada um recebe e valor total a ser cobrado do proprietário considerando os medicamentos, exames e o valor da consulta.

    RQF.005 - Controlar vacinações 
    Controlar se os animais estão corretamente vacinados e controlar a data da segunda dose.

    RQF.006 -  Controlar tosa/banho Controlar os banhos e tosas que cada animal teve e se há algum banho/tosa marcado.

    RQF.007 - Manter Vacinas 
    Poder ter acesso às informações e dados das vacinas fornecidas pela clínica.

    RQF.008 - Manter medicamentos 
    Poder ter acesso às informações e dados dos medicamentos utilizados durante as consultas.

    RQF.009 - Manter exames 
    Poder ter acesso às informações e dados dos exames prestados pela clínica durante as consultas.
 */
public class Veterinaria {

    public static void main(String[] args) {
        
        
        Telefone telefoneProprietario = new Telefone();
        telefoneProprietario.setId(1);
        telefoneProprietario.setDdd("44");
        telefoneProprietario.setNumero("998361783");
        
        
        JOptionPane.showMessageDialog(null, telefoneProprietario.toString());
      
        Telefone telefoneVeterinario = new Telefone();
        telefoneVeterinario.setId(1);
        telefoneVeterinario.setDdd("44");
        telefoneVeterinario.setNumero("993261785");
        
        JOptionPane.showMessageDialog(null, telefoneVeterinario);
        
        
        Endereco endereco = new Endereco();
        endereco.setId(1);
        endereco.setCep("85955000");
        endereco.setCidade("TOLEDO");
        endereco.setEstado("PARANA");
        endereco.setNumero("400");
        endereco.setPais("BRASIL");
        endereco.setRua("PARIGO");
        
        JOptionPane.showMessageDialog(null, endereco);
        
        Especie gato = new Especie();
        gato.setId(1);
        gato.setNome("gato");
        
        JOptionPane.showMessageDialog(null, gato);
        
        RacaAnimal siames = new RacaAnimal();
        siames.setId(1);
        siames.setNome("siames");
        
        JOptionPane.showMessageDialog(null, siames);

        Proprietario proprietario = new Proprietario();
        proprietario.setId(1);
        proprietario.setNome("Elias");
        proprietario.setTelefone(telefoneProprietario);
        proprietario.setEndereco(endereco);
        proprietario.setEmail("email");
        
        JOptionPane.showMessageDialog(null, proprietario);

        Animal animal = new Animal();
        animal.setId(1);
        animal.setIdade(2);
        animal.setNome("Felix");
        animal.setEspecie(gato);
        animal.setProprietario(proprietario);
        animal.setRaca(siames);
        
        JOptionPane.showMessageDialog(null, animal);
        
        TosaBanho tosaBanho = new TosaBanho();
        tosaBanho.setId(0);
        tosaBanho.setAnimal(animal);
        tosaBanho.setTipo("banho");
        tosaBanho.setData(new Date());
        tosaBanho.setMarcado(true); 
        
         JOptionPane.showMessageDialog(null, tosaBanho);
        
        Veterinario veterinario = new Veterinario();
        veterinario.setId(1);
        veterinario.setNome("Osvaldo");
        veterinario.setTelefone(telefoneVeterinario);
        veterinario.setEspecialidade(Especialidade.CARDIOLOGIA);
        veterinario.setEmail("osvaldo321@gmail.com");
        
         JOptionPane.showMessageDialog(null, veterinario);
        
        Vacina vacina = new Vacina();
        vacina.setId(1);
        vacina.setNome("Antirrabica");
        vacina.setFabricante("Pedigree");
        vacina.setDataValidade(new Date());
        vacina.setDose("Primeira Dose");
        
         JOptionPane.showMessageDialog(null, vacina);
        
        Medicamento medicamento = new Medicamento();
        medicamento.setId(1);
        medicamento.setNome("Top Gard");
        medicamento.setFabricante("Vansil");
        medicamento.setPreco(22.0);
        medicamento.setDataValidade(new Date());
        
         JOptionPane.showMessageDialog(null, medicamento);
        
        Exame exame = new Exame();
        exame.setId(1);
        exame.setNome("Raio X");
        exame.setPreco(100.0);
        
         JOptionPane.showMessageDialog(null, exame);
        
        Consulta consulta = new Consulta();
        consulta.setId(1);
        consulta.setAnimal(animal);
        consulta.setDataConsulta(new Date());
        consulta.setProprietario(proprietario);
        consulta.setValorConsulta(120.0);
        consulta.setVeterinario(veterinario);
        consulta.setValorTotal(consulta.getValorConsulta()+medicamento.getPreco()+exame.getPreco());
   
        JOptionPane.showMessageDialog(null, consulta);
        
    }
}
