//vamos criar uma biblioteca de funcoes aqui, então 
import javax.swing.JOptionPane;

public class Funcoes 
{
        public static int lerNumeroInteiro ()
        {
            int numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
            
            return numero;
        }
         public static double lerNumeroReal ()
         {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero Real: "));
            return numero;
         }
         
         public static String lerTexto ()
         {
            return JOptionPane.showInputDialog("Digite um texto: ");
         }
         
         public static void exibeMensagem (String mensagem)  //essa funcao o void nao tem retorno
         {
             JOptionPane.showMessageDialog(null, mensagem);
         }
         public static double [] carregaVetor (int tamanho)
         {
             //declaracao e instanciacao do vetor
             double []vetor = new double [tamanho];
             //carregando o vetor
                 for (int i = 0; i < tamanho; i++){
                   vetor[i]= lerNumeroReal ();
                  }
                 //retornar o vetor da funcao
                 return vetor;
         }
         public static double maior(double vetor[])
         {
             double maior = vetor[0];
             int tamanho = vetor.length;
             
             for (int i = 0; i < tamanho; i++) {
                 if (vetor [i] > maior )
                 {
                     maior = vetor[i];
                 }
             }
             return maior;
         }
         
}
