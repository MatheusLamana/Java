import javax.swing.JOptionPane;
public class Exemplo3 {

    
    public static void main(String[] args) {
       
        double notas[]=new double [10];
        double soma =0, media;
        String aux;
        
        for (int i=0;i<10;i++){
            notas[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
            
        }
        
        for (int i=0;i<10;i++){
            soma = soma +notas [i];
        }
        media = soma / 10.0;
        
        JOptionPane.showMessageDialog(null, "Soma = " + soma);
        JOptionPane.showMessageDialog(null, "Media = " + media);
        
    }
}
    

