import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Personagem heroi1 = new Personagem("Capitao", 100);

        Personagem heroi2 = new Personagem("Homem de Ferro", 70);

        Capitulo capituloInicial = new Capitulo("Prólogo",
                "Bem-vindo ao livro interativo dos Vingadores!" +
                        "\nVocê deseja se juntar ao Capitão América ou ao Homem de Ferro?",
                "Capitao",
                "Homem de Ferro",
                0,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloAC = new Capitulo("Rota do Capitão",
                "\nVocê se junta ao Capitão América e vai para uma batalha." +
                        "\nEnergia do " + heroi1.nome + ": " + heroi1.pv +
                        "\nVocê vê um helicóptero prestes a cair. O que você faz?",
                "Salvar",
                "Lutar",
                100,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloBC = new Capitulo("Salvar helicóptero",
                "\nVocê salva o helicóptero e é elogiado pela equipe." +
                        "Parabéns! Você alcançou o final heroico.",
                null,
                null,
                -60,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloCC = new Capitulo("Enfrentar inimigo",
                "\nVocê decide lutar contra o inimigo, mas é ferido gravemente." +
                        "Infelizmente, você não consegue se recuperar. Fim do livro.",
                null,
                null,
                -100,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloAH = new Capitulo("Rota do Homem de Ferro",
                "\nVocê se junta ao Homem de Ferro e embarca em uma missão de resgate." +
                        "Energia do " + heroi2.nome + ": " + heroi2.pv +
                        "Você encontra um dispositivo alienígena. O que você faz?",
                "Analisar",
                "Ativar",
                0,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloBH = new Capitulo("Analisar dispositivo",
                "\nVocê analisa o dispositivo e descobre sua função secreta." +
                        "\nCom essa informação, você ajuda a derrotar o vilão e salva o dia!" +
                        "Parabéns! Você alcançou o final heróico.",
                null,
                null,
                -20,
                heroi1,
                heroi2,
                leitor);

        Capitulo capituloCH = new Capitulo("Ativar dispositivo",
                "\nAo ativar o dispositivo, você acidentalmente liberta uma força maligna." +
                        "Infelizmente, o mundo fica em perigo e não há como consertar o erro. Fim do livro.",
                null,
                null,
                -70,
                heroi1,
                heroi2,
                leitor);

       boolean oCerto = false;

       while(!oCerto){

        capituloInicial.mostrar();
        int passagem = capituloInicial.escolher();

        if(passagem == 1){
              while(!oCerto){
                oCerto = true;
                capituloAC.mostrar();
                int passagem1 = capituloAC.escolher();
                if(passagem1 == 1){
                        capituloBC.mostrar();
                }else if(passagem1 == 2){
                        capituloCC.mostrar();
                }else{
                        System.out.println("Error!");
                        oCerto = false;
                }
              }
        }else if(passagem == 2){
           while(!oCerto){
                oCerto = true;
                capituloAH.mostrar();
                int passagem2 = capituloAH.escolher();
                if(passagem2 == 1){
                        capituloBH.mostrar();
                }else if(passagem2 == 2){
                        capituloCH.mostrar();
                }else{
                        System.out.println("Error!");
                        oCerto = false;
                }
           }
        }else{
                System.out.println("Error!");
                oCerto = false;
        }
       }
                

    }

       
}