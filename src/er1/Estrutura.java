/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package er1;

/**
 *
 * @author aleaguado
 */
class Estrutura  //Criamos aqui nossa classe EstruturaVetor
   { 
   private Jogador[] a;                 // cria a referência para um vetor do tipo Jogador
   private int nElems;               // nElems controla quantos elementos o vetor terá ...
   //-----------------------------------------------------------
   public Estrutura(int max)         // método construtor
      {
      a = new Jogador[max];                 // cria o vetor ...
      nElems = 0;                        // inicialmente sem itens ...
      }

  //--------------------------------------------------------------
 //Método que retorna quantidade de itens do vetor ....
//--------------------------------------------------------------
   public int size()
      { return nElems; }
   
   //--------------------------------------------------------------
  //Método para realizar busca linear por nome no vetor . . . 
 //--------------------------------------------------------------
   public void buscalinearnome(String nome)
   {
       boolean verificador = false;
       for(int i = 0; i < nElems - 1; i++)
       {
           if( a[i].getNome().compareTo(nome) == 0 )
           {
               a[i].displayJogador();
               verificador = true;
           }
       }
           
   }
   
   
 
 //--------------------------------------------------------------
//Método de pesquisa binária com String
//--------------------------------------------------------------
   public Jogador BuscaBinariaIdade(int searchKey)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getIdade() == (searchKey)) //mudamos aqui para comparar a idade
         {
             for (int i = curIn; a[i].getIdade()== searchKey; i++)
             {
                 System.out.println("O jogador" + a[i].getNome() + " tem" + searchKey + " anos");
                 if (i==a.length -1)
                     break;
             }
             for (int i = curIn -1; a[i].getIdade()== searchKey; i--)
             {
                 System.out.println("O jogador" + a[i].getNome() + " tem" + searchKey + " anos");
                 if (i == 0)
                     break;
             }
             return a[curIn];
         }
         else if(lowerBound > upperBound)
            return null;             
         else                          // divide o range
            {
             //O metodo compareTo do tipo String, retorna positivo se a primeira
             //String for maior que a segunda e negativo se for o contrário
            if(a[curIn].getIdade() == (searchKey)) //mudamos aqui para comparar nome
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária()  

//--------------------------------------------------------------
//Método de inserção ORDENADA por idade!!! ....
//--------------------------------------------------------------
   public void insercaoidade(String n, int id, double al)    // insere o elemento no vetor
      {
      int j;
      for(j=0; j<nElems; j++)        // localiza onde esse elemento se encaixa
          
          if (a[j].getIdade() == (id)) //mudado
            break;
      for(int k=nElems; k>j; k--)    // move os elementos maiores uma posição p/ frente
         a[k] = a[k-1];
      //Apos abrir um espaço no lugar certo, ele cria o nome objeto Pessoa na posição aberta!!!
      a[j] = new Jogador(n, id, al); // insere o elemento na posição necessária
      nElems++;                      // incrementa a variavel de controle de tamanho
      }  // finaliza o método de inserção
 
//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
   public void display()             // mostra o conteúdo do vetor
      {
      for(int j=0; j<nElems; j++)      
         a[j].displayJogador();
      }
   //-----------------------------------
   
}