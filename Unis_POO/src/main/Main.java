package main;

import jogo.JogoDeAdivinhacao;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        JogoDeAdivinhacao jogo = new JogoDeAdivinhacao();
        jogo.jogar();
    }
    
}