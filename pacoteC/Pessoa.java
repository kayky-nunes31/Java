package pacoteC;

import javax.swing.JOptionPane;

public class Pessoa {

        private String nome;
        private int idade;
        private double renda;
    
        Pessoa(String nome, int idade, double renda){
            this.nome = nome;
            this.idade = idade;
            this.renda = renda;
        };

        public String getNome(){
            return nome;
        }
        public void setNome(String novoNome){
            this.nome = novoNome;
        }

        public int getIdade(){
            return idade;
        }
        public void setIdade(int novoIdade){
            this.idade = novoIdade;
        }

        public double getRenda(){
            return renda;
        }
        public void setRenda(double novoRenda){
            this.renda = novoRenda;
        }
    
        //Criando uma função que calcula idade nas linhas abaixo
        
        void imprimeDados(){
            JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\nIdade: " + this.idade + "\nRenda: " + this.renda);
        };
         
    
    
}