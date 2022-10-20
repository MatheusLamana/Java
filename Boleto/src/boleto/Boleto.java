package boleto;
import javax.swing.JOptionPane;
public class Boleto {

    public static void main(String[] args) {
       double valor[] = new double [5];
       double total[] = new double [5];
       double soma=0, dia=0, media=0;
       int dias [] = new int [5];
      
       
        for (int i = 0; i < 5; i++) {
            valor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: "));
            dias[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias: "));
            total[i] = valorPagamento(valor[i], dias[i]);
            
            soma += total[i];
            dia += dias[i];
        }
    
        for (int i = 0; i < 5; i++) {
            String msg = "Recebimento nº " + i + "\n"+
                    "\nValor da Prestação: " + valor [i] +
                    "\nTempo de atraso: " + dias[i] + " Dias" +
                    "\nValor Pagamento: " + total[i];
            exibeMensagem(msg);
        }
        media = dia/5;
        
        String msg = "**** Totais ****"
                + "\nO valor de pagamentos recebidos foi de, " + soma
                + "\nO tempo médio de atrasos foi de, " + media + " Dias";
        exibeMensagem(msg);
    }
    public static double valorPagamento(double valor, int dias)
    {
       double valorTotal;
       double multa =0 ;
       double diaMulta;
       if (dias > 0){
           multa = valor * 0.03;
           diaMulta = valor * 0.01 * dias;
       } 
       valorTotal = valor + multa + dias;
       return valorTotal;
    }
     public static void exibeMensagem(String mensagem) //essa funcao o void nao tem retorno
    {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}


