import javax.swing.JOptionPane;
public class Exemplo1 {

    
    public static void main(String[] args) {
       
        
        double notas[]=new double [3];
        double soma, media;
        
        notas [0] = 10;
        notas [1] = 2;
        notas [2] = 4;
        
        soma = notas [0] + notas [1] + notas [2];
        media = soma / 3;
        
        JOptionPane.showMessageDialog(null, "Soma = " + soma);
        JOptionPane.showMessageDialog(null, "Media = " + media);
        JOptionPane.showMessageDialog(null, +media);
    }
    
}
