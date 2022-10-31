package pacoteC;

import javax.swing.JOptionPane;

import pacoteC.Vendedor;

public class App {
    public static void main(String[] args) throws Exception{
        Vendedor vendedor1 = new Vendedor("Kayky", 10, 5000.00, 0);

        vendedor1.setNome("Kaykote");
        vendedor1.setFalta(5);
        vendedor1.setSalario(7000.00);
        vendedor1.setVendas(1500);

        vendedor1.imprimeDados();

        vendedor1.calcularComissao();
        vendedor1.descontoFalta();
        vendedor1.calculaSalario();

        JOptionPane.showMessageDialog(null, vendedor1.getRefrigerante());
    }
}

/*

Nome: Kayky Hyan Nunes
RGM: 29610800
Campus Paulista

 */