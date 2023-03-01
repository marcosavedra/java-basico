package main;

import java.io.File;
import java.util.Scanner;
import venda.Venda;

class Main {

    public static void main (String[] args){
        Venda venda_ = new Venda();
        Scanner scan = new Scanner(System.in);

        //Venda de produtos
        System.out.println("Deseja adicionar um produto? 1 \"sim\", 2 \"não\"");

        // Variavel para adicionar um produto a compra 
        int adicionar_produto;
        adicionar_produto = scan.nextInt();

        // Condicional que permmite se o cliente vai adicionar o produto ao carrinho 
        if (adicionar_produto ==1){

            while (adicionar_produto == 1){
                System.out.println("Digite o codigo do produto: ");
                
                // Variavel que permite adicionar o codigo do produto a ser vendido
                int codigo_produto;
                codigo_produto = scan.nextInt();

                // Produtos cadastrados com switch case
                double valorProduto;
                switch(codigo_produto){
                    case 001: System.out.println("PRODUTO 1 \n VALOR: " + (valorProduto = 1.00)); break;
                    case 002: System.out.println("PRODUTO 2 \n VALOR: " + (valorProduto = 1.00)); break;
                    case 003: System.out.println("PRODUTO 3 \n VALOR: " + (valorProduto = 1.00)); break;
                    case 004: System.out.println("PRODUTO 4 \n VALOR: " + (valorProduto = 1.00)); break;
                    case 005: System.out.println("PRODUTO 5 \n VALOR: " + (valorProduto = 1.00)); break;
                    case 006: System.out.println("PRODUTO 6 \n VALOR: " + (valorProduto = 1.00)); break;
                    case 007: System.out.println("PRODUTO 7 \n VALOR: " + (valorProduto = 1.00)); break;
                    default: System.out.println("Codigo invalido!!!");
                }

                System.out.println("Deseja adicionar um novo produto? 1 \"sim\" 2, \"não\"");
                // Variavel para adicionar um produto a compra 
                adicionar_produto = scan.nextInt();
            }

        } 
        // Se o adicionar_produto for igual a 2, encerra a adição de produtos no carrinho  
        else if (adicionar_produto == 2) {

        } 
        // se outro valor diferente de 1 e 2 for adiionado, dar um alertar de erro e pedir para escolher o comando certo
        else {
            System.out.println("Erro");
        }
    }
}