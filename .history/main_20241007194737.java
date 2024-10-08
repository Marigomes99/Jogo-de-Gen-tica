import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pergunta {
    private String pergunta;
    private List<String> alternativas;
    private String respostaCorreta;

    public Pergunta(String pergunta, List<String> alternativas, String respostaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public boolean verificarResposta(String resposta) {
        return resposta.equalsIgnoreCase(respostaCorreta);
    }
}

class Jogo {
    private List<Pergunta> perguntas;

    public Jogo(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta.getPergunta());
            List<String> alternativas = pergunta.getAlternativas();
            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println((i + 1) + ". " + alternativas.get(i));
            }
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            String resposta = alternativas.get(escolha - 1); // A opção escolhida

            if (pergunta.verificarResposta(resposta)) {
                System.out.println("Resposta correta!");
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta! A resposta correta é: " + pergunta.respostaCorreta);
            }

            System.out.println(); // Para adicionar uma linha em branco
        }

        System.out.println("Fim do jogo! Sua pontuação: " + pontuacao + "/" + perguntas.size());
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Pergunta> perguntas = new ArrayList<>();

        // Primeira pergunta
        List<String> respostas1 = new ArrayList<>();
        respostas1.add("Alelo");
        respostas1.add("Gene");
        respostas1.add("Cromossomo");
        perguntas.add(new Pergunta("O que é um alelo?", respostas1, "Alelo"));

        // Segunda pergunta
        List<String> respostas2 = new ArrayList<>();
        respostas2.add("Dominância Completa");
        respostas2.add("Codominância");
        respostas2.add("Dominância Incompleta");
        perguntas.add(new Pergunta("Quando dois alelos se expressam igualmente, é um caso de:", respostas2, "Codominância"));

        // Terceira pergunta
        List<String> respostas3 = new ArrayList<>();
        respostas3.add("Aa");
        respostas3.add("AA");
        respostas3.add("aa");
        perguntas.add(new Pergunta("Qual é o genótipo de um indivíduo homozigoto recessivo?", respostas3, "aa"));

        // Quarta pergunta
        List<String> respostas4 = new ArrayList<>();
        respostas4.add("Fácil cultivo");
        respostas4.add("Produz poucos descendentes");
        respostas4.add("Ciclo de vida curto");
        respostas4.add("Facilidade de polinização artificial");
        respostas4.add("Possui muitas variedades");
        perguntas.add(new Pergunta("O sucesso dos experimentos de Mendel está diretamente ligado ao material escolhido para sua pesquisa: ervilhas. Analise as alternativas abaixo e marque a única que não representa uma vantagem do uso dessa espécie.", respostas4, "Produz poucos descendentes"));

        // Quinta pergunta
        List<String> respostas5 = new ArrayList<>();
        respostas5.add("5:3");
        respostas5.add("1:1");
        respostas5.add("2:3");
        respostas5.add("3:1"); // Resposta correta
        respostas5.add("2:5");
        perguntas.add(new Pergunta("Em um experimento, ao cruzar plantas puras de flores roxas com plantas puras de flores brancas, obteve-se 100% de plantas com flores roxas em F1. Levando em consideração que o experimento obedece à Primeira Lei de Mendel, espera-se que em F2 as flores roxas e brancas apresentem-se em uma proporção de:", respostas5, "3:1"));

        // Sexta pergunta
        List<String> respostas6 = new ArrayList<>();
        respostas6.add("Homozigotos dominantes");
        respostas6.add("Homozigotos recessivos");
        respostas6.add("Heterozigotos"); // Resposta correta
        respostas6.add("Púros dominantes");
        respostas6.add("Púros recessivos");
        perguntas.add(new Pergunta("Ao realizar seus experimentos com ervilhas, Mendel cruzou plantas com sementes amarelas e verdes, obtendo, em F1, 100% das plantas com sementes amarelas. Em F2, obteve 75% das plantas com sementes amarelas e 25% de plantas com sementes verdes. Podemos concluir, portanto, que em F1 temos indivíduos:", respostas6, "Heterozigotos"));

        // Sétima pergunta
        List<String> respostas7 = new ArrayList<>();
        respostas7.add("Apenas do cruzamento I");
        respostas7.add("Apenas do cruzamento II");
        respostas7.add("Apenas do cruzamento III");
        respostas7.add("Apenas dos cruzamentos II e III");
        respostas7.add("Dos cruzamentos I, II e III"); // Resposta correta
        perguntas.add(new Pergunta("Considere os seguintes cruzamentos para ervilha, sabendo que V representa o gene que determina cor amarela dos cotilédones e é dominante sobre o alelo v, que determina cor verde.\n\nI. VV x vv\nII. Vv x Vv\nIII. Vv x vv\n\nUm pé de ervilha, heterozigoto e que, portanto, pode produzir vagens com sementes amarelas e com sementes verdes, pode resultar:", respostas7, "Dos cruzamentos I, II e III"));

        // Oitava pergunta
        List<String> respostas8 = new ArrayList<>();
        respostas8.add("Feijão");
        respostas8.add("Soja");
        respostas8.add("Ervilha"); // Resposta correta
        respostas8.add("Milho");
        perguntas.add(new Pergunta("Um exemplo de planta que pode ser utilizada em experimentos de genética é:", respostas8, "Ervilha"));

        // Nona pergunta
        List<String> respostas9 = new ArrayList<>();
        respostas9.add("Monogênicos");
        respostas9.add("Poligênicos"); // Resposta correta
        respostas9.add("Múltiplos alelos");
        respostas9.add("Interações gênicas");
        respostas9.add("Dominância");
        perguntas.add(new Pergunta("Os caracteres que são controlados por mais de um par de alelos são chamados:", respostas9, "Poligênicos"));

        // Décima pergunta
        List<String> respostas10 = new ArrayList<>();
        respostas10.add("Apenas um dos alelos influencia o fenótipo");
        respostas10.add("Ambos os alelos influenciam o fenótipo"); // Resposta correta
        respostas10.add("Nenhum dos alelos influencia o fenótipo");
        perguntas.add(new Pergunta("A dominância incompleta ocorre quando:", respostas10, "Ambos os alelos influenciam o fenótipo"));

        // Iniciando o jogo
        Jogo jogo = new Jogo(perguntas);
        jogo.iniciar();
    }
}
