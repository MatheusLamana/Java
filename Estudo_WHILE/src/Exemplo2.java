import javax.swing.JOptionPane;
public class Exemplo2 {

   
    public static void main(String[] args) {
        
        double salario = 1000;
        
        while (salario > 0){
            double saque = Double.parseDouble(JOptionPane.showInputDialog(
            "Seu saldo é de " + salario + ". Quanto deseja sacar"));
            
            salario -= saque;
        }
        
        JOptionPane.showMessageDialog(null, "Seu saldo final é de " + salario);
    }
    
}
