import javax.swing.JOptionPane;

public class Exemplo3 {

    
    public static void main(String[] args) {
       String conceito;
       conceito = JOptionPane.showInputDialog("Digite o conceito");
       
       if ( (conceito.equals ("MB")) || (conceito.equals("B")) || (conceito.equals("R"))){
           
           JOptionPane.showMessageDialog(null, "O aluno esta aprovado");
       }
       else 
           if (conceito.equals("I")){
               JOptionPane.showMessageDialog(null, "O aluno está reprovado");
           }
           else{
               JOptionPane.showMessageDialog(null, "Codigo Inválido");
           }  
    }
    
}
