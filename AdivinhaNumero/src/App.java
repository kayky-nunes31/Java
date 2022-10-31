import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception{

        Scanner entrada = new Scanner(System.in);
        double numeroAleatorio = Math.random() * 100;
        int numeroSorteado = (int)numeroAleatorio;
        int numeroEntrada = 0;

        int contador = 0;

//        System.out.print("------- Número Sorteado: " + numeroSorteado + " ------- " + "\n");

        do {
            System.out.print("Digite um número de 0 a 100: ");
            numeroEntrada = entrada.nextInt();
            contador++;

            if(numeroEntrada == numeroSorteado){
                System.out.println("Parabéns você acertou o número secreto " + numeroSorteado
                		+ "\nVocê acertou após "+ contador + " tentativas");
            }
            else if(numeroEntrada < 0 || numeroEntrada > 100) {
                System.out.println("O número de entrada é menor do que o número secreto");
            }
            else if(numeroEntrada > numeroSorteado) {
                System.out.println("Passou longe... Mas está próximo.");
            }
            else if(numeroEntrada < numeroSorteado) {
                System.out.println("Tá frio ai hein... Mas está próximo.");
            }
            else {
                System.out.println("Perdeu mané!");
            }
        } while(numeroSorteado != numeroEntrada);
        


        entrada.close();

    }
}

/*
Nome: Kayky Hyan Nunes
RGM: 29610800
Campus: Paulista - 2ºH

Bom dia, Boa tarde ou Boa noite professor!!!
Talvez eu tenha me empolgado e feito mais ELSE IF do que pediu no BB,
mas espero que tenha gostado do exercício.

 */