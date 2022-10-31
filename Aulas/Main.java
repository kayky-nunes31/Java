import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual seu RGM?");
        String rgm = entrada.nextLine();

        System.out.println("Qual seu ano de nascimento?");
        int ano = entrada.nextInt();

        System.out.println("Seu nome é: "+ nome +"\n Seu rgm é: " + rgm + "\n Sua data de nascimento é: " + ano);
    }
}
