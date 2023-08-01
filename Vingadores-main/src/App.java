import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem-vindo ao livro interativo dos Vingadores!");

        // Início do livro
        System.out.println("Você é convocado para ajudar os Vingadores em uma missão.");
        System.out.println("Você deseja se juntar ao Capitão América ou ao Homem de Ferro? (Capitão/Homem de Ferro)");
        String escolhaPrimaria = leitor.nextLine();

        if (escolhaPrimaria.equalsIgnoreCase("Capitão")) {
            // Desenvolvimento da escolha 1
            System.out.println("Você se junta ao Capitão América e vai para uma batalha.");
            System.out.println("Você vê um helicóptero prestes a cair. O que você faz? (Salvar/Lutar)");
            String escolha2 = leitor.nextLine();

            if (escolha2.equalsIgnoreCase("Salvar")) {
                // Desenvolvimento da escolha 2 (a)
                System.out.println("Você salva o helicóptero e é elogiado pela equipe.");
                System.out.println("Parabéns! Você alcançou o final heroico.");
            } else if (escolha2.equalsIgnoreCase("Lutar")) {
                // Desenvolvimento da escolha 2 (b)
                System.out.println("Você decide lutar contra o inimigo, mas é ferido gravemente.");
                System.out.println("Infelizmente, você não consegue se recuperar. Fim do livro.");
            } else {
                System.out.println("Opção inválida. Fim do livro.");
            }
        } else if (escolhaPrimaria.equalsIgnoreCase("Homem de Ferro")) {
            // Desenvolvimento da escolha 1
            System.out.println("Você se junta ao Homem de Ferro e embarca em uma missão de resgate.");
            System.out.println("Você encontra um dispositivo alienígena. O que você faz? (Analisar/Ativar)");
            String escolha2 = leitor.nextLine();

            if (escolha2.equalsIgnoreCase("Analisar")) {
                // Desenvolvimento da escolha 2 (c)
                System.out.println("Você analisa o dispositivo e descobre sua função secreta.");
                System.out.println("Com essa informação, você ajuda a derrotar o vilão e salva o dia!");
                System.out.println("Parabéns! Você alcançou o final heróico.");
            } else if (escolha2.equalsIgnoreCase("Ativar")) {
                // Desenvolvimento da escolha 2 (d)
                System.out.println("Ao ativar o dispositivo, você acidentalmente liberta uma força maligna.");
                System.out.println("Infelizmente, o mundo fica em perigo e não há como consertar o erro. Fim do livro.");
            } else {
                System.out.println("Opção inválida. Fim do livro.");
            }
        } else {
            System.out.println("Opção inválida. Fim do livro.");
        }
    }
}