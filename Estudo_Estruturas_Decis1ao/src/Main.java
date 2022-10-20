import javax.swing.JOptionPane;
public class Main {

  
    public static void main(String[] args) {
      
        String menu = "Opções de Menu:"
                + "\n1 - Exemplo 1"
                + "\n2 - Exemplo 2"
                + "\n3 - Exemplo 3"
                + "\n5 - Exercício 1"
                + "\n6 - Exercício 2"
                + "\n7 - Exercício 3"
                +"\n Digite o codigo desejado";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        if (opcao == 1)
        {
            Exemplo1.main(args);
        }
        else
            if (opcao == 2)
            {
                Exemplo2.main(args);
            }
        else
             if (opcao == 3)
             {
                 Exemplo3.main(args);
             }
    }
    
}
