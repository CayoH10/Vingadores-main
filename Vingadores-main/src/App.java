import java.util.Scanner;


public class App {
        public static void main(String[] args) throws Exception {
                Scanner joaquim = new Scanner(System.in);

<<<<<<< HEAD
                Personagem heroi1 = new Personagem("Capitao", 100);
                Personagem heroi2 = new Personagem("Homem de Ferro", 70);

                String[] escolhasPer = new String[2];
                escolhasPer[0] = heroi1.getNome();
                escolhasPer[1] = heroi2.getNome();


                String[] escolhasCap = new String[4];
                escolhasCap[0] = "Salvar";
                escolhasCap[1] = "Lutar";
                escolhasCap[2] = "Analisar";
                escolhasCap[3] = "Ativar";



                Capitulo capituloInicial = new Capitulo("Prólogo",
                                "Bem-vindo ao livro interativo dos Vingadores!" +
                                                "\nVocê deseja se juntar ao Capitão América ou ao Homem de Ferro?",
                                0,
                                heroi1,
                                
                                joaquim);
                
                

                Capitulo capituloAC = new Capitulo("Rota do Capitão",
                                "\nVocê se junta ao Capitão América e vai para uma batalha." +
                                                "\nEnergia do " + heroi1.getNome() + ": " + heroi1.getPv() +
                                                "\nVocê vê um helicóptero prestes a cair. O que você faz?",

                                0,
                                heroi1,
                                joaquim);
                         

                Capitulo capituloBC = new Capitulo("Salvar helicóptero",
                                "\nVocê salva o helicóptero e é elogiado pela equipe." +
                                                "Parabéns! Você alcançou o final heroico.",
                                -60,
                                heroi1,       
                                joaquim);

                Capitulo capituloCC = new Capitulo("Enfrentar inimigo",
                                "\nVocê decide lutar contra o inimigo, mas é ferido gravemente." +
                                                "Infelizmente, você não consegue se recuperar. Fim do livro.",
                                -100,
                                heroi1,               
                                joaquim);

                Capitulo capituloAH = new Capitulo("Rota do Homem de Ferro",
                                "\nVocê se junta ao Homem de Ferro e embarca em uma missão de resgate." +
                                                "Energia do " + heroi2.getNome() + ": " + heroi2.getPv() +
                                                "Você encontra um dispositivo alienígena. O que você faz?",
                                0,
                                heroi2,
                                joaquim);
                         

                Capitulo capituloBH = new Capitulo("Analisar dispositivo",
                                "\nVocê analisa o dispositivo e descobre sua função secreta." +
                                                "\nCom essa informação, você ajuda a derrotar o vilão e salva o dia!" +
                                                "Parabéns! Você alcançou o final heróico.",
                                -20,                        
                                heroi2,
                                joaquim);

                Capitulo capituloCH = new Capitulo("Ativar dispositivo",
                                "\nAo ativar o dispositivo, você acidentalmente liberta uma força maligna." +
                                                "Infelizmente, o mundo fica em perigo e não há como consertar o erro. Fim do livro.",
                                -70,                        
                                heroi2,
                                joaquim);


                capituloInicial.acrescentaEscolha(new Escolhas(escolhasPer[0], escolhasPer[0], capituloAC));
                capituloInicial.acrescentaEscolha(new Escolhas(escolhasPer[1], escolhasPer[1], capituloAH));

                capituloAC.acrescentaEscolha(new Escolhas(escolhasCap[0], escolhasCap[0], capituloBC));
                capituloAC.acrescentaEscolha(new Escolhas(escolhasCap[1], escolhasCap[1], capituloCC));

                capituloAH.acrescentaEscolha(new Escolhas(escolhasCap[2], escolhasCap[2], capituloBH));
                capituloAH.acrescentaEscolha(new Escolhas(escolhasCap[3], escolhasCap[3], capituloCH));

                Capitulo raiz = capituloInicial;

                raiz.executar();
                

             
=======
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
>>>>>>> parent of 2cc490f (Personagem)
        }

}