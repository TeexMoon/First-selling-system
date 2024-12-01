package vendas;

public class Roupa extends Produto {
    private char tamanho;

    // Definição de atributos para a classe Roupa

    public Roupa(String nome, double preco, int quantidadeEmEstoque, char tamanho) {
        super(nome, preco, quantidadeEmEstoque);
        this.setTamanho(tamanho);
    }

    @Override
    public double calcularCustoEnvio() {
        // Implementação específica para Roupa
        return super.calcularCustoEnvio() + 3.0; // Custo adicional para roupas
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
}
