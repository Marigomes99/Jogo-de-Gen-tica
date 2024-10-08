public class Pergunta {
    private String pergunta;
    private String[] respostas;
    private String respostaCorreta;

    public Pergunta(String pergunta, String[] respostas, String respostaCorreta) {
        this.pergunta = pergunta;
        this.respostas = respostas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String[] getRespostas() {
        return respostas;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }
}
