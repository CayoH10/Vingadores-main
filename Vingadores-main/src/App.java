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
               HashMap<String, Personagem> personagens = leitor.lerPersonagens();
               HashMap<String, Capitulo> capitulos = leitor.lerCapitulos(personagens, joaquim);


                


                 Capitulo raiz = capitulos.get("PROLOGO"); 
                 
                raiz.executar();
                joaquim.close();

                

                 

                 }
        

}