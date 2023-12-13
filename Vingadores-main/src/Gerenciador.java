import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Gerenciador {

    HashMap<String, Personagem> lerPersonagens(String caminhoArquivoPersonagens) {
        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivoPersonagens = new File(caminhoArquivoPersonagens);
        try {
            Scanner escaneadorArquivosPersonagens = new Scanner(arquivoPersonagens, "UTF-8");

            String nomePersonagem = "";
            String linhaEscaneada = "";
            int energiaPersonagem = 0;

            while (escaneadorArquivosPersonagens.hasNextLine()) {
                while (!linhaEscaneada.equals("PERSONAGEM")) {
                    linhaEscaneada = escaneadorArquivosPersonagens.nextLine();
                }
                linhaEscaneada = escaneadorArquivosPersonagens.nextLine(); // NOME
                nomePersonagem = escaneadorArquivosPersonagens.nextLine();
                linhaEscaneada = escaneadorArquivosPersonagens.nextLine(); // PV
                energiaPersonagem = Integer.parseInt(escaneadorArquivosPersonagens.nextLine());
                personagens.put(nomePersonagem, new Personagem(nomePersonagem, energiaPersonagem));

            }

            escaneadorArquivosPersonagens.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return personagens;
    }

    HashMap<String, Capitulo> lerCapitulos(
            String caminhoArquivoCapitulos,
            Scanner escaneador,
            HashMap<String, Personagem> personagens) {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);
        try {
            Scanner escaneadorArquivosCapitulos = new Scanner(arquivoCapitulos, "UTF-8");

            String linhaEscaneada = "";

            while (escaneadorArquivosCapitulos.hasNextLine()) {
                while (!linhaEscaneada.equals("CAPITULO") &&
                        !linhaEscaneada.equals("ESCOLHA")) {
                    linhaEscaneada = escaneadorArquivosCapitulos.nextLine();
                }
                if (linhaEscaneada.equals("CAPITULO")) {
                    linhaEscaneada = lerCapitulo(escaneador, personagens, capitulos, escaneadorArquivosCapitulos);
                    linhaEscaneada = "";

                } else if (linhaEscaneada.equals("ESCOLHA")) {
                    linhaEscaneada = lerEscolha(capitulos, escaneadorArquivosCapitulos);
                    linhaEscaneada = "";
                }

            }

            escaneadorArquivosCapitulos.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return capitulos;
    }

    private String lerCapitulo(Scanner escaneador, HashMap<String, Personagem> personagens,
            HashMap<String, Capitulo> capitulos, Scanner escaneadorArquivosCapitulos) {
        String nomeCapitulo;
        String textoCapitulo;
        String nomePersonagem;
        int variacaoPV;
        String linhaEscaneada;
        linhaEscaneada = escaneadorArquivosCapitulos.nextLine(); // NOME;
        nomeCapitulo = escaneadorArquivosCapitulos.nextLine();
        linhaEscaneada = escaneadorArquivosCapitulos.nextLine(); // TEXTO;
        textoCapitulo = escaneadorArquivosCapitulos.nextLine();
        linhaEscaneada = escaneadorArquivosCapitulos.nextLine(); // PERSONAGEM;
        nomePersonagem = escaneadorArquivosCapitulos.nextLine();
        linhaEscaneada = escaneadorArquivosCapitulos.nextLine(); // VARIAÇÃO PV;
        variacaoPV = Integer.parseInt(escaneadorArquivosCapitulos.nextLine());
        capitulos.put(nomeCapitulo, new Capitulo(nomeCapitulo,
                textoCapitulo,
                variacaoPV,
                personagens.get(nomePersonagem),
                escaneador));
        return linhaEscaneada;
    }

    private String lerEscolha(HashMap<String, Capitulo> capitulos, Scanner escaneadorArquivosCapitulos) {
        String nomeCapituloOrigem;
        String textoEscolha;
        String nomeCapituloDestino;
        String linhaEscaneada;
        linhaEscaneada = escaneadorArquivosCapitulos.nextLine(); // CAPITULO ORIGEM;
        nomeCapituloOrigem = escaneadorArquivosCapitulos.nextLine();
        linhaEscaneada = escaneadorArquivosCapitulos.nextLine(); // TEXTO;
        textoEscolha = escaneadorArquivosCapitulos.nextLine();
        linhaEscaneada = escaneadorArquivosCapitulos.nextLine(); // CAPITULO DESTINO;
        nomeCapituloDestino = escaneadorArquivosCapitulos.nextLine();
        Capitulo capituloOrigem = capitulos.get(nomeCapituloOrigem);
        Capitulo capituloDestino = capitulos.get(nomeCapituloDestino);
        capituloOrigem.acrescentaEscolha(new Escolhas(textoEscolha, "Capitao", capituloDestino));
        return linhaEscaneada;
    }
}
