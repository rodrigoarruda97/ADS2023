package com.mycompany.locacaoquadra5;

import javax.swing.JOptionPane;

public class Quadra {
    private int nome;
    private String tipoQuadra;
    private int valorMinuto;

    public Quadra(int nome, String tipoQuadra, int valorMinuto) {
        this.nome = nome;
        this.tipoQuadra = tipoQuadra;
        this.valorMinuto = valorMinuto;
    }

    Quadra(String nome, String tipoQuadra, int valorMinuto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public String getTipoQuadra() {
        return tipoQuadra;
    }

    public void setTipoQuadra(String tipoQuadra) {
        this.tipoQuadra = tipoQuadra;
    }

    public int getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public void cadastrarQuadra() {
        this.nome = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome da quadra:"));
        this.tipoQuadra = JOptionPane.showInputDialog("Digite o tipo da quadra:");
        this.valorMinuto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por minuto da quadra:"));
    }
}