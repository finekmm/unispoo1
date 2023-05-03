package jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    
    private int numeroSecreto;
    private int numeroTentativas;
    private boolean jogoAcabou;
    
    public JogoDeAdivinhacao() {
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1;
        numeroTentativas = 0;
        jogoAcabou = false;
    }
    
    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        while (!jogoAcabou) {
            System.out.print("Digite um número entre 1 e 100: ");
            int palpite = scanner.nextInt();
            numeroTentativas++;
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns, você acertou em " + numeroTentativas + " tentativas!");
                jogoAcabou = true;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }
        }
        scanner.close();
    }
    
}