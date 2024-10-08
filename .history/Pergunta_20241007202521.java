public class Pergunta {
    private String pergunta;          // A pergunta a ser feita
    private String[] respostas;       // As respostas possíveis
    private String respostaCorreta;   // A resposta correta

    // Construtor da classe Pergunta
    public Pergunta(String pergunta, String[] respostas, String respostaCorreta) {
        this.pergunta = pergunta;                  // Inicializa a pergunta
        this.respostas = respostas;                // Inicializa as respostas
        this.respostaCorreta = respostaCorreta;    // Inicializa a resposta correta
    }

    // Método para obter a pergunta
    public String getPergunta() {
        return pergunta;   // Retorna a pergunta
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
