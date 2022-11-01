package PacoteP;

public class ConsultaEstoque {

    private String nome;
    private String vendedor;

    ConsultaEstoque(String nome, String vendedor){
        this.nome = nome;
        this.vendedor = vendedor;
    };

    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getVendedor(){
        return vendedor;
    }
    public void setVendedor(String novoVendedor){
        this.vendedor = novoVendedor;
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