package src;

import javax.swing.*;
import java.util.List;

public class Jogo {
    private List<Pergunta> perguntas;
    private int pontuacao;

    public Jogo(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
        this.pontuacao = 0;
    }

    public void iniciar() {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Jogo de Genética!");

        for (Pergunta pergunta : perguntas) {
            exibirPergunta(pergunta);
        }

        JOptionPane.showMessageDialog(null, "Sua pontuação final é: " + pontuacao);
    }

    private void exibirPergunta(Pergunta pergunta) {
        StringBuilder sb = new StringBuilder();
        sb.append(pergunta.getTexto()).append("\n");

        List<String> respostas = pergunta.getRespostas();
        for (int i = 0; i < respostas.size(); i++) {
            sb.append((i + 1)).append(". ").append(respostas.get(i)).append("\n");
        }

        String respostaEscolhida = (String) JOptionPane.showInputDialog(null, sb.toString(),
                "Escolha uma opção", JOptionPane.QUESTION_MESSAGE, null,
                respostas.toArray(), respostas.get(0));

        // Verificando a resposta escolhida
        if (respostaEscolhida != null) {
            if (pergunta.verificarResposta(respostaEscolhida)) {
                JOptionPane.showMessageDialog(null, "Correto!");
                pontuacao++;
            } else {
                JOptionPane.showMessageDialog(null, "Incorreto! A resposta correta é: " + pergunta.getRespostaCorreta());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma resposta escolhida. A pergunta será ignorada.");
        }
    }
}
