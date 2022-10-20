import javax.swing.JOptionPane;

public class Exemplo1 {

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Exemplo 1");
    
    String nome;
    int idade;
    
    nome = JOptionPane.showInputDialog("Digite o nome");
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
    
    if(idade>=18){
        
        JOptionPane.showMessageDialog(null, "Olá " + nome + " Você já atingiu a maioridade!");
        
     }
    else{
        JOptionPane.showMessageDialog(null, "Olá " + nome + " Você ainda NÃO atingiu a maioridade !");
     }
    
    
    
    
    
  }    
}
