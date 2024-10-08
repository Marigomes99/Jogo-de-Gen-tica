import java.util.List;

public class Pergunta {
    private String texto;
    private List<String> respostas;
    private String respostaCorreta;

    public Pergunta(String texto, List<String> respostas, String respostaCorreta) {
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
        this.respostas = respostas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getTexto() {
        return texto;
    }

    public List<String> getRespostas() {
        return respostas;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public boolean verificarResposta(String resposta) {
        return resposta.equals(respostaCorreta);
    }

    @Override
    public String toString() {
        return "Pergunta: " + texto + "\nRespostas: " + respostas + "\nResposta Correta: " + respostaCorreta;
    }
}
