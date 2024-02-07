import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Gerenciador {

    public static HashMap<String, Personagem> lerPersonagens() {
        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivoPersonagens = new File("Vingadores-main/rsc/Personagens.txt");
        try {
            Scanner escaneadorArquivosPersonagens = new Scanner(arquivoPersonagens);
            while (escaneadorArquivosPersonagens.hasNextLine()) {
                String linha = escaneadorArquivosPersonagens.nextLine();
                if (linha.equalsIgnoreCase("PERSONAGEM")) {
                    String key = escaneadorArquivosPersonagens.nextLine();
                    Personagem personagem = lerPersonagem(escaneadorArquivosPersonagens);
                    personagens.put(key, personagem);
                }

            }

            escaneadorArquivosPersonagens.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return personagens;
    }

    private static Personagem lerPersonagem(Scanner escaneadorArquivosPersonagens) {
        String nome = escaneadorArquivosPersonagens.nextLine();
        int pv = Integer.parseInt(escaneadorArquivosPersonagens.nextLine());
        Personagem personagem = new Personagem(nome, pv);
        return personagem;
    }

    public HashMap<String, Capitulo> lerCapitulos(HashMap<String, Personagem> personagens, Scanner joaquim) {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();

        File arquivoCapitulos = new File("Vingadores-main/rsc/Capitulos.txt");

        try {
            Scanner escaneadorArquivosPersonagens = new Scanner(arquivoCapitulos);
            while (escaneadorArquivosPersonagens.hasNextLine()) {
                String linha = escaneadorArquivosPersonagens.nextLine();
                if (linha.equalsIgnoreCase("CAPITULO")) {
                    String key = escaneadorArquivosPersonagens.nextLine();
                    Capitulo capitulo = lerCapitulo(escaneadorArquivosPersonagens, personagens, joaquim);
                    capitulos.put(key, capitulo);
                }
                if (linha.equalsIgnoreCase("CAPITULO_IMAGEM")) {
                    String key = escaneadorArquivosPersonagens.nextLine();
                    CapituloImagem capitulo = lerCapituloImagem(escaneadorArquivosPersonagens, personagens, joaquim);
                    capitulos.put(key, capitulo);
                }
                if (linha.equalsIgnoreCase("ESCOLHA")) {
                    String keyCapituloOrigem = escaneadorArquivosPersonagens.nextLine();
                    String textoEscolha = escaneadorArquivosPersonagens.nextLine();
                    String keyCapituloDestino = escaneadorArquivosPersonagens.nextLine();
                    capitulos.get(keyCapituloOrigem).acrescentaEscolha(new Escolhas(textoEscolha, capitulos.get(keyCapituloDestino)));
                }
            }
            escaneadorArquivosPersonagens.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return capitulos;
    }

    private CapituloImagem lerCapituloImagem(Scanner escaneadorArquivosPersonagens,
            HashMap<String, Personagem> personagens, Scanner joaquim) {
                String texto = escaneadorArquivosPersonagens.nextLine();
                String keyPersonagem = escaneadorArquivosPersonagens.nextLine();
                Personagem personagem = personagens.get(keyPersonagem);
                int alteracaoDePv = Integer.parseInt(escaneadorArquivosPersonagens.nextLine());
                String imagem = "";
                String linha = escaneadorArquivosPersonagens.nextLine();

                while (!linha.equalsIgnoreCase("FIM_IMAGEM")) {
                    imagem += linha + "\n";
                    linha = escaneadorArquivosPersonagens.nextLine();
                }
                CapituloImagem capitulo = new CapituloImagem(texto, imagem, alteracaoDePv, personagem, joaquim);
                return capitulo;
       
    }

    private static Capitulo lerCapitulo(Scanner escaneadorArquivosPersonagens, HashMap<String, Personagem> personagens,
            Scanner joaquim) {

        String texto = escaneadorArquivosPersonagens.nextLine();
        String keyPersonagem = escaneadorArquivosPersonagens.nextLine();
        Personagem personagem = personagens.get(keyPersonagem);
        int alteracaoDePv = Integer.parseInt(escaneadorArquivosPersonagens.nextLine());
        Capitulo capitulo = new Capitulo(texto, alteracaoDePv, personagem, joaquim);
        return capitulo;
    }  

}
