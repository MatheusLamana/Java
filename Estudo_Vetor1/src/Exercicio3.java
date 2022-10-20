import javax.swing.JOptionPane;
public class Exercicio3 {

    public static void main(String[] args) {
        
        double [] vet1 = new double [5];
        double [] vet2 = new double [5];
        double soma1, soma2, media;
        
        //recebendo o vetor1
        for(int i = 0; i < 5; i++){
            vet1[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para o vetor 1:"));
        }
        
        //recebendo o vetor2
        for(int i=0; i <5; i++){
            vet2[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para o vetor 2:"));
        }
        
        //processando
        soma1=0;
        soma2=0;
        for(int i=0; i<5; i++){
            soma1 = soma1 +vet1[i];
            soma2 = soma2 +vet2[i];
        }
        
        media = (soma1 + soma2)/2;
        
        JOptionPane.showMessageDialog(null,"A soma dos numeros do vetor 1 é de " + soma1 +
                "\nA soma dos numeros do vetor 2 é de " + soma2+
                "\nA média das somas foi de " + media);
    }
    
    
}
