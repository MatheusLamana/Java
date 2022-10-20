
public class Exemplo2 {
  /* 
    Criar funcoes para:
    -carregar o vetor 
    -retornar o maior valor do vetor
    -exibir os valores de um vetor
    */
    
    public static void main(String[] args) {
        
        double []notas = Funcoes.carregaVetor(5);
        
        //primeiro passo e o carregar vetor for /carregarVetor(tamanho)
        Funcoes.exibeMensagem("O maior valor é: " +Funcoes.maior(notas));
        //agora eu preciso descobrir meu maior valor do vetor
        
    }
    
    
}
