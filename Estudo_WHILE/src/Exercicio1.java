import javax.swing.JOptionPane;
public class Exercicio1 {

   
    public static void main(String[] args) {
   
          int qtdvendas =0;
         int cod;
         String msg = "Escolha as opcoes seguintes:"
                 + "\n1 - Coca cola - R$ 2.99"
                 + "\n2 - Fanta - R$ 2.19"
                 + "\n3 - Cerveja - R$ 0.99"
                 + "\n0 - Para encerrar a entrada de dados"
                 + "\n\n - Digite o codigo do produto";
         
         String produto = "";
         double preco=0, total=0, totalgeral=0;
        
     do
     {
        cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde: "));
        
         if(cod == 1){
            produto = "Coca-Cola";
            preco = 2.99;
            total = qtde * preco;
            totalgeral += total;
         }
         else
             if(cod == 2){
              produto = "Fanta";
            preco = 2.19;
            total = qtde * preco;
            totalgeral += total;
             }
             else 
              if(cod == 3){        
              produto = "Cerveja";
            preco = 0.99;
            total = qtde * preco;
            totalgeral += total;
          }
           else 
              if(cod == 0){        
             
          }
              else{
                  JOptionPane.showMessageDialog(null, "Código Invalido !");
              }
     
     }while (cod != 0);
          JOptionPane.showMessageDialog(null, "O valor total da compra foi de " +totalgeral);
    
       }
    }
    

