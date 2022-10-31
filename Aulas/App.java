public class App {
    public static void main(String[] args) {

        //Aqui estamos acessando as propriedades de um objeto
        //Como um controle remoto e suas funções

        Alunos aluno1;
        aluno1 = new Alunos("Kayky Nunes","222222",2003);

        Alunos aluno2;
        aluno2 = new Alunos("Kayky Andrade","111111",2004);

        System.out.println(aluno1.nome + "\n" + aluno1.rgm + "\n" + aluno1.anoNasc + "\n" + aluno1.calculaIdade());
        System.out.println("\n");
        System.out.println(aluno2.nome + "\n" + aluno2.rgm + "\n" + aluno2.anoNasc + "\n" + aluno2.calculaIdade());
    }
}
