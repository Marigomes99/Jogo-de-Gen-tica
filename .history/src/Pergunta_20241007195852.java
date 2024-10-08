package src;
import java.util.Collections;
import java.util.List;

public class Pergunta {
    private final String texto;
    private final List<String> respostas;
    private final String respostaCorreta;

    public Pergunta(String texto, List<String> respostas, String respostaCorreta) {
        // Validações
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("Texto da pergunta não pode ser nulo ou vazio.");
        }
        if (respostas == null || respostas.isEmpty()) {
            throw new IllegalArgumentException("A lista de respostas não pode ser nula ou vazia.");
        }
        if (!respostas.contains(respostaCorreta)) {
            throw new IllegalArgumentException("A resposta correta deve estar entre as respostas fornecidas.");
        }

        this.texto = texto;
        this.respostas = Collections.unmodifiableList(respostas); // Torna a lista imutável
        this.respostaCorreta = respostaCorreta;
    }

    public String getTexto() {
        return texto;
    }

    public List<String> getRespostas() {
        return respostas; // Retorna a lista imutável
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public boolean verificarResposta(String resposta) {
        // Verifica a resposta sem considerar maiúsculas/minúsculas
        return resposta.equalsIgnoreCase(respostaCorreta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pergunta: ").append(texto).append("\n");
        sb.append("Respostas: ").append(String.join(", ", respostas)).append("\n");
        sb.append("Resposta Correta: ").append(respostaCorreta);
        return sb.toString();
    }
}
