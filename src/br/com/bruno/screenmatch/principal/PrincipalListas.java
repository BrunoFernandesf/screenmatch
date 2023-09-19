package br.com.bruno.screenmatch.principal;

import br.com.bruno.screenmatch.modelo.Filme;
import br.com.bruno.screenmatch.modelo.Serie;
import br.com.bruno.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme meuFilme1 = new Filme("O poderoso chefão", 1970);
        Filme meuFilme2 = new Filme("Top Gun", 2023);
        var meuFilme3 = new Filme("Pacific Rim", 2018);
        Serie minhaSerie1 = new Serie("Avatar: last airbender", 2010);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme1);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(minhaSerie1);
        for (Titulo item: lista) {
            System.out.println(item);
            Filme filme = (Filme) item;
            System.out.println("Imprime classificação "+ filme.getTotalAvaliacao());
        }
    }
}
