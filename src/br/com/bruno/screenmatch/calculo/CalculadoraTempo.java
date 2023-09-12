package br.com.bruno.screenmatch.calculo;

import br.com.bruno.screenmatch.modelo.Filme;
import br.com.bruno.screenmatch.modelo.Serie;
import br.com.bruno.screenmatch.modelo.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoMinutos();
    }
}
