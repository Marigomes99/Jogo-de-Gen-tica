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
        for (Pergunta pergunta : perguntas) {
            exibirPergunta(pergunta);
        }
        JOptionPane.showMessageDialog(null, "Sua pontuação final é: " + pontuacao);
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
}
