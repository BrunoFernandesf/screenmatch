package br.com.bruno.screenmatch.principal;

import br.com.bruno.screenmatch.modelo.Filme;
import br.com.bruno.screenmatch.modelo.Serie;
import br.com.bruno.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme meuFilme1 = new Filme("O poderoso chefão", 1970);
        Filme meuFilme2 = new Filme("Top Gun", 2023);
        var meuFilme3 = new Filme("Pacific Rim", 2018);
        Serie minhaSerie1 = new Serie("Avatar: last airbender", 2010);

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme1);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(minhaSerie1);
        for (Titulo item: lista) {
            System.out.println(item);
            if(item instanceof Filme filme){
                System.out.println("Imprime classificação "+ filme.getTotalAvaliacao());
            }
        }
        ArrayList<String> listaAtores = new ArrayList<>();
        listaAtores.add("Adam Sandler");
        listaAtores.add("Mila Kunis");
        listaAtores.add("Mila Jojovich");
        listaAtores.add("Tom Cruise");
        listaAtores.add("Idris Elba");

        Collections.sort(listaAtores);
        System.out.println(listaAtores);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(lista);
    }
}
