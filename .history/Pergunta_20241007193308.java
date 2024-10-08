import java.util.List;

public class Pergunta {
    private String texto;
    private List<String> respostas;
    private String respostaCorreta;

    public Pergunta(String texto, List<String> respostas, String respostaCorreta) {
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
}
