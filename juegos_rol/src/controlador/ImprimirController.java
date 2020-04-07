/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.print.Pageable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author donpe
 */
public class ImprimirController implements Initializable {

    @FXML
    private ImageView img1;
    @FXML
    private ImageView img11;
    @FXML
    private ImageView img12;
    @FXML
    private ImageView img13;
    @FXML
    private Button imprimir;
    private AnchorPane FOLIO;
    @FXML
    private AnchorPane hoja;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Accion_imprimir(ActionEvent event) {
        imprimir(hoja);
    }
    
    private void imprimir(Node node){
        PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null) {
            if (job.showPrintDialog(node.getScene().getWindow())) {
                if (job.printPage(node)) {
                    job.endJob();
                }
            }
        }
        
    }
    
}
