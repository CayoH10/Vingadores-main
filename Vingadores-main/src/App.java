import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Personagem heroi1 = new Personagem("Capitao", 100);

        Personagem heroi2 = new Personagem("Homem de Ferro", 70);

        Capitulo capituloInicial = new Capitulo("Prólogo",
                "Bem-vindo ao livro interativo dos Vingadores!" +
                        "\nVocê deseja se juntar ao Capitão América ou ao Homem de Ferro?",
                "Capitão",
                "Homem de Ferro",
                0,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloAC = new Capitulo("Rota do Capitão",
                "Você se junta ao Capitão América e vai para uma batalha./n" +
                        "Energia do " + heroi1.nome + ": " + heroi1.pv +
                        "Você vê um helicóptero prestes a cair. O que você faz?",
                "Salvar",
                "Lutar",
                100,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloBC = new Capitulo("Salvar helicóptero",
                "Você salva o helicóptero e é elogiado pela equipe./n" +
                        "Parabéns! Você alcançou o final heroico.",
                null,
                null,
                -60,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloCC = new Capitulo("Enfrentar inimigo",
                "Você decide lutar contra o inimigo, mas é ferido gravemente./n" +
                        "Infelizmente, você não consegue se recuperar. Fim do livro.",
                null,
                null,
                -100,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloAH = new Capitulo("Rota do Homem de Ferro",
                "Você se junta ao Homem de Ferro e embarca em uma missão de resgate./n" +
                        "Energia do " + heroi2.nome + ": " + heroi2.pv +
                        "Você encontra um dispositivo alienígena. O que você faz?",
                "Analisar",
                "Ativar",
                0,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloBH = new Capitulo("Analisar dispositivo",
                "Você analisa o dispositivo e descobre sua função secreta./n" +
                        "Com essa informação, você ajuda a derrotar o vilão e salva o dia!/n" +
                        "Parabéns! Você alcançou o final heróico.",
                null,
                null,
                -20,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloCH = new Capitulo("Ativar dispositivo",
                "Ao ativar o dispositivo, você acidentalmente liberta uma força maligna./n" +
                        "Infelizmente, o mundo fica em perigo e não há como consertar o erro. Fim do livro.",
                null,
                null,
                -70,
                heroi1,
                heroi2,
                leitor);

        capituloInicial.mostrar();
        capituloInicial.escolher();

        if (capituloInicial.escolha1.equalsIgnoreCase("Capitao")) {
            capituloBC.mostrar();
            
            // Desenvolvimento da escolha 1
            System.out.println();
            String escolha2 = leitor.nextLine();

            if (capituloAC.escolha1.equalsIgnoreCase("Salvar")) {

                // Desenvolvimento da escolha 2 (a)

            } else if (capituloBC.escolha2.equalsIgnoreCase("Lutar")) {
                // Desenvolvimento da escolha 2 (b)

            } else {
            }
        } else if (capituloInicial.escolha2.equalsIgnoreCase("Homem de Ferro")) {

            // Desenvolvimento da escolha 1
            String escolha2 = leitor.nextLine();

            if (capituloAH.escolha1.equalsIgnoreCase("Analisar")) {
                // Desenvolvimento da escolha 2 (c)

            } else if (capituloAH.escolha2.equalsIgnoreCase("Ativar")) {
                // Desenvolvimento da escolha 2 (d)

            } else {
                System.out.println("Opção inválida. Fim do livro.");
            }
        } else {
            System.out.println("Opção inválida. Fim do livro.");
        }
    }
}