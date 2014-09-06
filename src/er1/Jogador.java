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
public class Jogador
   { 
   private String nome;
   private int idade;
   private double altura;
//--------------------------------------------------------------
   public Jogador(String n, int id, double al)
      {                               // comentario aqui
      nome = n;
      idade = id;
      altura = al;
      }
//--------------------------------------------------------------
   public void displayJogador()
      {
      System.out.print("   Nome: " + nome);
      System.out.println(", Idade: " + idade);
          System.out.println(" Altura: " + altura);
      }
//--------------------------------------------------------------
   public int getIdade()           // comentario aqui
      { return idade; }
   
   public String getNome()           // comentario aqui
      { return nome; }
   }  // Final da Classe Jogador