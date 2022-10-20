import javax.swing.JOptionPane;
public class Exercicio4 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int []vetor = new int [5];
       
        
        //recebendo o vetor
      for(int i=0;i<5;i++){
       vetor[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
      }
        //processando
        for(int i=0;i<5;i++){
            vetor[i]=vetor[i]*2;
        }
        
        //exibindo
        for(int i=0;i<5;i++){
            JOptionPane.showMessageDialog(null, vetor[i]);
        }
        
    
    }
    
}
