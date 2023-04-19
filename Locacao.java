package com.mycompany.locacaoquadra5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Locacao {
    
    private Locatario locatario;
    private Quadra quadra;
    private int tempoMinuto;
    private char necessitaEquipamento;

    public Locacao() {
    }

    public Locacao(Locatario locatario, Quadra quadra, int tempoMinuto, char necessitaEquipamento) {
        this.locatario = locatario;
        this.quadra = quadra;
        this.tempoMinuto = tempoMinuto;
        this.necessitaEquipamento = necessitaEquipamento;
    }
    
    public void cadastrarLocatario() {
        String nome = JOptionPane.showInputDialog("Informe o nome do locatário:");
        String cpf = JOptionPane.showInputDialog("Informe o CPF do locatário:");
        String telefone = JOptionPane.showInputDialog("Informe o telefone do locatário:");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento do locatário:"));
        this.locatario = new Locatario(nome, cpf, telefone, anoNascimento);
    }
    
    public void cadastrarQuadra() {
        String nome = JOptionPane.showInputDialog("Informe o nome da quadra:");
        String tipoQuadra = JOptionPane.showInputDialog("Informe o tipo da quadra:");
        int valorMinuto = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor por minuto da quadra:"));
        this.quadra = new Quadra(nome, tipoQuadra, valorMinuto);
    }
    
    public boolean verificarIdade() {
        return this.locatario.verificarMaiorIdade();
    }
    
    public double calcularLocacao() {
        double valorCalculado = this.tempoMinuto * this.quadra.getValorMinuto();
        
        if (this.tempoMinuto > 120) {
            valorCalculado *= 0.9;
        }
        
        if (this.necessitaEquipamento == 'S') {
            valorCalculado += 50;
        }
        
        return valorCalculado;
    }
    
    public void mostrarResumoLocacao() {
        String resumo = "Locatario\n";
        resumo += "Nome: " + this.locatario.getNome() + "\n";
        resumo += "CPF: " + this.locatario.getCpf() + "\n";
        resumo += "Telefone: " + this.locatario.getTelefone() + "\n";
        resumo += "Ano de Nascimento: " + this.locatario.getAnoNascimento() + "\n";
        resumo += "Quadra\n";
        resumo += "Nome da Quadra: " + this.quadra.getNome() + "\n";
        resumo += "Tipo: " + this.quadra.getTipoQuadra() + "\n";
        resumo += "Valor do Minuto: " + this.quadra.getValorMinuto() + "\n";
        resumo += "Locação\n";
        resumo += "Tempo em Minutos: " + this.tempoMinuto + "\n";
        resumo += "Necessita Equipamento: " + this.necessitaEquipamento + "\n";
        resumo += "Valor Calculado: " + this.calcularLocacao() + "\n";
        
        JOptionPane.showMessageDialog(null, resumo);
    }
    public void cadastrarLocacao() {
    // cadastrar a quadra
    cadastrarQuadra();

    // cadastrar o locatário
    cadastrarLocatario();

    // verificar idade do locatário
    if (!locatario.verificarMaiorIdade()) {
        System.out.println("Locatário menor de idade. Locação não permitida.");
        return;
    }

    // ler tempo da locação
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o tempo em minutos da locação: ");
    int tempoMinuto = scanner.nextInt();

    // ler se necessita equipamento
    System.out.print("Necessita equipamento? (S/N): ");
    char necessitaEquipamento = scanner.next().charAt(0);

    // calcular valor da locação
    double valorLocacao = quadra.getValorMinuto() * tempoMinuto;
    if (tempoMinuto >= 120) {
        valorLocacao *= 0.9; // desconto de 10% para locações acima de 2 horas
    }
    if (necessitaEquipamento == 'S') {
        valorLocacao += 50; // valor adicional para locações com equipamento
    }

    // mostrar resumo da locação
    mostrarResumoLocacao();
    System.out.println("Valor Calculado: " + valorLocacao);
}

public void setQuadra(Quadra quadra) {
    this.quadra = quadra;
}

public void setLocatario(Locatario locatario) {
    this.locatario = locatario;
}

public void setTempoMinuto(int tempoMinuto) {
    this.tempoMinuto = tempoMinuto;
}

public void setNecessitaEquipamento(char necessitaEquipamento) {
    this.necessitaEquipamento = necessitaEquipamento;
}
}
