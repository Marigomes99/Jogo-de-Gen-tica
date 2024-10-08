public class Pergunta {
    private String texto;          // A pergunta a ser feita
    private String[] respostas;    // As respostas possíveis
    private String respostaCorreta; // A resposta correta

    // Construtor da classe Pergunta
    public Pergunta(String texto, String[] respostas, String respostaCorreta) {
        this.texto = texto;                  // Inicializa a pergunta
        this.respostas = respostas;          // Inicializa as respostas
        this.respostaCorreta = respostaCorreta; // Inicializa a resposta correta
    }

    // Método para obter a pergunta
    public String getTexto() {
        return texto;   // Retorna a pergunta
    }

    // Método para obter as respostas
    public String[] getRespostas() {
        return respostas;   // Retorna as respostas
    }

    // Método para obter a resposta correta
    public String getRespostaCorreta() {
        return respostaCorreta;   // Retorna a resposta correta
    }
}
