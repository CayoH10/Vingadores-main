import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
        public static void main(String[] args) throws Exception {
                Scanner joaquim = new Scanner(System.in);

                Gerenciador leitor = new Gerenciador();
                HashMap<String, Personagem> Personagens = leitor.lerPersonagens("rsc/Personagens.txt");

                // Personagem heroi1 = Personagens.get("Capitao");
                // Personagem heroi2 = Personagens.get("Homem de Ferro");

                HashMap<String, Capitulo> capitulos = leitor.lerCapitulos("rsc/Capitulos.txt",
                                joaquim,
                                Personagens);

                Capitulo raiz = capitulos.get("PROLOGO");

                raiz.executar();
                joaquim.close();

                // String[] escolhasPer = new String[2]; {
                // escolhasPer[0] = heroi1.getNome();
                // escolhasPer[1] = heroi2.getNome();

                // String[] escolhasCap = new String[4];
                // escolhasCap[0] = "Salvar";
                // escolhasCap[1] = "Lutar";
                // escolhasCap[2] = "Analisar";
                // escolhasCap[3] = "Ativar";

                // Capitulo capituloInicial = capitulos.get("PROLOGO");

                // Capitulo capituloAC = capitulos.get("ROTA DO CAPITÃO");

                // Capitulo capituloBC = capitulos.get("SALVAR HELICOPTERO");

                // Capitulo capituloCC = capitulos.get("ENFRENTAR INIMIGOS");

                // Capitulo capituloAH = capitulos.get("ROTA DO HOMEM DE FERRO");

                // Capitulo capituloBH = capitulos.get("ANALISAR DISPOSITIVO");
                // Capitulo capituloCH = capitulos.get("ATIVAR DISPOSITIVO");

                // capituloInicial.acrescentaEscolha(new Escolhas(escolhasPer[0],
                // escolhasPer[0], capituloAC));
                // capituloInicial.acrescentaEscolha(new Escolhas(escolhasPer[1],
                // escolhasPer[1], capituloAH));

                // capituloAC.acrescentaEscolha(new Escolhas(escolhasCap[0], escolhasCap[0],
                // capituloBC));
                // capituloAC.acrescentaEscolha(new Escolhas(escolhasCap[1], escolhasCap[1],
                // capituloCC));

                // capituloAH.acrescentaEscolha(new Escolhas(escolhasCap[2], escolhasCap[2],
                // capituloBH));
                // capituloAH.acrescentaEscolha(new Escolhas(escolhasCap[3], escolhasCap[3],
                // capituloCH));

                // }
        }

}