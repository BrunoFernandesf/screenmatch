import br.com.bruno.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args){
        //Instanciando o objeto1 e atribuindo valores
        Filme meuFilme1 = new Filme();
        meuFilme1.setNome("O Poderoso Chefão");
        meuFilme1.setAnoLancamento(1970);
        meuFilme1.setDuracaoMinutos(180);

        meuFilme1.exibeFichaTecnica();
        meuFilme1.avalia(7.5);
        meuFilme1.avalia(6.0);
        System.out.println(meuFilme1.obterMedia());

        System.out.println(meuFilme1.getTotalAvaliacao());
    }
}
