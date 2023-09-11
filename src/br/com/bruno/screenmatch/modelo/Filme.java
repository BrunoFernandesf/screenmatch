package br.com.bruno.screenmatch.modelo;

import java.util.Scanner;

public class Filme {
    private String nome;
    private int anoLancamento;
    private int duracaoMinutos;
    private boolean incluidoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano (boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    //Imprime informações referente ao filme
    public void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia (double nota) {

        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    public double obterMedia () {
        return somaAvaliacao / totalAvaliacao;
    }
}
