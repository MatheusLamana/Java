import javax.swing.JOptionPane;

public class Exemplo1 {


    public static void main(String[] args) {
       
        double salario = 1000;
        
        
        while (salario>0){
            salario -= 250;
            JOptionPane.showMessageDialog(null, "Vou gastar 250,00 e vai sobrar "
            + salario);
        }
    }
    
}
