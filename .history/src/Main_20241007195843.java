package src;
import java.util.ArrayList;
import java.util.List;

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
        respostas8.add("Espinafre");
        perguntas.add(new Pergunta("Para realizar seus experimentos, Mendel usou um organismo que apresenta curto tempo de geração, cultivo fácil e que gera grande número de descendentes. Que organismo foi esse?", respostas8, "Ervilha"));

        // Nona pergunta
        List<String> respostas9 = new ArrayList<>();
        respostas9.add("0% branca e 100% púrpuras");
        respostas9.add("50% brancas e 50% púrpuras");
        respostas9.add("25% brancas e 75% púrpuras"); // Resposta correta
        respostas9.add("75% brancas e 25% púrpuras");
        respostas9.add("100% brancas e 0% púrpura");
        perguntas.add(new Pergunta("Mendel, durante o seu experimento, realizou a polinização cruzada de plantas ditas puras, ou seja, plantas que, após sucessivas gerações, eram responsáveis por originar plantas com a mesma característica. O cruzamento entre as plantas puras de flor branca e plantas de flor púrpura deu origem às plantas da geração que ele denominou F1, as quais foram 100% púrpuras. De acordo com seus conhecimentos sobre genética e os trabalhos de Mendel, marque a alternativa que indica corretamente a proporção de flores brancas e púrpuras obtidas na geração F2:", respostas9, "25% brancas e 75% púrpuras"));

        // Décima pergunta
        List<String> respostas10 = new ArrayList<>();
        respostas10.add("9: 3: 3: 1"); // Resposta correta
        respostas10.add("9: 3: 2: 1");
        respostas10.add("1: 3");
        respostas10.add("3: 3: 3: 1");
        respostas10.add("9: 2: 2: 2");
        perguntas.add(new Pergunta("Qual foi a proporção aproximada encontrada por Mendel ao desenvolver a Segunda Lei?", respostas10, "9: 3: 3: 1"));

        // Décima primeira pergunta (nova)
        List<String> respostas11 = new ArrayList<>();
        respostas11.add("1: 1");
        respostas11.add("1: 2");
        respostas11.add("2: 1"); // Resposta correta
        respostas11.add("3: 1");
        respostas11.add("4: 1");
        perguntas.add(new Pergunta("Um cruzamento entre duas plantas com características diferentes resulta em uma geração F1 com 100% de características dominantes. Qual a proporção esperada na F2, se as plantas F1 forem cruzadas entre si?", respostas11, "3: 1"));

        Jogo jogo = new Jogo(perguntas);
        jogo.iniciar();
    }
}
