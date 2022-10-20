import javax.swing.JOptionPane;
public class Aula5 {

   
    public static void main(String[] args) {
        
        String menu = "*** Escolha as opções disponíveis ***"
                + "\n1 - Exemplo 1"
                + "\n2 - Exemplo 2"
                + "\n3 - Exemplo 3"
                + "\n4 - Exemplo 4"
                + "\n"
                + "\n0 - Para sair";
        int opcao;
        
        do
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
           switch (opcao)
         {
        case 1:
            Exemplo1.main(args);
            break;
        case 2:
            Exemplo2.main(args);
            break;
        case 3:
            Exemplo3.main(args);
            break;
        case 4:
            Exemplo4.main(args);
            break;
       
           }
        
        }while (opcao != 0);
        
        System.out.printf("ERRO SYSTEM");
    }
    
}
