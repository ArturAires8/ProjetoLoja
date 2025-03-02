package dobackaofront;

import java.util.ArrayList;

public class Venda {
    Carrinho carrinho;

    public Venda(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void totalPreco() {
        ArrayList<Produto> produtos = carrinho.getProdutos();
        double total = 0;

        for (int i = 0; i < produtos.size(); i++) {
            total += produtos.get(i).getPreco();
        }
        System.out.println("O Total da compra foi R$: " + total);

    }

}
