import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome amigo(a)?");
        String nome = entrada.nextLine();

        System.out.println("Quantos exercicios entregou? (max 4)");
        double qtd = entrada.nextDouble();

        System.out.println("A quantidade de exercicios entregues de " + nome + " é " + qtd);

        System.out.println("Qual sua nota parcial? (max 3)");
        double notap = entrada.nextDouble();

        System.out.println("Qual sua nota regimental? (max 5)");
        double notar = entrada.nextDouble();

//notar até 5pts; notap até 3pts e trabvalho até 2pts

        double notaFinal = 0.5 * qtd + notap + notar;

        System.out.println("PARABÉNSSSSSSSSSSSSSSSSSSSSSSSSS"+ nome +"\nNota final de " + nome + " é de " + notaFinal);

        if(notaFinal >= 6){
        System.out.println("A nota de " + nome + " é de " + notaFinal);
        } else if(qtd > 4 || qtd < 0){
            System.out.println("Que que isso amigão?\nTem parada errada ai irmã(o)!");
        } else if(notap > 3 || qtd < 0){
            System.out.println("Malandro é o pato que nasceu com os pés grudados, para não usar aliança");
        } else if(notar > 5 || qtd < 0){
            System.out.println("Malandro é o professor que chegou e te reprovou");
        }
         else  {
            System.out.println("Não foi dessa vez " + nome + "\nSua nota foi de " + notaFinal);
        }
    }
}