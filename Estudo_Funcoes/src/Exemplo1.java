import javax.swing.JOptionPane;

public class Exemplo1 {
            public static void main(String[] args)
            {
              
                double soma, media, n1 ,n2;
                //tudo isso pra mostrar uma caixa de dialog
                //n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
                //n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro  numero"));
                n1 = Funcoes.lerNumeroReal(); //chamando a funcao criada na biblioteca
                n2 = Funcoes.lerNumeroReal();
                
                //fazendo a chamada da função
                soma = somarNumeros (n1, n2);
                //JOptionPane.showMessageDialog(null, "A soma é: " + soma);
                Funcoes.exibeMensagem("A soma é: " +soma);
                
                media = calcularMedia(soma, 2);
               // JOptionPane.showMessageDialog(null,"A  media é: " + media);
               Funcoes.exibeMensagem("A media é: " +media);
            }
            
            //nao pode declarar (double numero1, numero2) tenho que sempre colocar double no caso.
            public static double somarNumeros ( double numero1, double numero2)
            {
            
                double soma = numero1 + numero2;
                return soma;
            }
            
            public static double calcularMedia(double soma, int quantidade)
            {
              return soma / quantidade;
              
            }
}
