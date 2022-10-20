import javax.swing.JOptionPane;
public class Exemplo3 {

   //nesse projeto enquanto eu nao digitar o 0 ele nao sai do laço de repetiçao
    public static void main(String[] args) {
        
        int qtde =0;
        double numero =1;
        
        while( numero != 0){
            
            numero = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite um numero qualquer ou" + "\nDigite Zero para sair"));
        
            qtde ++;
    }
        
        JOptionPane.showMessageDialog(null, "Voce Digitou " + qtde + " numeros");
    
}
}
