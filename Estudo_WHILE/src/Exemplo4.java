import javax.swing.JOptionPane;
public class Exemplo4 {

    
    public static void main(String[] args) {
        
        int qtde =0;
        double numero;
        
        do{
            numero = Double.parseDouble (JOptionPane.showInputDialog(
            "Digite um numero qualquer ou " + "\nDigite ZERO para sair"));
            
            qtde ++;
      }while (numero != 0);
        
        JOptionPane.showMessageDialog(null, "Voce digitou " + qtde + " numeros");
    
  }
 }
