import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();
        Produto produtoUm = new Produto("Tv", 239.90);
        Produto produtoDois = new Produto("Memoria Ram", 999.99);
        Produto produtoTres = new Produto("Monitor", 659.86);

        lista.add(produtoUm);
        lista.add(produtoDois);
        lista.add(produtoTres);

        ListaUtil.ordenarExibir(lista);

    }

}