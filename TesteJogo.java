import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TesteJogo {
    public static void main(String[] args) {
        // Criando algumas perguntas de exemplo
        List<Pergunta> perguntas = new ArrayList<>();
        
        perguntas.add(new Pergunta("Qual é a capital da França?", 
            new String[]{"Paris", "Londres", "Berlim", "Madrid"}, "Paris"));
        perguntas.add(new Pergunta("Qual é a moeda do Japão?", 
            new String[]{"Yuan", "Dólar", "Iene", "Rúpia"}, "Iene"));
        perguntas.add(new Pergunta("Qual é o maior planeta do sistema solar?", 
            new String[]{"Terra", "Marte", "Júpiter", "Saturno"}, "Júpiter"));
        
        // Instanciando o jogo
        Jogo jogo = new Jogo(perguntas);
        
        // Iniciando o jogo
        jogo.iniciar();
    }
}
