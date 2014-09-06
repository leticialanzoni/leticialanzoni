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
import java.util.Scanner;


/**
 *
 * @author aleaguado
 */
public class Usuario {
  
    public static void main(String[] args)
          {
              int maxSize = 10;            // coloca em uma constante o tamanho do vetor
              Estrutura arr = new Estrutura(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              Scanner entradaint = new Scanner (System.in);
              System.out.println("Bem Vindo ao Programa Exercicio de reforço 1!!!");
              
              for (int i = 1; i < 3; i++) {
                
                 System.out.println("Digite o nome: ");
                 String nome = entrada.nextLine();
                 System.out.println("Digite idade: ");
                 int idade = entrada.nextInt();
                 System.out.println("Digite a altura do:");
                 double altura = entradaint.nextDouble();
                 arr.insercaoidade(nome, idade, altura);
                  entrada.nextLine();
              }

              System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma Idade:");
              
              int idade = entrada.nextInt();
              
              if (arr.BuscaBinariaIdade(idade) == null)
                    System.out.println("Não Encontrado!!!" );
                 arr.display();
          } 
                     
          
}