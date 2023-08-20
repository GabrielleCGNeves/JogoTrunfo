/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogotrunfo;

/**
 *
 * @author Lab06Aluno
 */
public class Jogador {
    String nome;
    int pontos;
    
    
    
    Carta monte [] = new Carta[5];
    
    
    Jogador(){
        for(int i = 0; i < 5; i++){
            monte[i] = new Carta();
        }
    }
    
    void exibirMonte(){
        for(int i = 0; i < 5; i++){
            monte[i].exibirCarta();
        }
    }
}
