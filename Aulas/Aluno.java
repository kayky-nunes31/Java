import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Campos de digitação dos nomes dos alunos abaixo:

        System.out.println("Digite o nome do aluno 1:");
        String aluno1 = entrada.nextLine();

        System.out.println("Digite o nome do aluno 2:");
        String aluno2 = entrada.nextLine();

        System.out.println("Digite o nome do aluno 3:");
        String aluno3 = entrada.nextLine();

        //-------------------------FIM----------------------------

        // Campos de digitação dos RGMs dos alunos abaixo:

        System.out.println("Digite o RGM do aluno 1:");
        String rgm1 = entrada.nextLine();

        System.out.println("Digite o RGM do aluno 2:");
        String rgm2 = entrada.nextLine();

        System.out.println("Digite o RGM do aluno 3:");
        String rgm3 = entrada.nextLine();

        //-------------------------FIM----------------------------

        // Campos de digitação das datas de nascimento dos alunos abaixo:

        System.out.println("Digite o ano de nascimento aluno 1:");
        int ano1 = entrada.nextInt();

        System.out.println("Digite o ano de nascimento aluno 2:");
        int ano2 = entrada.nextInt();

        System.out.println("Digite o ano de nascimento aluno 3:");
        int ano3 = entrada.nextInt();

        //-------------------------FIM----------------------------

        // Aqui estão as saídas dos dados dos alunos:

        System.out.print("O nome do aluno 1 é: "+ aluno1 +"\nRgm do aluno 1 é: " + rgm1 + "\nA data de nascimento do aluno 1 é: " + ano1 + "\n\n");
        System.out.print("O nome do aluno 2 é: "+ aluno2 +"\nRgm do aluno 2 é: " + rgm2 + "\nA data de nascimento do aluno 2 é: " + ano2 + "\n\n");
        System.out.print("O nome do aluno 3 é: "+ aluno3 +"\nRgm do aluno 3 é: " + rgm3 + "\nA data de nascimento do aluno 3 é: " + ano3);
    }
}
