import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App extends Application{
        public static void main(String[] args) {

                launch(args);
              }

              
              @Override
              public void start(Stage primaryStage) throws Exception {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("arquivoTeste.fxml"));
                Parent root = loader.load();
                Scene tela = new Scene(root);

                

                primaryStage.setTitle("PROLOGO");
                primaryStage.setScene(tela);
                primaryStage.show();
              } 






              /*   Scanner joaquim = new Scanner(System.in);
               
                
               Gerenciador leitor = new Gerenciador();
               HashMap<String, Personagem> personagens = leitor.lerPersonagens();
               HashMap<String, Capitulo> capitulos = leitor.lerCapitulos(personagens, joaquim);


                


                 Capitulo raiz = capitulos.get("PROLOGO"); 
                 
                raiz.executar();
                joaquim.close(); */

                
                
                
                
        

}