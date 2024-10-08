import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Declare a lista de jogadores
private List<String> ranking = new ArrayList<>();

public void iniciar() {
    String nomeJogador = JOptionPane.showInputDialog("Digite seu nome:");
    if (nomeJogador == null || nomeJogador.trim().isEmpty()) {
        nomeJogador = "Jogador Anônimo"; // Define um nome padrão caso o usuário cancele ou não insira nada.
    }

    Collections.shuffle(perguntas);
    for (Pergunta pergunta : perguntas) {
        exibirPergunta(pergunta);
    }
    
    JOptionPane.showMessageDialog(null, "Sua pontuação final é: " + pontuacao + "\nObrigado por jogar, " + nomeJogador + "!");
    
    // Adiciona a pontuação ao ranking
    ranking.add(nomeJogador + ": " + pontuacao);
    salvarRanking();
}

private void salvarRanking() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("ranking.txt", true))) {
        for (String entrada : ranking) {
            writer.write(entrada);
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
