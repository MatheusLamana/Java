import javax.swing.JOptionPane;
public class Aula6 {

    public static void main(String[] args) {
  
               int opcao  =  1;
       
               while ( opcao != 0)
               {
                   opcao = mostraMenu();
                   
                        if ( opcao == 1)
                        {
                            Exemplo1.main(args);
                            
                        }else 
                            if ( opcao == 2)
                        {
                            Exemplo2.main(args);
                        }
               }
    }
    
    public static int mostraMenu()
    {
        String menu = " *** Menu de opções ***"
                    + "\n1- Exemplo 1"
                    + "\n2- Exemplo 2";
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return numero;   
    }
    
     
}
