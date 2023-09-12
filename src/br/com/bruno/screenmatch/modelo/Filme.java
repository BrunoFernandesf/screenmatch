package br.com.bruno.screenmatch.modelo;

import br.com.bruno.screenmatch.calculo.Classificavel;

import java.util.Scanner;

//Herda da classe Titulo
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) obterMedia() / 2;
    }
}
