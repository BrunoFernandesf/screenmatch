package br.com.bruno.screenmatch.modelo;

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
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
