import javax.swing.JOptionPane;

public class Exemplo3 {


    public static void main(String[] args) {
        
        String mensagem = "Números Digitados";
        int soma = 0;
        int qtde = 0;
        
        for(int i=0; i<5; i++){
            
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
            
            mensagem += "\nNumero = " + numero;
            soma += numero;
            qtde += 1;
        }
    
            mensagem += "\n";
            mensagem += "\nTotais";
            mensagem += "\nA soma dos numeros digitados foi de " + soma;
            mensagem += "\nForam digitados " + qtde + " numero";
            
            JOptionPane.showMessageDialog(null, mensagem);
    }     
    
    
}
