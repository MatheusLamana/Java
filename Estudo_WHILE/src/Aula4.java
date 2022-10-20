import javax.swing.JOptionPane;
public class Aula4 {

    
    public static void main(String[] args) {
   String menu = "Opções de Menu:"
                + "\n1 - Exemplo 1 - WHILE"
                + "\n2 - Exemplo 2 - WHILE"
                + "\n3 - Exemplo 3 - WHILE"
                + "\n4 - Exemplo 4 - DO WHILE"
                + "\n5 - Exercício 1 - WHILE"
                + "\nDigite o codigo desejado";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
       switch(opcao){
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
           case 5:
               Exercicio1.main(args);
               break;
           default:
               JOptionPane.showMessageDialog(null, "Opção Inválida !");
       }
    }
}
