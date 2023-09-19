package br.com.bruno.screenmatch.principal;

import br.com.bruno.screenmatch.calculo.CalculadoraTempo;
import br.com.bruno.screenmatch.calculo.Recomendacao;
import br.com.bruno.screenmatch.modelo.Episodio;
import br.com.bruno.screenmatch.modelo.Filme;
import br.com.bruno.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        //Instanciando o objeto1 e atribuindo valores
        Filme meuFilme1 = new Filme("O poderoso chefão", 1970);
        meuFilme1.setDuracaoMinutos(180);
        meuFilme1.exibeFichaTecnica();
        System.out.println("Duração do filme: "+ meuFilme1.getDuracaoMinutos());

        //Instanciando a série
        Serie minhaSerie1 = new Serie("Avatar: last airbender", 2010);
        minhaSerie1.setTemporadas(4);
        minhaSerie1.setEpisodiosTemporada(10);
        minhaSerie1.setMinutosEpisodio(30);
        System.out.println("Duração para maratonar Avatar: "+ minhaSerie1.getDuracaoMinutos());
        minhaSerie1.exibeFichaTecnica();

        Filme meuFilme2 = new Filme("Top Gun", 2023);
        meuFilme2.setDuracaoMinutos(200);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme1);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(minhaSerie1);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var meuFilme3 = new Filme("Pacific Rim", 2018);
        meuFilme3.setDuracaoMinutos(120);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(meuFilme1);
        listaFilmes.add(meuFilme2);
        listaFilmes.add(meuFilme3);
        System.out.println(listaFilmes.size());
        System.out.println(listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        System.out.println(listaFilmes.get(0).toString());
    }
}
