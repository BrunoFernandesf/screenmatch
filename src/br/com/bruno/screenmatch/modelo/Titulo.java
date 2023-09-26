package br.com.bruno.screenmatch.modelo;

import br.com.bruno.screenmatch.excecao.ErroConversaoAnoException;
import com.google.gson.annotations.SerializedName;

//super class
public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoLancamento;
    private int duracaoMinutos;
    private boolean incluidoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length() > 4){
            throw new ErroConversaoAnoException("Não consegui converter o ano por ter mais de 04 caracteres");
        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

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

    @Override
    public int compareTo(Titulo o) {
        return 0;
    }

    @Override
    public String toString() {
        return "(nome = " + nome +
                ", anoLancamento=" + anoLancamento + ", "+ "duração "+ duracaoMinutos+" minutos)";
    }
}
