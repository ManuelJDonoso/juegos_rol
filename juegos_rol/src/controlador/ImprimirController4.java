/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author donpe
 */
public class ImprimirController4 implements Initializable {

    @FXML
    private AnchorPane folio1;
    @FXML
    private Button b_imp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void imp(ActionEvent event) {
        imprimir(folio1);
        
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
