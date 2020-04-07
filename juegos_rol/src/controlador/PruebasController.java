/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import modelos.sub_modelos.Clan;
import modelos.sub_modelos.Meritos_Defectos;
import modelos.sub_modelos.atributo;
import modelos.sub_modelos.valor;
import modelos.sub_modelos.iniciales;

/**
 * FXML Controller class
 *
 * @author donpe
 */
public class PruebasController implements Initializable  {

    @FXML
    private ImageView img;
    @FXML
    private Label label1 ;
    @FXML
    private Label label2;
    
    ArrayList<Clan> lista_clanes=iniciales.clanes_v20();
    ArrayList<Meritos_Defectos> meritos_f=iniciales.Meritos_F();
    
    @FXML
    private ComboBox<Clan> combo;
    @FXML
    private ComboBox<Meritos_Defectos> comboM;
    @FXML
    private Label label_M;
    @FXML
    private TextArea area_m;
    @FXML
    private ComboBox<atributo> atri;
    @FXML
    private ComboBox<valor> Cvalores;
    @FXML
    private Label label_val;
   
    
   
    
    
    

    public PruebasController() {
        
      
        
        System.out.println(lista_clanes.get(0).getNombre());
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        label1.setText(lista_clanes.get(0).getNombre());
        img.setImage(lista_clanes.get(2).getInsignia());
        combo.setPromptText("selecionar clan");
        combo.getItems().addAll(lista_clanes);
        comboM.setPromptText("selecionar merito");
        comboM.getItems().addAll(meritos_f);
        Cvalores.getItems().addAll(iniciales.valores());
        atri.getItems().addAll(iniciales.Atributos_F_V20());
        
    }    

    @FXML
    private void cambio(ActionEvent event) {
   
        img.setImage(combo.getValue().getInsignia());
    }

    @FXML
    private void ComboM_A(ActionEvent event) {
        area_m.setText(comboM.getValue().getDescripcion());
        label_M.setText(comboM.getValue().getValor()+"");
    }

    @FXML
    private void atri_a(ActionEvent event) {
        area_m.setText(atri.getValue().getDescripcion());
    }

    @FXML
    private void Cvalores_a(ActionEvent event) {
        label_val.setText(Cvalores.getValue().getValor()+"");
    }
    
}
