//Alunos e matrículas
//Everson Padilha Ferreira 01608356
//Elisa Tayná da Silva 01607103
//Luiz Antônio Fonseca 01569641
//Pedro Guilherme Monteiro Wanderley 01607163

package vendas;

import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {

      // Eletrônicos disponíveis para venda

      Eletronico celular = new Eletronico("Smartphone", 999.99, 10, 110);
      Eletronico tablet = new Eletronico("Tablet", 499.99, 20, 220);
      Eletronico laptop = new Eletronico("Laptop", 1299.99, 15, 110);

      // Roupas disponíveis para venda

      Roupa camiseta = new Roupa("Camiseta", 29.99, 50, "M");
      Roupa calcasJeans = new Roupa("Calças Jeans", 49.99, 30, "M");
      Roupa vestido = new Roupa("Vestido", 79.99, 25, "M");

      // Exibição do menu interativo

      exibirMenu(celular, tablet, laptop, camiseta, calcasJeans, vestido);
   }

   private static void exibirMenu(Eletronico celular, Eletronico tablet, Eletronico laptop,
         Roupa camiseta, Roupa calcasJeans, Roupa vestido) {
      while (true) {
         System.out.println("==== MENU ====");
         System.out.println("1. Exibir informações do Celular");
         System.out.println("2. Exibir informações do Tablet");
         System.out.println("3. Exibir informações do Laptop");
         System.out.println("4. Exibir informações da Camiseta");
         System.out.println("5. Exibir informações das Calças Jeans");
         System.out.println("6. Exibir informações do Vestido");
         System.out.println("0. Sair");

         System.out.print("Escolha uma opção: ");
         int escolha = scanner.nextInt();

         switch (escolha) {
            case 1:
               exibirInformacoes(celular);
               break;
            case 2:
               exibirInformacoes(tablet);
               break;
            case 3:
               exibirInformacoes(laptop);
               break;
            case 4:
               exibirInformacoes(camiseta);
               break;
            case 5:
               exibirInformacoes(calcasJeans);
               break;
            case 6:
               exibirInformacoes(vestido);
               break;
            case 0:
               System.out.println("Saindo do sistema. Até logo!");
               System.exit(0);
               break;
            default:
               System.out.println("Opção inválida. Tente novamente.");
         }
      }
   }

   private static void exibirInformacoes(Produto produto) {
      System.out.println("==== INFORMAÇÕES DO PRODUTO ====");
      System.out.println("Nome: " + produto.getNome());
      System.out.println("Preço: $" + produto.getPreco());
      System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
      System.out.println("Custo de Envio: $" + produto.calcularCustoEnvio());

      switch (produto.getClass().getSimpleName()) {
         case "Eletronico":
            Eletronico eletronico = (Eletronico) produto;
            System.out.println("Voltagem: " + eletronico.getVoltagem());
            break;
         case "Roupa":
            Roupa roupa = (Roupa) produto;
            System.out.println("Tamanho: " + roupa.getTamanho());
            break;
      }

      System.out.println("=============================");
   }
}