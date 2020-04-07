/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author donpe
 */
public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
  
 try {

            FXMLLoader loader = new FXMLLoader();

            // cargar la ruta del fxml (diseño)
           loader.setLocation(main.class.getResource("/vista/V_Mascarada_V20_1.fxml"));
            // Cargarlo en una ventana
            VBox ventanappal = (VBox) loader.load();
            
  
            // mostrar la ventana
            Scene scene = new Scene(ventanappal);
            
            primaryStage.setScene(scene);
            primaryStage.setTitle("prueba");// añade texto al borde de la pantalla
            primaryStage.show();
             
            
            
           
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
