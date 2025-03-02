package dobackaofront;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Tênis Vans Authentic", "Authentic é o estilo tradicional original da Vans", 299.90);
        Produto produto2 = new Produto("Tênis Vans Old Skool", "O Tênis Old Skool é um tênis de cano baixo com cadarço", 379.90);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(produto1);
        carrinho.adicionar(produto2);
        carrinho.remover("Tênis Vans Authentic");


        Venda venda1 = new Venda(carrinho);
        venda1.totalPreco();
    }
}
