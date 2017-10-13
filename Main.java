package codigos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList <ObjetoGeometrico> obj = new ArrayList<>();
        
        double raio;
        String cor;
        boolean preenchido;
        int aux;
        double lado;
        double altura;
        while(true) {
            String op =JOptionPane.showInputDialog(null, "Digite a opção desejada:" 
                    + "\n1 - Cadastrar círculo" 
                    + "\n2 - Cadastrar retangulo"
                    + "\n3 - Exibir todos os objetos" 
                    + "\nDigite outro numero/letra para sair");
            
            switch(op) {
                case "1":
                    try {
                        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));
                    }catch(NumberFormatException ex) {
                        System.out.println("ERRO");
                        raio = 2;
                    }
                    cor = JOptionPane.showInputDialog("Digite a cor do círculo");
                    aux = JOptionPane.showConfirmDialog(null, "O círculo está preenchido?");
                    if(aux == 0)
                        preenchido = true;
                    else
                        preenchido = false;
                    obj.add(new Circulo(raio, cor, preenchido));
                    break;
                case "2":
                    cor = JOptionPane.showInputDialog("Digite a cor do retângulo: ");
                    aux = JOptionPane.showConfirmDialog(null, "O retângulo está preenchido?");
                    if(aux == 0)
                        preenchido = true;
                    else
                        preenchido = false;
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da base (apenas números e pontos): "));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da altura(apenas números e pontos"));
                    obj.add(new Retangulo(lado, altura, cor, preenchido));
                    break;
                case "3":
                    for(aux = 0; aux < obj.size(); aux++) {
                        JOptionPane.showMessageDialog(null, obj.get(aux).toString());
                    }
                    break;
                default:
                    return;
            }
        }
    }
}
