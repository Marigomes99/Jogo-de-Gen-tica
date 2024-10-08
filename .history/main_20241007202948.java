import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pergunta> perguntas = new ArrayList<>();

        String[] respostas1 = {"Alelo", "Gene", "Cromossomo", "Fenótipo"};
        perguntas.add(new Pergunta("O que é um alelo?", respostas1, "Alelo"));

        String[] respostas2 = {"Dominância", "Recessividade", "Codominância", "Epistasia"};
        perguntas.add(new Pergunta("Quando dois alelos se expressam igualmente, é um caso de:", respostas2, "Codominância"));

        String[] respostas3 = {"AA", "Aa", "aa", "A"};
        perguntas.add(new Pergunta("Qual é o genótipo de um indivíduo homozigoto recessivo?", respostas3, "aa"));

        String[] respostas4 = {"Produz muitos descendentes", "Produz poucos descendentes", "Cultivo fácil", "Curto tempo de geração"};
        perguntas.add(new Pergunta("O sucesso dos experimentos de Mendel está diretamente ligado ao material escolhido para sua pesquisa: ervilhas. Analise as alternativas abaixo e marque a única que não representa uma vantagem do uso dessa espécie.", respostas4, "Produz poucos descendentes"));

        String[] respostas5 = {"1:1", "3:1", "9:3:3:1", "2:1"};
        perguntas.add(new Pergunta("Em um experimento, ao cruzar plantas puras de flores roxas com plantas puras de flores brancas, obteve-se 100% de plantas com flores roxas em F1. Levando em consideração que o experimento obedece à Primeira Lei de Mendel, espera-se que em F2 as flores roxas e brancas apresentem-se em uma proporção de:", respostas5, "3:1"));

        String[] respostas6 = {"Homozigotos", "Heterozigotos", "Recessivos", "Dominantes"};
        perguntas.add(new Pergunta("Ao realizar seus experimentos com ervilhas, Mendel cruzou plantas com sementes amarelas e verdes, obtendo, em F1, 100% das plantas com sementes amarelas. Em F2, obteve 75% das plantas com sementes amarelas e 25% de plantas com sementes verdes. Podemos concluir, portanto, que em F1 temos indivíduos:", respostas6, "Heterozigotos"));

        String[] respostas7 = {"Dos cruzamentos I, II e III", "Apenas I", "Apenas II", "Apenas III"};
        perguntas.add(new Pergunta("Considere os seguintes cruzamentos para ervilha, sabendo que V representa o gene que determina cor amarela dos cotilédones e é dominante sobre o alelo v, que determina cor verde.\n\nI. VV x vv\nII. Vv x Vv\nIII. Vv x vv\n\nUm pé de ervilha, heterozigoto e que, portanto, pode produzir vagens com sementes amarelas e com sementes verdes, pode resultar:", respostas7, "Dos cruzamentos I, II e III"));

        String[] respostas8 = {"Milho", "Arroz", "Ervilha", "Feijão"};
        perguntas.add(new Pergunta("Para realizar seus experimentos, Mendel usou um organismo que apresenta curto tempo de geração, cultivo fácil e que gera grande número de descendentes. Que organismo foi esse?", respostas8, "Ervilha"));

        String[] respostas9 = {"25% brancas e 75% púrpuras", "50% brancas e 50% púrpuras", "100% brancas", "100% púrpuras"};
        perguntas.add(new Pergunta("Mendel, durante o seu experimento, realizou a polinização cruzada de plantas ditas puras, ou seja, plantas que, após sucessivas gerações, eram responsáveis por originar plantas com a mesma característica. O cruzamento entre as plantas puras de flor branca e plantas de flor púrpura deu origem às plantas da geração que ele denominou F1, as quais foram 100% púrpuras. De acordo com seus conhecimentos sobre genética e os trabalhos de Mendel, marque a alternativa que indica corretamente a proporção de flores brancas e púrpuras obtidas na geração F2:", respostas9, "25% brancas e 75% púrpuras"));

        String[] respostas10 = {"9:3:3:1", "3:1", "1:2:1", "1:1"};
        perguntas.add(new Pergunta("Qual foi a proporção aproximada encontrada por Mendel ao desenvolver a Segunda Lei?", respostas10, "9:3:3:1"));

        String[] respostas11 = {"3:1", "1:1", "9:3:3:1", "1:2:1"};
        perguntas.add(new Pergunta("Um cruzamento entre duas plantas com características diferentes resulta em uma geração F1 com 100% de características dominantes. Se as plantas da geração F1 forem cruzadas entre si, qual a proporção esperada entre as características dominantes e recessivas na geração F2?", respostas11, "3:1"));

        // Inicializa o jogo
        Jogo jogo = new Jogo(perguntas);
        jogo.iniciar();
    }
}

