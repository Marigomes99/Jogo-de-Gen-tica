import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogo {
    private List<Pergunta> perguntas;
    private int pontuacao;
    private List<String> ranking;

    public Jogo(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
        this.pontuacao = 0;
        this.ranking = new ArrayList<>();
    }

    public void iniciar() {
        List<String> jogadores = new ArrayList<>();
        int numJogadores = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de jogadores:"));

        // Coletar nomes dos jogadores
        for (int i = 1; i <= numJogadores; i++) {
            String nomeJogador = JOptionPane.showInputDialog("Digite o nome do jogador " + i + ":");
            if (nomeJogador == null || nomeJogador.trim().isEmpty()) {
                nomeJogador = "Jogador Anônimo";
            }
            jogadores.add(nomeJogador);
        }

        // Jogar para cada jogador
        for (String jogador : jogadores) {
            pontuacao = 0; // Reinicia a pontuação para cada jogador
            JOptionPane.showMessageDialog(null, "É a vez de " + jogador);

            Collections.shuffle(perguntas); // Embaralha as perguntas
            for (Pergunta pergunta : perguntas) {
                exibirPergunta(pergunta);
            }

            JOptionPane.showMessageDialog(null, "Pontuação final de " + jogador + ": " + pontuacao);
            // Adiciona a pontuação ao ranking
            ranking.add(jogador + ": " + pontuacao);
        }

        salvarRanking(); // Salva o ranking ao final
    }

    private void exibirPergunta(Pergunta pergunta) {
        String respostaUsuario = (String) JOptionPane.showInputDialog(
                null,
                pergunta.getPergunta(),
                "Pergunta",
                JOptionPane.QUESTION_MESSAGE,
                null,
                pergunta.getRespostas(),
                pergunta.getRespostas()[0]
        );

        if (respostaUsuario != null && respostaUsuario.equals(pergunta.getRespostaCorreta())) {
            pontuacao++;
            JOptionPane.showMessageDialog(null, "Correto!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorreto! A resposta correta é: " + pergunta.getRespostaCorreta());
        }
    }

    private void salvarRanking() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ranking.txt", true))) {
            for (String entrada : ranking) {
                writer.write(entrada);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
