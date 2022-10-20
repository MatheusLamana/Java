
import javax.swing.JOptionPane;


public class Aula3 {

 
    public static void main(String[] args) {
        
    String menu = "*** Escolha as Opções do Menu ***"
            + "\n1 - Exemplo 1"
            + "\n2 - Exemplo 2"
            + "\n3 - Exemplo 3"
            + "\n4 - Exercício 1"
            + "\n5 - Exercício 2"
            + "\n6 - Exercício 3";
    
    int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
    
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
            Exercicio1.main(args);
            break;
        default:
            JOptionPane.showMessageDialog(null,"Opção inválida !");
    }
        
    }
    
}
