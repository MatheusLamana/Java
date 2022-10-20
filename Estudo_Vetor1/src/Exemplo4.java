import javax.swing.JOptionPane;
public class Exemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double notas[]=new double[5];
        String aux;
        
        for (int i=0;i<5;i++){
            aux = JOptionPane.showInputDialog("Digite um numero: ");
            notas[i] = Double.parseDouble(aux);
    }
    String resposta = "Mostrando os valores digitados";
    
    for(int i=4;i>=0;i--){
        resposta += "\nValor = " + notas[i];
}
    JOptionPane.showMessageDialog(null, resposta);
    }
}
