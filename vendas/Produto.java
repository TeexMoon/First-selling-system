package vendas;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Definição de atributos para a classe Produto

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidade) {
        this.quantidadeEmEstoque = quantidade;
    }

    // Método polimórfico
    public double calcularCustoEnvio() {
        // Implementação genérica que pode ser sobrescrita nas classes derivadas
        return 10.0; // Custo de envio padrão
    }

    public char gettamanho() {
        return null;
    }

    public int getvoltagem() {
        return 0;
    }
}
