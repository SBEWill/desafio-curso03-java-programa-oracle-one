package Main;

import Models.Cartao;
import Models.Compras;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite a ser gasto");
        Cartao cartao = new Cartao(scanner.nextDouble());
        scanner.nextLine();
        int opcao = 1;
        List<Compras> listaDeCompras = new ArrayList<>();
        while (opcao != 0) {

            if (opcao == 1) {

                System.out.println("Qual produto deseja comprar?");
                String produto = scanner.nextLine();

                System.out.println("Qual o valor do produto? ");
                double valor = scanner.nextDouble();

                scanner.nextLine();

                Compras compra = new Compras();
                compra.setProduto(produto);
                compra.setValor(valor);

                if (cartao.debitar(valor)) {
                    listaDeCompras.add(compra);
                    System.out.println("Compra realizada! Limite restante: " + cartao.getLimite());
                } else {
                    System.out.println("Saldo insuficiente. Encerrando o programa.");
                    break;
                }

                System.out.println("Digite 1 para continuar ou digite 0 para sair");
                opcao = scanner.nextInt();
                scanner.nextLine();

            } else if (opcao != 0 && opcao != 1) {
                System.out.println("Digite uma opção válida");
                opcao = scanner.nextInt();
                scanner.nextLine();
            }
        }


        listaDeCompras.sort(Comparator.comparing(Compras::getValor));

        for (Compras compras : listaDeCompras) {
            System.out.println(compras);
        }

        double valorTotal = 0;

        for (Compras compras : listaDeCompras) {

            valorTotal += compras.getValor();

        }
            System.out.println("Valor total das compras: R$" + valorTotal);

            scanner.close();




    }
}

