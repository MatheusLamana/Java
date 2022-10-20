import javax.swing.JOptionPane;
public class Exemplo2 {

    public static void main(String[] args) {
     
        String mensagem;
        mensagem = "Valores para o contador i com incremento de 1";
        
        for(int i=1; i<=10; i++){
            
            mensagem = mensagem + "\nValor de i=" +i;
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
        mensagem = "Valores para o contador i com incremento de 2";
        
        for(int i = 1; i<10; i=i+2){
            mensagem=mensagem + "\nValor de i=" +i;
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
        mensagem = "Valores para o contador i com incremento de -1";
        
        for(int i = 10; i>0; i--){
            mensagem = mensagem + "\nValor de i=" +i;
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
