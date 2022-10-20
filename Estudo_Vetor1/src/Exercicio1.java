import javax.swing.JOptionPane;
public class Exercicio1 {

   
    public static void main(String[] args) {
        
        int vet1[]=new int [5];
        int vet2[]=new int [5];
       
       
     
        
        for(int i=0;i<5;i++){
              vet1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        }
        //processo
        for(int i=0;i<5;i++){
            vet2[i]=vet1[i]*2;
        }
        //exibindo
        String resposta = "Mostrando os valores";
        for(int i=0;i<5;i++){
            resposta += "\n" +vet1[i] + vet2[i];
        }
        JOptionPane.showMessageDialog(null, resposta);
    }
    
}
