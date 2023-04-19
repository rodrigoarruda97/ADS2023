package com.mycompany.locacaoquadra5;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Locatario {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;

   public Locatario(String nome, String cpf, String telefone, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public boolean verificarMaiorIdade() {
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int idade = anoAtual - anoNascimento;
        return idade >= 18;
    }

    public void cadastrarLocatario() {
        this.nome = JOptionPane.showInputDialog("Digite o nome do locatário:");
        this.cpf = JOptionPane.showInputDialog("Digite o CPF do locatário:");
        this.telefone = JOptionPane.showInputDialog("Digite o telefone do locatário:");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do locatário:"));
    }
}