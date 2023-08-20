/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogotrunfo;

import java.util.Random;

/**
 *
 * @author Lab06Aluno
 */
public class Carta {
    int potencia;
    int veloc_max;
    int veloc_0_100;
    int peso;
    int consumo;
    
    Carta(){
        Random gerarValor = new Random();
        potencia = gerarValor.nextInt(600);
        veloc_max = gerarValor.nextInt(395);
        veloc_0_100 = gerarValor.nextInt(45);
        peso = gerarValor.nextInt(2000);
        consumo = gerarValor.nextInt(20);
    }
    
    public void exibirCarta(){
        System.out.println("----- Carta -----");
        System.out.println("Potencia: " + potencia);
        System.out.println("Veloc Max: " + veloc_max);
        System.out.println("Veloc 0 a 100: " + veloc_0_100);
        System.out.println("Peso: " + peso);
        System.out.println("Consumo: " + consumo);
    }
    
    
}