import javax.swing.JOptionPane;
public class Exercicio2 {

   
    public static void main(String[] args) {
       
        int [] vet1 = new int [5];
        int [] vet2 = new int [5];
        int [] vet3 = new int [5];
       
       //recebendo o vetor 1
       for(int i=0;i<5;i++){
           vet1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um numer para o vetor 1"));
       }
       
       //recebendo o vetor 2
       for(int i=0;i<5;i++){
           vet2[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o vetor 2"));
       }
       
       //processando
       for(int i=0;i<5;i++){
           vet3[i]=vet1[i]*vet2[i];
       }
        
       //exibindo o resultado
        for(int i=0;i<5;i++){
           JOptionPane.showMessageDialog(null, vet3[i]);
      }
    }
    
}
