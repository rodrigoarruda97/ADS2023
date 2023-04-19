package com.mycompany.locacaoquadra5;

public class TesteLocacao {
    public static void main(String[] args) {
        // Criando uma quadra
        Quadra quadra = new Quadra(1,"Areia",15);
        quadra.setNome(1);
        quadra.setTipoQuadra("Areia");
        quadra.setValorMinuto(5);
        
        // Criando um locatário
        Locatario locatario = new Locatario("Rogério", "222.111.111-22","(21)1234-1234",1990);
        locatario.setNome("Rogério");
        locatario.setCpf("231.111.111-22");
        locatario.setTelefone("(21) 1234-1234");
        locatario.setAnoNascimento(1985);
        
        // Criando uma locação
        Locacao locacao = new Locacao(locatario,quadra,60,'s');
        locacao.setQuadra(quadra);
        locacao.setLocatario(locatario);
        locacao.setTempoMinuto(60);
        locacao.setNecessitaEquipamento('S');
        
        locacao.mostrarResumoLocacao();
    }
}