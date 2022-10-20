import javax.swing.JOptionPane;
public class Exercicio5 {

    
    public static void main(String[] args) {
        
        double[]temperaturas = new double [12];
        String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho",
            "Agosto", "Setembro", "Outubro", "Novembro","Dezembro"};
        //recebendo o valor
        
        for (int i=0; i<12; i++)
        {
            temperaturas[i]=Double.parseDouble(
            JOptionPane.showInputDialog("Digite uma temperatura do mes "+ meses[i] + ":"));
            
        }
        
        double maior = temperaturas [0];
        int indiceMes = 0;
        
        for(int i=0; i<12; i++)
        {
            if(temperaturas[i]>maior){
                maior =temperaturas[i];
                indiceMes = i;
            }
        }
        
          JOptionPane.showMessageDialog(null, "A maior temperatura foi de " + maior + "\nO mes de maior temperatura foi em "
                   + meses[indiceMes]);
        }
       
    }

    


