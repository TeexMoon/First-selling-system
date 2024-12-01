package vendas;

public class Eletronico extends Produto {
    private int voltagem;

    // Definição de atributos para a classe Eletronico

    public Eletronico(String nome, double preco, int quantidadeEmEstoque, int voltagem) {
        super(nome, preco, quantidadeEmEstoque);
        this.setVoltagem(voltagem);
    }

    @Override
    public double calcularCustoEnvio() {
        // Implementação específica para Eletronico
        return super.calcularCustoEnvio() + 5.0; // Custo adicional para eletrônicos
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int i) {
        this.voltagem = i;
    }
}
