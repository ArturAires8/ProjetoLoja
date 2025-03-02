package dobackaofront;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionar(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " foi adicionado no carrinho!");

    }


    public void remover(String nome) {
        int codigo = -1;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                codigo = i;
                produtos.remove(codigo);
                break;
            } else {
                continue;
            }
        }

        if (codigo == -1) {
            System.out.println("O produto não foi encontrado!");
        } else {
            System.out.println("O produto " + nome + " foi removido do carrinho!");
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

}








