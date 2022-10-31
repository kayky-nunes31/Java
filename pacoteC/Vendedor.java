package pacoteC;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Vendedor {

        private String nome;
        private int falta;
        private double salario;
        private double vendas;
    
        Vendedor(String nome, int falta, double salario, double vendas){
            this.nome = nome;
            this.falta = falta;
            this.salario = salario;
            this.vendas = vendas;
    };

    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public int getFalta(){
        return falta;
    }
    public void setFalta(int novoFalta){
        this.falta = novoFalta;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }

    public double getVendas(){
        return vendas;
    }
    public void setVendas(double novoVendas){
        this.vendas = novoVendas;
    }

    double conta;
    void calcularComissao(){
        if(vendas >= 1000 && vendas < 2000){
            conta = vendas * 0.10;
            JOptionPane.showMessageDialog(null, "Bônus: " + Math.round(conta));
        }
        else if(vendas >= 2000){
            conta = vendas * 0.15;
            JOptionPane.showMessageDialog(null, "Bônus: " + Math.round(conta));
        }
        else{
            System.out.println("Não vendeu nada!!!");
        }
    }

    double desconto;
    void descontoFalta(){
        desconto = (salario/30) * falta;
        JOptionPane.showMessageDialog(null, "Desconto das Faltas: " + Math.round(desconto));
    }

    void calculaSalario(){
        salario = (salario + conta - desconto);
        JOptionPane.showMessageDialog(null, "Salário: " + Math.round(salario));
    }

    void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\nFalta: " + this.falta + "\nSalário: " + this.salario + "\nVendas: " + this.vendas);
    };
}

/*

Nome: Kayky Hyan Nunes
RGM: 29610800
Campus Paulista

 */