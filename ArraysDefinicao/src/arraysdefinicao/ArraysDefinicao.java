
package arraysdefinicao;


public class ArraysDefinicao {
           public static void main(String[] args) {
      
               //[ ] - são inseridos em uma variável que referecia um array
               int [] a = new int [5]; 
               //Outra maneira de fazer declaração de um array
               int [] b;
               b = new int[5];
               //Declarando vários arrays
               int [] r = new int [44], k = new int [23], c=new int [23];
               
               //{ } - Iniciar valores em um array sua declaração
               int [ ] inciaValores = {1, 2, 3, 4, 45,34, 0, 123};

               //declara um     array de inteiros
               int [] meuArray;
               
               //Aloca na memória para 10 inteiros
               meuArray = new int [10];
               
               //Inicializa o primeiro elemento
               meuArray [0] = 100;
               meuArray [1] =  85;
               meuArray [2] = 83;
               meuArray [3] = 123;
               meuArray [4] = 15;
               meuArray [5] = 1233;
               meuArray [6] = 33;
               meuArray [7] = 31;
               meuArray [8] = 30;
               meuArray [9] = 13;
               
               //Meu array  [10] =  564;  // Estoura  a pilha pois, array se inicia em 0 ... ou seja o numero 10, seria 9.
                System.out.println(meuArray[1]);
                System.out.println(meuArray[5]);
                
                
                
                
                /*Descobrindo o tamanho de um array

                Por padrão, cada array sabe seu próprio tamanho, independente de quantos valores forem inseridos. 
                O array armazena na variável de instância o método length, 
                que retorna o tamanho do array especificado, */
              
                //DESCOBRINDO O TAMANDO DE UM ARRAY
                int []  arrayUm  =  {12, 3, 4, 5, 123, 654, 1021,98};
                int [] arrayDois =  {32, 33, 34, 01};
                
                if(arrayDois.length > 8 ){
                    System.out.println("Tamanho do ArrayDois é Maior que 8 ! " + arrayDois.length);
                }else{
                    System.out.println("Tamanho do Array Dois é Menor que 8 !" + arrayDois.length);
                }
                System.out.println("\nTamanho do arrayUm =  " + arrayUm.length);
                System.out.println();                
                System.out.println("-----------------------------------------");
               
                                      
                //Iniciando um array
                 //Array com 10 elementos;
                 int [] arrayBase;
                 arrayBase  = new int [20];
                 System.out.printf(" %s   %10s    \n",    "Index",      "Valores");
               //Gera a saída do valor de cada elemento do array
               for(int i = 0; i < arrayBase.length; i++){
                   System.out.printf(" %3d    %10d  \n ", i , arrayBase[i]);
                }
   
                      
               
                   //Inciando array com valores
                     //Lista de valores
                     int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
                     System.out.printf(" %s   %12s   \n ", "Index", "Valores");
                     //Percorre cada elemento e imprime o indice com o valor
                     for(int counter = 0; counter < array.length; counter ++){
                         System.out.printf("%5d    %4s    %4d   \n ", counter, "--->" , array[ counter ]);
                     }
                      
                     
                     
                     
                     
                     
                     /*Percorrendo Arrays

A instrução for aprimorado, como é conhecida, serve para obter elementos de um array, 
sem a possibilidade de alterá-los. Se caso houver necessidade de modificar os elementos,
isso pode ser feito com a instrução for controlada por contador.
        Na sintaxe do for aprimorado é divida pelos seguintes parâmetros:
                     * O tipo com um identificador (parâmetro);
                    * O nome do array no qual serão feitas as iterações.*/
                     
                     // for ( parametro : nomedoArray)
                      //          instrução
                      
                      
                      //LIstagem 6
                      int [ ] arrayNum = {87,  68, 52 , 5, 49, 83,  45, 12, 64};
                      int total =0;
                      //adiciona  o valor de cada  elemento  ao total
                      for (int i : arrayNum){
                       total += 1;
                          System.out.printf("Total de elementos arrayNum: %d\n", total);
                      }
                  
             /*Na instrução for da Listagem 6, a variável arrayNum, passa os valores armazenados para a variável i,
                  fazendo com que o loop possa selecionar um valor a partir do array percorrido. */
           
                   }
                              
           }

