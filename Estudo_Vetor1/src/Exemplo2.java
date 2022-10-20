import javax.swing.JOptionPane;
public class Exemplo2 {

   
    public static void main(String[] args) {
       
        
        double notas[]=new double [3];
        double soma =0, media;
        
        notas [0] = 10;
        notas [1] = 2;
        notas [2] = 4;
        
        for(int i=0;i<3;i++){
            soma = soma + notas [i];
        }
        
        media = soma / 3;
        
        JOptionPane.showMessageDialog(null, "Soma = " + soma);
        JOptionPane.showMessageDialog(null, "Media = " + media);
    }
    
}
