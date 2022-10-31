public class Alunos {

    String nome;
    String rgm;
    int anoNasc;

    Alunos(String nomeEntrada, String rgmEntrada, int anoNascEntrada) {
        this.nome = nomeEntrada;
        this.rgm = rgmEntrada;
        this.anoNasc = anoNascEntrada;
    };

    //Criando uma função que calcula idade nas linhas abaixo

    int calculaIdade() {
        int anoAtual = 2022;
        int idade = anoAtual - anoNasc;
        return idade;
    };

}
