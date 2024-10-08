import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    private List<Pergunta> perguntas;
    private int pontuacao;

    public Jogo(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
        this.pontuacao = 0;
    }

    public void iniciar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo ao Jogo de Genética!");
            
            for (Pergunta pergunta : perguntas) {
                System.out.println(pergunta.getTexto());
                List<String> respostas = pergunta.getRespostas();
                for (int i = 0; i < respostas.size(); i++) {
                    System.out.println((i + 1) + ". " + respostas.get(i));
                }

                int escolha;
                while (true) {
                    System.out.print("Escolha uma opção: ");
                    escolha = scanner.nextInt();
                    if (escolha > 0 && escolha <= respostas.size()) {
                        break;
                    } else {
                        System.out.println("Escolha inválida. Tente novamente.");
                    }
                }

                if (respostas.get(escolha - 1).equals(pergunta.getRespostaCorreta())) {
                    System.out.println("Correto!");
                    pontuacao++;
                } else {
                    System.out.println("Incorreto! A resposta correta é: " + pergunta.getRespostaCorreta());
                }
            }
            System.out.println("Sua pontuação final é: " + pontuacao);
        }
    }
}
