package PacoteP;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) throws Exception{
        ConsultaEstoque loja1 = new ConsultaEstoque("Loja", "Gerente");

        Scanner myObj = new Scanner(System.in);
    
		System.out.println("Digite o nome da Loja: ");
        String nomeLoja = myObj.nextLine();

        System.out.println("\nDigite o nome do Gerente: ");
        String nomeGerente = myObj.nextLine();

        System.out.println("\nDigite quantos produtos tem no estoque: ");
        int qtd_prod = myObj.nextInt();

        String produtos[] = new String[qtd_prod];
        int qtd_estoque[] = new int[qtd_prod];

        loja1.setNome(nomeLoja);
        loja1.setVendedor(nomeGerente);

        produtos[0] = myObj.nextLine();

        int i;
        for(i = 0; i < qtd_prod; i++) {
            System.out.println("\nDigite o nome do produto " + i + ": ");
            produtos[i] = myObj.nextLine();
        }
        
        for(i = 0; i < qtd_prod; i++) {
            System.out.println("\nDigite a quantidade de estoque do(a) " + produtos[i] + ": ");
            qtd_estoque[i] = myObj.nextInt();
        }

        System.out.println("Nome da loja: " + loja1.getNome());
        System.out.println("Nome do(a) gerente: " + loja1.getVendedor());

        for(i = 0; i < qtd_prod; i++) {
            System.out.println("O produto: " + produtos[i] +
                                    "\nTem a quantidade em estoque: " + qtd_estoque[i] + 
                                    "\n");
        }

            while(true){
            //System.out.println("Deseja comprar algum produto digite S/N: ");
            //String resp = myObj.nextLine();

            //if(resp == "S" || resp == "s"){
                System.out.println("Digite o número do produto: ");
                int x = myObj.nextInt();

                System.out.println("Quantas unidades deseja comprar? ");
                int unidades = myObj.nextInt();

                double conta = qtd_estoque[x] - unidades;

                System.out.println("A quantidade de " + produtos[x] + " é de: " + conta);

            }
            /*
            else{
            System.out.println("Fim");;
            }
            */    
    }
}


/*

Nomes:
Gabriel Murça - RGM: 29818737
Kayky Hyan Nunes - RGM: 29610800
Kayky Andrade - RGM: 
Matheus Freitas - RGM: 5529042577
Rodrigo - RGM: 5929072123

Análise e Desenvolvimento de Sistemas - ADS
Campus Paulista - Turma 2ºH

*/