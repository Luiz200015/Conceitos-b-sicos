package exercicio10;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        carrinho carrinho = new carrinho();

                System.out.println("Carrinho aberto! Vamos gastar  \n" +
                        "Digite <add> para adicionar item " +
                        "<remove> para remover item " +
                        "<desconto> para aplicar desconto e " +
                        "<imprimir> para imprimir no carrinho e " +
                        "sair para finalizar compra.");

        while (true){
                switch (sc.nextLine()){
                        case "add":
                                System.out.println("Digite preço do item a ser adicionado: ");
                                double preco = sc.nextDouble();
                                sc.nextLine();
                                carrinho.adicionarItem(preco);
                                break;
                        case "remove":
                                System.out.println("Digite a quantidade que deseja retirar: " + carrinho.getQuantidade());
                                break;
                        case "desconto":
                                break;
                        case "imprimir":
                                System.out.println("Quantidade de itens: " + carrinho.getQuantidade());
                                System.out.println("Valor total: " + carrinho.getValorTotal());
                                break;
                        case "sair":
                                return;
                        default:
                                System.out.println("Comando inválido. Tente novamente.");

                        }
                }
        }
}
