import javax.swing.JOptionPane;
public class Exercicio7 {

    
    public static void main(String[] args) {
       int numero;
       int maior =0;
       String mensagem = "Numero DIgitados: ";
      
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
       maior = numero;
       
       for(int i=0; i<9; i++){
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
           mensagem += "\nNumero = " + numero;
           if (numero > maior)
           {
               maior = numero;
           }
       }
              
             mensagem += "\n";
             mensagem += "\nO maior numero digitado foi " + maior;
             
             JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
