/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogotrunfo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lab06Aluno
 */
public class Tabuleiro {
    
    Jogador player1 = new Jogador();
    Jogador player2 = new Jogador();
    
    Scanner lerNome = new Scanner(System.in);
    Random gerarEscolha = new Random();
    
    Tabuleiro(){
        player2.nome = "Computador";
        
        System.out.println("Digite o seu nome?");
        player1.nome = lerNome.next();
    }
    
    void exibirPlacar(){
        System.out.println("----- PLACAR -----");
        System.out.println(player1.nome + "   vs   " + player2.nome);
        System.out.println(player1.pontos + "           " + player2.pontos);
        System.out.println("------------------");
    }
    
    void duelo(){
        int escolha;
        for(int i=0; i<=4; i++){
            if(i%2 == 0){
                player1.monte[i].exibirCarta();
                System.out.println(player1.nome+ " escolha o atributo:");
                escolha = lerNome.nextInt();
                
                switch (escolha){
                        case 1: if(player1.monte[i].potencia > player2.monte[i].potencia){player1.pontos++;}
                        else{player2.pontos++;}
                        break;          
                        
                        case 2: if(player1.monte[i].veloc_max > player2.monte[i].veloc_max){player1.pontos++;}
                        else{player2.pontos++;}
                        break;
                                                
                        case 3: if(player1.monte[i].veloc_0_100 > player2.monte[i].veloc_0_100){player1.pontos++;}
                        else{player2.pontos++;}
                        break;
                        
                        case 4: if(player1.monte[i].peso < player2.monte[i].peso){player1.pontos++;}
                        else{player2.pontos++;}
                        break;
                        
                        case 5: if(player1.monte[i].consumo > player2.monte[i].consumo){player1.pontos++;}
                        else{player2.pontos++;}
                        break;
                        
                        case 0: 
                            System.out.println("Escolha inválida");
                        break;
                            
                }
                
            }
            
            else{
                escolha = gerarEscolha.nextInt();
                
                switch (escolha){
                        case 1: if(player1.monte[i].potencia > player2.monte[i].potencia){player1.pontos++;}
                        else{player2.pontos++;}
                        break;          
                        
                        case 2: if(player1.monte[i].veloc_max > player2.monte[i].veloc_max){player1.pontos++;}
                        else{player2.pontos++;}
                        break;
                                                
                        case 3: if(player1.monte[i].veloc_0_100 > player2.monte[i].veloc_0_100){player1.pontos++;}
                        else{player2.pontos++;}
                        break;
                        
                        case 4: if(player1.monte[i].peso < player2.monte[i].peso){player1.pontos++;}
                        else{player2.pontos++;}
                        break;
                        
                        case 5: if(player1.monte[i].consumo > player2.monte[i].consumo){player1.pontos++;}
                        else{player2.pontos++;}
                        break;
                        
                        case 0: 
                            System.out.println("Escolha inválida");
                        break;
                }
            }
            this.exibirPlacar();
        }
        
        
    }
}
