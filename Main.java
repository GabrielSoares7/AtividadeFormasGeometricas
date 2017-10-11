package codigos;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        try {
            double raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do circulo"));
        }
        catch(NumberFormatException ex) {
            System.out.println("ERRO\n" + ex.getMessage());
        }
        
        String cor = JOptionPane.showInputDialog("Digite a cor do circulo");
        int preenchido = JOptionPane.showConfirmDialog(null, "O polígono está preenchido");
        
        if(preenchido == 0) 
            Circulo c = new Circulo(raio, cor, true);
        else
            Circulo c = new Circulo(raio, cor, false);
        
    }
    
}
