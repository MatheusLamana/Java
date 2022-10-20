import javax.swing.JOptionPane;

public class Exemplo2 {

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Exemplo 2");
    
    double nota1, nota2, media;
    
    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
    media = (nota1+nota2)/2;
    
    if (media >= 6.0){
        JOptionPane.showMessageDialog(null, "O aluno está APROVADO !");
    }
    else
       if(media >= 2.0){
       JOptionPane.showMessageDialog(null,
               "O aluno está reprovado, mas tem direito de exame !");
    }
       else{
           JOptionPane.showMessageDialog(null,
                   "O Aluno está reprovado !");
       }
    }
}
