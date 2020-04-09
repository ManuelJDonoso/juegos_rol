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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import modelos.sub_modelos.Clan;
import modelos.sub_modelos.Generacion;
import modelos.sub_modelos.atributo;
import modelos.sub_modelos.iniciales;
import modelos.sub_modelos.nat_con;

/**
 * FXML Controller class
 *
 * @author donpe
 */
public class V_Mascarada_V20_1Controller implements Initializable {

    @FXML
    private Color x2;
    @FXML
    private Font x1;
    @FXML
    private ComboBox<nat_con> CB_Naturaleza;
    @FXML
    private ComboBox<nat_con> CB_Conducta;
    @FXML
    private ComboBox<Clan> CB_Clan;
    @FXML
    private TextArea Naturaleza;
    @FXML
    private TextArea Conducta;
    @FXML
    private Color x4;
    @FXML
    private Font x3;
    @FXML
    private ComboBox<Generacion> CB_generacion;
    @FXML
    private ImageView insignia;
    @FXML
    private Label clan;
    @FXML
    private Label apodo;
    @FXML
    private Label secta;
    @FXML
    private TextArea descripcion;
    @FXML
    private TextArea des_secta;
    @FXML
    private TextArea apariencia;
    @FXML
    private TextArea refugio;
    @FXML
    private TextArea debilidad;
    @FXML
    private TextArea creacion;
    @FXML
    private Label disciplinas;
    @FXML
    private TextArea trasfondo;
    @FXML
    private TextArea organizacion;
    @FXML
    private Label RNombre;
    @FXML
    private Label RNaturaleza;
    @FXML
    private Label RConducta;
    @FXML
    private Label RConcepto;
    @FXML
    private Label Rclan;
    @FXML
    private Label RGeneracion;
    @FXML
    private AnchorPane concepto_pane;
    @FXML
    private TextField t_nombre;
    @FXML
    private TextField T_jugador;
    @FXML
    private TextField T_cronica;
    @FXML
    private TextField T_concepto;
    @FXML
    private TextField T_sire;
    @FXML
    private VBox atributos_pane;
    @FXML
    private Label atr_;
    @FXML
    private CheckBox atr_valor1_;
    @FXML
    private CheckBox atr_valor2_;
    @FXML
    private CheckBox atr_valor3_;
    @FXML
    private CheckBox atr_valor4_;
    @FXML
    private CheckBox atr_valor5_;
    @FXML
    private CheckBox atr_valor6_;
    @FXML
    private CheckBox atr_valor7_;
    @FXML
    private CheckBox atr_valor8_;
    @FXML
    private CheckBox atr_valor9_;
    @FXML
    private CheckBox atr_valor10_;

    private CheckBox nulo = new CheckBox();
    @FXML
    private Button atr_d_;
    @FXML
    private Label atr_1;
    @FXML
    private Label atr_2;
    @FXML
    private Label atr_3;
    @FXML
    private Label atr_4;
    @FXML
    private Label atr_5;
    @FXML
    private CheckBox atr_valor1_1;
    @FXML
    private CheckBox atr_valor2_1;
    @FXML
    private CheckBox atr_valor3_1;
    @FXML
    private CheckBox atr_valor4_1;
    @FXML
    private CheckBox atr_valor5_1;
    @FXML
    private CheckBox atr_valor6_1;
    @FXML
    private CheckBox atr_valor7_1;
    @FXML
    private CheckBox atr_valor8_1;
    @FXML
    private CheckBox atr_valor9_1;
    @FXML
    private CheckBox atr_valor10_1;
    @FXML
    private Button atr_d_1;
    @FXML
    private CheckBox atr_valor1_2;
    @FXML
    private CheckBox atr_valor2_2;
    @FXML
    private CheckBox atr_valor3_2;
    @FXML
    private CheckBox atr_valor4_2;
    @FXML
    private CheckBox atr_valor5_2;
    @FXML
    private CheckBox atr_valor6_2;
    @FXML
    private CheckBox atr_valor7_2;
    @FXML
    private CheckBox atr_valor8_2;
    @FXML
    private CheckBox atr_valor9_2;
    @FXML
    private CheckBox atr_valor10_2;
    @FXML
    private Button atr_d_2;
    @FXML
    private CheckBox atr_valor1_3;
    @FXML
    private CheckBox atr_valor2_3;
    @FXML
    private CheckBox atr_valor3_3;
    @FXML
    private CheckBox atr_valor4_3;
    @FXML
    private CheckBox atr_valor5_3;
    @FXML
    private CheckBox atr_valor6_3;
    @FXML
    private CheckBox atr_valor7_3;
    @FXML
    private CheckBox atr_valor8_3;
    @FXML
    private CheckBox atr_valor9_3;
    @FXML
    private CheckBox atr_valor10_3;
    @FXML
    private Button atr_d_3;
    @FXML
    private CheckBox atr_valor1_4;
    @FXML
    private CheckBox atr_valor2_4;
    @FXML
    private CheckBox atr_valor3_4;
    @FXML
    private CheckBox atr_valor4_4;
    @FXML
    private CheckBox atr_valor5_4;
    @FXML
    private CheckBox atr_valor6_4;
    @FXML
    private CheckBox atr_valor7_4;
    @FXML
    private CheckBox atr_valor8_4;
    @FXML
    private CheckBox atr_valor9_4;
    @FXML
    private CheckBox atr_valor10_4;
    @FXML
    private Button atr_d_4;
    @FXML
    private CheckBox atr_valor1_5;
    @FXML
    private CheckBox atr_valor2_5;
    @FXML
    private CheckBox atr_valor3_5;
    @FXML
    private CheckBox atr_valor4_5;
    @FXML
    private CheckBox atr_valor5_5;
    @FXML
    private CheckBox atr_valor6_5;
    @FXML
    private CheckBox atr_valor7_5;
    @FXML
    private CheckBox atr_valor8_5;
    @FXML
    private CheckBox atr_valor9_5;
    @FXML
    private CheckBox atr_valor10_5;
    @FXML
    private Button atr_d_5;
    @FXML
    private Label atr_6;
    @FXML
    private Label atr_7;
    @FXML
    private Label atr_8;
    @FXML
    private CheckBox atr_valor1_6;
    @FXML
    private CheckBox atr_valor2_6;
    @FXML
    private CheckBox atr_valor3_6;
    @FXML
    private CheckBox atr_valor4_6;
    @FXML
    private CheckBox atr_valor5_6;
    @FXML
    private CheckBox atr_valor6_6;
    @FXML
    private CheckBox atr_valor7_6;
    @FXML
    private CheckBox atr_valor8_6;
    @FXML
    private CheckBox atr_valor9_6;
    @FXML
    private CheckBox atr_valor10_6;
    @FXML
    private Button atr_d_6;
    @FXML
    private CheckBox atr_valor1_7;
    @FXML
    private CheckBox atr_valor2_7;
    @FXML
    private CheckBox atr_valor3_7;
    @FXML
    private CheckBox atr_valor4_7;
    @FXML
    private CheckBox atr_valor5_7;
    @FXML
    private CheckBox atr_valor6_7;
    @FXML
    private CheckBox atr_valor7_7;
    @FXML
    private CheckBox atr_valor8_7;
    @FXML
    private CheckBox atr_valor9_7;
    @FXML
    private CheckBox atr_valor10_7;
    @FXML
    private Button atr_d_7;
    @FXML
    private CheckBox atr_valor1_8;
    @FXML
    private CheckBox atr_valor2_8;
    @FXML
    private CheckBox atr_valor3_8;
    @FXML
    private CheckBox atr_valor4_8;
    @FXML
    private CheckBox atr_valor5_8;
    @FXML
    private CheckBox atr_valor6_8;
    @FXML
    private CheckBox atr_valor7_8;
    @FXML
    private CheckBox atr_valor8_8;
    @FXML
    private CheckBox atr_valor9_8;
    @FXML
    private CheckBox atr_valor10_8;
    @FXML
    private Button atr_d_8;
    @FXML
    private Label R_atr_;
    @FXML
    private Label R_atr_1;
    @FXML
    private Label R_atr_2;
    @FXML
    private Label R_atr_3;
    @FXML
    private Label R_atr_4;
    @FXML
    private Label R_atr_5;
    @FXML
    private Label RV_atr_;
    @FXML
    private Label RV_atr_1;
    @FXML
    private Label RV_atr_2;
    @FXML
    private Label RV_atr_3;
    @FXML
    private Label RV_atr_4;
    @FXML
    private Label RV_atr_5;
    @FXML
    private Label R_atr_6;
    @FXML
    private Label R_atr_7;
    @FXML
    private Label R_atr_8;
    @FXML
    private Label RV_atr_6;
    @FXML
    private Label RV_atr_7;
    @FXML
    private Label RV_atr_8;

    private ArrayList<atributo> fisicos = iniciales.Atributos_F_V20();
    private ArrayList<atributo> sociales = iniciales.Atributos_S_V20();
    private ArrayList<atributo> mentales = iniciales.Atributos_M_V20();

    @FXML
    private TextArea atr_area;
    @FXML
    private VBox Habilidades_pane;
    @FXML
    private TextArea atr_area1;
    @FXML
    private Button hab_d_;
    @FXML
    private Label hab_1;
    @FXML
    private CheckBox hab_valor1_;
    @FXML
    private CheckBox hab_valor2_;
    @FXML
    private CheckBox hab_valor3_;
    @FXML
    private CheckBox hab_valor4_;
    @FXML
    private CheckBox hab_valor5_;
    @FXML
    private CheckBox hab_valor6_;
    @FXML
    private CheckBox hab_valor7_;
    @FXML
    private CheckBox hab_valor8_;
    @FXML
    private CheckBox hab_valor9_;
    @FXML
    private CheckBox hab_valor10_;
    @FXML
    private CheckBox hab_valor1_1;
    @FXML
    private CheckBox hab_valor2_1;
    @FXML
    private CheckBox hab_valor3_1;
    @FXML
    private CheckBox hab_valor4_1;
    @FXML
    private CheckBox hab_valor5_1;
    @FXML
    private CheckBox hab_valor6_1;
    @FXML
    private CheckBox hab_valor7_1;
    @FXML
    private CheckBox hab_valor8_1;
    @FXML
    private CheckBox hab_valor9_1;
    @FXML
    private CheckBox hab_valor10_1;
    @FXML
    private CheckBox hab_valor1_2;
    @FXML
    private CheckBox hab_valor2_2;
    @FXML
    private CheckBox hab_valor3_2;
    @FXML
    private CheckBox hab_valor4_2;
    @FXML
    private CheckBox hab_valor5_2;
    @FXML
    private CheckBox hab_valor6_2;
    @FXML
    private CheckBox hab_valor7_2;
    @FXML
    private CheckBox hab_valor8_2;
    @FXML
    private CheckBox hab_valor9_2;
    @FXML
    private CheckBox hab_valor10_2;
    @FXML
    private CheckBox hab_valor1_3;
    @FXML
    private CheckBox hab_valor2_3;
    @FXML
    private CheckBox hab_valor3_3;
    @FXML
    private CheckBox hab_valor4_3;
    @FXML
    private CheckBox hab_valor5_3;
    @FXML
    private CheckBox hab_valor6_3;
    @FXML
    private CheckBox hab_valor7_3;
    @FXML
    private CheckBox hab_valor8_3;
    @FXML
    private CheckBox hab_valor9_3;
    @FXML
    private CheckBox hab_valor10_3;
    @FXML
    private CheckBox hab_valor1_4;
    @FXML
    private CheckBox hab_valor2_4;
    @FXML
    private CheckBox hab_valor3_4;
    @FXML
    private CheckBox hab_valor4_4;
    @FXML
    private CheckBox hab_valor5_4;
    @FXML
    private CheckBox hab_valor6_4;
    @FXML
    private CheckBox hab_valor7_4;
    @FXML
    private CheckBox hab_valor8_4;
    @FXML
    private CheckBox hab_valor9_4;
    @FXML
    private CheckBox hab_valor10_4;
    @FXML
    private CheckBox hab_valor1_5;
    @FXML
    private CheckBox hab_valor2_5;
    @FXML
    private CheckBox hab_valor3_5;
    @FXML
    private CheckBox hab_valor4_5;
    @FXML
    private CheckBox hab_valor5_5;
    @FXML
    private CheckBox hab_valor6_5;
    @FXML
    private CheckBox hab_valor7_5;
    @FXML
    private CheckBox hab_valor8_5;
    @FXML
    private CheckBox hab_valor9_5;
    @FXML
    private CheckBox hab_valor10_5;
    @FXML
    private CheckBox hab_valor1_6;
    @FXML
    private CheckBox hab_valor2_6;
    @FXML
    private CheckBox hab_valor3_6;
    @FXML
    private CheckBox hab_valor4_6;
    @FXML
    private CheckBox hab_valor5_6;
    @FXML
    private CheckBox hab_valor6_6;
    @FXML
    private CheckBox hab_valor7_6;
    @FXML
    private CheckBox hab_valor8_6;
    @FXML
    private CheckBox hab_valor9_6;
    @FXML
    private CheckBox hab_valor10_6;
    @FXML
    private CheckBox hab_valor1_7;
    @FXML
    private CheckBox hab_valor2_7;
    @FXML
    private CheckBox hab_valor3_7;
    @FXML
    private CheckBox hab_valor4_7;
    @FXML
    private CheckBox hab_valor5_7;
    @FXML
    private CheckBox hab_valor6_7;
    @FXML
    private CheckBox hab_valor7_7;
    @FXML
    private CheckBox hab_valor8_7;
    @FXML
    private CheckBox hab_valor9_7;
    @FXML
    private CheckBox hab_valor10_7;
    @FXML
    private CheckBox hab_valor1_8;
    @FXML
    private CheckBox hab_valor2_8;
    @FXML
    private CheckBox hab_valor3_8;
    @FXML
    private CheckBox hab_valor4_8;
    @FXML
    private CheckBox hab_valor5_8;
    @FXML
    private CheckBox hab_valor6_8;
    @FXML
    private CheckBox hab_valor7_8;
    @FXML
    private CheckBox hab_valor8_8;
    @FXML
    private CheckBox hab_valor9_8;
    @FXML
    private CheckBox hab_valor10_8;
    @FXML
    private CheckBox hab_valor1_9;
    @FXML
    private CheckBox hab_valor2_9;
    @FXML
    private CheckBox hab_valor3_9;
    @FXML
    private CheckBox hab_valor4_9;
    @FXML
    private CheckBox hab_valor5_9;
    @FXML
    private CheckBox hab_valor6_9;
    @FXML
    private CheckBox hab_valor7_9;
    @FXML
    private CheckBox hab_valor8_9;
    @FXML
    private CheckBox hab_valor9_9;
    @FXML
    private CheckBox hab_valor10_9;
    @FXML
    private Label hab_11;
    @FXML
    private Label hab_12;
    @FXML
    private Label hab_13;
    @FXML
    private Label hab_14;
    @FXML
    private Label hab_15;
    @FXML
    private Label hab_16;
    @FXML
    private Label hab_17;
    @FXML
    private Label hab_18;
    @FXML
    private Label hab_19;
    @FXML
    private Button hab_d_1;
    @FXML
    private Button hab_d_2;
    @FXML
    private Button hab_d_3;
    @FXML
    private Button hab_d_4;
    @FXML
    private Button hab_d_5;
    @FXML
    private Button hab_d_6;
    @FXML
    private Button hab_d_7;
    @FXML
    private Button hab_d_8;
    @FXML
    private Button hab_d_9;
    @FXML
    private CheckBox hab_valor1_10;
    @FXML
    private CheckBox hab_valor2_10;
    @FXML
    private CheckBox hab_valor3_10;
    @FXML
    private CheckBox hab_valor4_10;
    @FXML
    private CheckBox hab_valor5_10;
    @FXML
    private CheckBox hab_valor6_10;
    @FXML
    private CheckBox hab_valor7_10;
    @FXML
    private CheckBox hab_valor8_10;
    @FXML
    private CheckBox hab_valor9_10;
    @FXML
    private CheckBox hab_valor10_10;
    @FXML
    private CheckBox hab_valor1_11;
    @FXML
    private CheckBox hab_valor2_11;
    @FXML
    private CheckBox hab_valor3_11;
    @FXML
    private CheckBox hab_valor4_11;
    @FXML
    private CheckBox hab_valor5_11;
    @FXML
    private CheckBox hab_valor6_11;
    @FXML
    private CheckBox hab_valor7_11;
    @FXML
    private CheckBox hab_valor8_11;
    @FXML
    private CheckBox hab_valor9_11;
    @FXML
    private CheckBox hab_valor10_11;
    @FXML
    private CheckBox hab_valor1_12;
    @FXML
    private CheckBox hab_valor2_12;
    @FXML
    private CheckBox hab_valor3_12;
    @FXML
    private CheckBox hab_valor4_12;
    @FXML
    private CheckBox hab_valor5_12;
    @FXML
    private CheckBox hab_valor6_12;
    @FXML
    private CheckBox hab_valor7_12;
    @FXML
    private CheckBox hab_valor8_12;
    @FXML
    private CheckBox hab_valor9_12;
    @FXML
    private CheckBox hab_valor10_12;
    @FXML
    private CheckBox hab_valor1_13;
    @FXML
    private CheckBox hab_valor2_13;
    @FXML
    private CheckBox hab_valor3_13;
    @FXML
    private CheckBox hab_valor4_13;
    @FXML
    private CheckBox hab_valor5_13;
    @FXML
    private CheckBox hab_valor6_13;
    @FXML
    private CheckBox hab_valor7_13;
    @FXML
    private CheckBox hab_valor8_13;
    @FXML
    private CheckBox hab_valor9_13;
    @FXML
    private CheckBox hab_valor10_13;
    @FXML
    private CheckBox hab_valor1_14;
    @FXML
    private CheckBox hab_valor2_14;
    @FXML
    private CheckBox hab_valor3_14;
    @FXML
    private CheckBox hab_valor4_14;
    @FXML
    private CheckBox hab_valor5_14;
    @FXML
    private CheckBox hab_valor6_14;
    @FXML
    private CheckBox hab_valor7_14;
    @FXML
    private CheckBox hab_valor8_14;
    @FXML
    private CheckBox hab_valor9_14;
    @FXML
    private CheckBox hab_valor10_14;
    @FXML
    private CheckBox hab_valor1_15;
    @FXML
    private CheckBox hab_valor2_15;
    @FXML
    private CheckBox hab_valor3_15;
    @FXML
    private CheckBox hab_valor4_15;
    @FXML
    private CheckBox hab_valor5_15;
    @FXML
    private CheckBox hab_valor6_15;
    @FXML
    private CheckBox hab_valor7_15;
    @FXML
    private CheckBox hab_valor8_15;
    @FXML
    private CheckBox hab_valor9_15;
    @FXML
    private CheckBox hab_valor10_15;
    @FXML
    private CheckBox hab_valor1_16;
    @FXML
    private CheckBox hab_valor2_16;
    @FXML
    private CheckBox hab_valor3_16;
    @FXML
    private CheckBox hab_valor4_16;
    @FXML
    private CheckBox hab_valor5_16;
    @FXML
    private CheckBox hab_valor6_16;
    @FXML
    private CheckBox hab_valor7_16;
    @FXML
    private CheckBox hab_valor8_16;
    @FXML
    private CheckBox hab_valor9_16;
    @FXML
    private CheckBox hab_valor10_16;
    @FXML
    private CheckBox hab_valor1_17;
    @FXML
    private CheckBox hab_valor2_17;
    @FXML
    private CheckBox hab_valor3_17;
    @FXML
    private CheckBox hab_valor4_17;
    @FXML
    private CheckBox hab_valor5_17;
    @FXML
    private CheckBox hab_valor6_17;
    @FXML
    private CheckBox hab_valor7_17;
    @FXML
    private CheckBox hab_valor8_17;
    @FXML
    private CheckBox hab_valor9_17;
    @FXML
    private CheckBox hab_valor10_17;
    @FXML
    private CheckBox hab_valor1_18;
    @FXML
    private CheckBox hab_valor2_18;
    @FXML
    private CheckBox hab_valor3_18;
    @FXML
    private CheckBox hab_valor4_18;
    @FXML
    private CheckBox hab_valor5_18;
    @FXML
    private CheckBox hab_valor6_18;
    @FXML
    private CheckBox hab_valor7_18;
    @FXML
    private CheckBox hab_valor8_18;
    @FXML
    private CheckBox hab_valor9_18;
    @FXML
    private CheckBox hab_valor10_18;
    @FXML
    private CheckBox hab_valor1_19;
    @FXML
    private CheckBox hab_valor2_19;
    @FXML
    private CheckBox hab_valor3_19;
    @FXML
    private CheckBox hab_valor4_19;
    @FXML
    private CheckBox hab_valor5_19;
    @FXML
    private CheckBox hab_valor6_19;
    @FXML
    private CheckBox hab_valor7_19;
    @FXML
    private CheckBox hab_valor8_19;
    @FXML
    private CheckBox hab_valor9_19;
    @FXML
    private CheckBox hab_valor10_19;
    @FXML
    private Label hab_110;
    @FXML
    private Label hab_111;
    @FXML
    private Label hab_112;
    @FXML
    private Label hab_113;
    @FXML
    private Label hab_114;
    @FXML
    private Label hab_115;
    @FXML
    private Label hab_116;
    @FXML
    private Label hab_117;
    @FXML
    private Label hab_118;
    @FXML
    private Label hab_119;
    @FXML
    private Button hab_d_10;
    @FXML
    private Button hab_d_11;
    @FXML
    private Button hab_d_12;
    @FXML
    private Button hab_d_13;
    @FXML
    private Button hab_d_14;
    @FXML
    private Button hab_d_15;
    @FXML
    private Button hab_d_16;
    @FXML
    private Button hab_d_17;
    @FXML
    private Button hab_d_18;
    @FXML
    private Button hab_d_19;
    @FXML
    private CheckBox hab_valor1_20;
    @FXML
    private CheckBox hab_valor2_20;
    @FXML
    private CheckBox hab_valor3_20;
    @FXML
    private CheckBox hab_valor4_20;
    @FXML
    private CheckBox hab_valor5_20;
    @FXML
    private CheckBox hab_valor6_20;
    @FXML
    private CheckBox hab_valor7_20;
    @FXML
    private CheckBox hab_valor8_20;
    @FXML
    private CheckBox hab_valor9_20;
    @FXML
    private CheckBox hab_valor10_20;
    @FXML
    private CheckBox hab_valor1_21;
    @FXML
    private CheckBox hab_valor2_21;
    @FXML
    private CheckBox hab_valor3_21;
    @FXML
    private CheckBox hab_valor4_21;
    @FXML
    private CheckBox hab_valor5_21;
    @FXML
    private CheckBox hab_valor6_21;
    @FXML
    private CheckBox hab_valor7_21;
    @FXML
    private CheckBox hab_valor8_21;
    @FXML
    private CheckBox hab_valor9_21;
    @FXML
    private CheckBox hab_valor10_21;
    @FXML
    private CheckBox hab_valor1_22;
    @FXML
    private CheckBox hab_valor2_22;
    @FXML
    private CheckBox hab_valor3_22;
    @FXML
    private CheckBox hab_valor4_22;
    @FXML
    private CheckBox hab_valor5_22;
    @FXML
    private CheckBox hab_valor6_22;
    @FXML
    private CheckBox hab_valor7_22;
    @FXML
    private CheckBox hab_valor8_22;
    @FXML
    private CheckBox hab_valor9_22;
    @FXML
    private CheckBox hab_valor10_22;
    @FXML
    private CheckBox hab_valor1_23;
    @FXML
    private CheckBox hab_valor2_23;
    @FXML
    private CheckBox hab_valor3_23;
    @FXML
    private CheckBox hab_valor4_23;
    @FXML
    private CheckBox hab_valor5_23;
    @FXML
    private CheckBox hab_valor6_23;
    @FXML
    private CheckBox hab_valor7_23;
    @FXML
    private CheckBox hab_valor8_23;
    @FXML
    private CheckBox hab_valor9_23;
    @FXML
    private CheckBox hab_valor10_23;
    @FXML
    private CheckBox hab_valor1_24;
    @FXML
    private CheckBox hab_valor2_24;
    @FXML
    private CheckBox hab_valor3_24;
    @FXML
    private CheckBox hab_valor4_24;
    @FXML
    private CheckBox hab_valor5_24;
    @FXML
    private CheckBox hab_valor6_24;
    @FXML
    private CheckBox hab_valor7_24;
    @FXML
    private CheckBox hab_valor8_24;
    @FXML
    private CheckBox hab_valor9_24;
    @FXML
    private CheckBox hab_valor10_24;
    @FXML
    private CheckBox hab_valor1_25;
    @FXML
    private CheckBox hab_valor2_25;
    @FXML
    private CheckBox hab_valor3_25;
    @FXML
    private CheckBox hab_valor4_25;
    @FXML
    private CheckBox hab_valor5_25;
    @FXML
    private CheckBox hab_valor6_25;
    @FXML
    private CheckBox hab_valor7_25;
    @FXML
    private CheckBox hab_valor8_25;
    @FXML
    private CheckBox hab_valor9_25;
    @FXML
    private CheckBox hab_valor10_25;
    @FXML
    private CheckBox hab_valor1_26;
    @FXML
    private CheckBox hab_valor2_26;
    @FXML
    private CheckBox hab_valor3_26;
    @FXML
    private CheckBox hab_valor4_26;
    @FXML
    private CheckBox hab_valor5_26;
    @FXML
    private CheckBox hab_valor6_26;
    @FXML
    private CheckBox hab_valor7_26;
    @FXML
    private CheckBox hab_valor8_26;
    @FXML
    private CheckBox hab_valor9_26;
    @FXML
    private CheckBox hab_valor10_26;
    @FXML
    private CheckBox hab_valor1_27;
    @FXML
    private CheckBox hab_valor2_27;
    @FXML
    private CheckBox hab_valor3_27;
    @FXML
    private CheckBox hab_valor4_27;
    @FXML
    private CheckBox hab_valor5_27;
    @FXML
    private CheckBox hab_valor6_27;
    @FXML
    private CheckBox hab_valor7_27;
    @FXML
    private CheckBox hab_valor8_27;
    @FXML
    private CheckBox hab_valor9_27;
    @FXML
    private CheckBox hab_valor10_27;
    @FXML
    private CheckBox hab_valor1_28;
    @FXML
    private CheckBox hab_valor2_28;
    @FXML
    private CheckBox hab_valor3_28;
    @FXML
    private CheckBox hab_valor4_28;
    @FXML
    private CheckBox hab_valor5_28;
    @FXML
    private CheckBox hab_valor6_28;
    @FXML
    private CheckBox hab_valor7_28;
    @FXML
    private CheckBox hab_valor8_28;
    @FXML
    private CheckBox hab_valor9_28;
    @FXML
    private CheckBox hab_valor10_28;
    @FXML
    private CheckBox hab_valor1_29;
    @FXML
    private CheckBox hab_valor2_29;
    @FXML
    private CheckBox hab_valor3_29;
    @FXML
    private CheckBox hab_valor4_29;
    @FXML
    private CheckBox hab_valor5_29;
    @FXML
    private CheckBox hab_valor6_29;
    @FXML
    private CheckBox hab_valor7_29;
    @FXML
    private CheckBox hab_valor8_29;
    @FXML
    private CheckBox hab_valor9_29;
    @FXML
    private CheckBox hab_valor10_29;
    @FXML
    private Label hab_120;
    @FXML
    private Label hab_121;
    @FXML
    private Label hab_122;
    @FXML
    private Label hab_123;
    @FXML
    private Label hab_124;
    @FXML
    private Label hab_125;
    @FXML
    private Label hab_126;
    @FXML
    private Label hab_127;
    @FXML
    private Label hab_128;
    @FXML
    private Label hab_129;
    @FXML
    private Button hab_d_20;
    @FXML
    private Button hab_d_21;
    @FXML
    private Button hab_d_22;
    @FXML
    private Button hab_d_23;
    @FXML
    private Button hab_d_24;
    @FXML
    private Button hab_d_25;
    @FXML
    private Button hab_d_26;
    @FXML
    private Button hab_d_27;
    @FXML
    private Button hab_d_28;
    @FXML
    private Button hab_d_29;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        nulo.setSelected(false);
        CB_Clan.getItems().addAll(iniciales.clanes_v20());
        CB_Conducta.getItems().addAll(iniciales.naturalezas_conducta_V20());
        CB_Naturaleza.getItems().addAll(iniciales.naturalezas_conducta_V20());
        CB_generacion.getItems().addAll(iniciales.Generacion_V20());
        CB_Clan.setPromptText("selecionar clan");
        CB_Conducta.setPromptText("selecionar Conducta");
        CB_Naturaleza.setPromptText("selecionar Naturaleza");
        CB_generacion.getSelectionModel().select(10);
        RGeneracion.setText(CB_generacion.getValue().getNombre());
        atr_.setText(fisicos.get(0).getNombre());
        atr_1.setText(fisicos.get(1).getNombre());
        atr_2.setText(fisicos.get(2).getNombre());
        R_atr_.setText(fisicos.get(0).getNombre());
        R_atr_1.setText(fisicos.get(1).getNombre());
        R_atr_2.setText(fisicos.get(2).getNombre());
        atr_3.setText(sociales.get(0).getNombre());
        atr_4.setText(sociales.get(1).getNombre());
        atr_5.setText(sociales.get(2).getNombre());
        R_atr_3.setText(sociales.get(0).getNombre());
        R_atr_4.setText(sociales.get(1).getNombre());
        R_atr_5.setText(sociales.get(2).getNombre());
        atr_6.setText(mentales.get(0).getNombre());
        atr_7.setText(mentales.get(1).getNombre());
        atr_8.setText(mentales.get(2).getNombre());
        R_atr_6.setText(mentales.get(0).getNombre());
        R_atr_7.setText(mentales.get(1).getNombre());
        R_atr_8.setText(mentales.get(2).getNombre());
        atr_valor1_.setSelected(true);
        atr_valor1_1.setSelected(true);
        atr_valor1_2.setSelected(true);
        atr_valor1_3.setSelected(true);
        atr_valor1_4.setSelected(true);
        atr_valor1_5.setSelected(true);
        atr_valor1_6.setSelected(true);
        atr_valor1_7.setSelected(true);
         atr_valor1_8.setSelected(true);
        atr_valor1_(new ActionEvent());
        atr_valor1_1(new ActionEvent());
        atr_valor1_2(new ActionEvent());
        atr_valor1_3(new ActionEvent());
        atr_valor1_4(new ActionEvent());
        atr_valor1_5(new ActionEvent());
        atr_valor1_6(new ActionEvent());
        atr_valor1_7(new ActionEvent());
        atr_valor1_8(new ActionEvent());
       
    }

    /* -----------------------------------------------------------------------------------------------------------------------------------
        ----------------------------------------AGRUPAR CHECKBOX--------------------------------------------------------------------------------
        ------------------------------------------------------------------------------------------------------------------------------------*/
    private void valor1(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;
        if (ckbox1.isSelected()) {
            ckbox2.setSelected(false);
            ckbox3.setSelected(false);
            ckbox4.setSelected(false);
            ckbox5.setSelected(false);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 1;

        } else if (!ckbox1.isSelected() && ckbox2.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(false);
            ckbox3.setSelected(false);
            ckbox4.setSelected(false);
            ckbox5.setSelected(false);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 1;

        } else {
            variable = 0;

        }

        atr.get(pos).setValor(variable);
        r.setText(atr.get(pos).getValor() + "");
    }

    private void valor2(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;

        if (ckbox2.isSelected()) {
            ckbox1.setSelected(true);
            ckbox3.setSelected(false);
            ckbox4.setSelected(false);
            ckbox5.setSelected(false);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 2;

        } else if (!ckbox2.isSelected() && ckbox3.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(false);
            ckbox4.setSelected(false);
            ckbox5.setSelected(false);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 2;

        } else {
            variable = 1;

        }

        atr.get(pos).setValor(variable);

        r.setText(atr.get(pos).getValor() + "");
    }

    private void valor3(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;
        if (ckbox3.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox4.setSelected(false);
            ckbox5.setSelected(false);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 3;

        } else if (!ckbox3.isSelected() && ckbox4.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(false);
            ckbox5.setSelected(false);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 3;

        } else {
            variable = 2;

        }

        atr.get(pos).setValor(variable);
        r.setText(atr.get(pos).getValor() + "");
    }

    private void valor4(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;
        if (ckbox4.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox5.setSelected(false);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 4;

        } else if (!ckbox4.isSelected() && ckbox5.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(false);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 4;

        } else {
            variable = 3;

        }

        atr.get(pos).setValor(variable);
        r.setText(atr.get(pos).getValor() + "");
    }

    private void valor5(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;
        if (ckbox5.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 5;

        } else if (!ckbox5.isSelected() && ckbox6.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(false);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 5;

        } else {
            variable = 4;

        }

        atr.get(pos).setValor(variable);
        r.setText(atr.get(pos).getValor() + "");
    }

    private void valor6(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;
        if (ckbox6.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 6;

        } else if (!ckbox6.isSelected() && ckbox7.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(true);
            ckbox7.setSelected(false);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 6;

        } else {
            variable = 5;

        }

        atr.get(pos).setValor(variable);
        r.setText(atr.get(pos).getValor() + "");
    }

    private void valor7(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;
        if (ckbox7.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(true);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 7;

        } else if (!ckbox7.isSelected() && ckbox8.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(true);
            ckbox7.setSelected(true);
            ckbox8.setSelected(false);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 7;

        } else {
            variable = 6;

        }

        atr.get(pos).setValor(variable);
        r.setText(atr.get(pos).getValor() + "");
    }

    private void valor8(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;
        if (ckbox8.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(true);
            ckbox7.setSelected(true);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 8;

        } else if (!ckbox8.isSelected() && ckbox9.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(true);
            ckbox7.setSelected(true);
            ckbox8.setSelected(true);
            ckbox9.setSelected(false);
            ckbox10.setSelected(false);
            variable = 8;

        } else {
            variable = 7;

        }

        atr.get(pos).setValor(variable);
        r.setText(atr.get(pos).getValor() + "");
    }

    private void valor9(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;
        if (ckbox9.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(true);
            ckbox7.setSelected(true);
            ckbox8.setSelected(true);
            ckbox10.setSelected(false);
            variable = 9;

        } else if (!ckbox9.isSelected() && ckbox10.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(true);
            ckbox7.setSelected(true);
            ckbox8.setSelected(true);
            ckbox9.setSelected(true);
            ckbox10.setSelected(false);
            variable = 9;

        } else {
            variable = 8;

        }

        atr.get(pos).setValor(variable);
        r.setText(atr.get(pos).getValor() + "");
    }

    private void valor10(ArrayList<atributo> atr, int pos, Label r, CheckBox ckbox1, CheckBox ckbox2, CheckBox ckbox3, CheckBox ckbox4, CheckBox ckbox5, CheckBox ckbox6, CheckBox ckbox7, CheckBox ckbox8, CheckBox ckbox9, CheckBox ckbox10) {
        int variable = 0;
        if (ckbox10.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(true);
            ckbox7.setSelected(true);
            ckbox8.setSelected(true);
            ckbox9.setSelected(true);
            variable = 10;

        } else if (!ckbox10.isSelected() && nulo.isSelected()) {
            ckbox1.setSelected(true);
            ckbox2.setSelected(true);
            ckbox3.setSelected(true);
            ckbox4.setSelected(true);
            ckbox5.setSelected(true);
            ckbox6.setSelected(true);
            ckbox7.setSelected(true);
            ckbox8.setSelected(true);
            ckbox9.setSelected(true);
            ckbox10.setSelected(true);
            variable = 10;

        } else {
            variable = 9;

        }

        atr.get(pos).setValor(variable);
        r.setText(atr.get(pos).getValor() + "");
    }

     
    /* -----------------------------------------------------------------------------------------------------------------------------------
        ----------------------------------------BOTON CONSULTA--------------------------------------------------------------------------------
        ------------------------------------------------------------------------------------------------------------------------------------*/
    
    private void boton_atr(ArrayList<atributo> atr,int posicion,TextArea area){
        area.setText(atr.get(posicion).getDescripcion());
    }
    
        /* -----------------------------------------------------------------------------------------------------------------------------------
        ----------------------------------------AGRUPAR CHECKBOX--------------------------------------------------------------------------------
        ------------------------------------------------------------------------------------------------------------------------------------*/
    @FXML
    private void bt_concepto(ActionEvent event) {
        concepto_pane.setVisible(true);
        atributos_pane.setVisible(false);
        Habilidades_pane.setVisible(false);
    }

    @FXML
    private void bt_atributos(ActionEvent event) {
        concepto_pane.setVisible(false);
        atributos_pane.setVisible(true);
        Habilidades_pane.setVisible(false);
    }

    @FXML
    private void bt_habilidades(ActionEvent event) {
        concepto_pane.setVisible(false);
        atributos_pane.setVisible(false);
        Habilidades_pane.setVisible(true);
    }

    @FXML
    private void bt_ventajas(ActionEvent event) {
        concepto_pane.setVisible(false);
        atributos_pane.setVisible(false);
        Habilidades_pane.setVisible(false);
    }

    @FXML
    private void bt_toques_finales(ActionEvent event) {
        concepto_pane.setVisible(false);
        atributos_pane.setVisible(false);
        Habilidades_pane.setVisible(false);
    }

    @FXML
    private void CB_Naturaleza(ActionEvent event) {
        Naturaleza.setText(CB_Naturaleza.getValue().getDescripcion());
        RNaturaleza.setText(CB_Naturaleza.getValue().getNombre());
    }

    @FXML
    private void CB_Conducta(ActionEvent event) {
        Conducta.setText(CB_Conducta.getValue().getDescripcion());
        RConducta.setText(CB_Conducta.getValue().getNombre());
    }

    @FXML
    private void CB_Clan(ActionEvent event) {
        Rclan.setText(CB_Clan.getValue().getNombre());
        clan.setText(CB_Clan.getValue().getNombre());
        apodo.setText(CB_Clan.getValue().getApodo());
        secta.setText(CB_Clan.getValue().getSecta());
        descripcion.setText(CB_Clan.getValue().getDescripcion());
        des_secta.setText(CB_Clan.getValue().getSecta_des());
        apariencia.setText(CB_Clan.getValue().getApariencia());
        refugio.setText(CB_Clan.getValue().getRefugio());
        debilidad.setText(CB_Clan.getValue().getDebilidad());
        creacion.setText(CB_Clan.getValue().getCreacion());
        disciplinas.setText(CB_Clan.getValue().getDisciplina(0) + " , " + CB_Clan.getValue().getDisciplina(1) + " , " + CB_Clan.getValue().getDisciplina(2));
        trasfondo.setText(CB_Clan.getValue().getTrasfondo());
        organizacion.setText(CB_Clan.getValue().getOrganizacion());
        insignia.setImage(CB_Clan.getValue().getInsignia());

    }

    @FXML
    private void CB_Generacion(ActionEvent event) {
        RGeneracion.setText(CB_generacion.getValue().getNombre());
    }

    @FXML
    private void atr_valor1_(ActionEvent event) {
        valor1(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);
        ;
    }

    @FXML
    private void atr_valor2_(ActionEvent event) {

        valor2(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);

    }

    @FXML
    private void atr_valor3_(ActionEvent event) {
        valor3(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);
    }

    @FXML
    private void atr_valor4_(ActionEvent event) {
        valor4(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);
    }

    @FXML
    private void atr_valor5_(ActionEvent event) {
        valor5(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);
    }

    @FXML
    private void atr_valor6_(ActionEvent event) {
        valor6(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);
    }

    @FXML
    private void atr_valor7_(ActionEvent event) {
        valor7(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);
    }

    @FXML
    private void atr_valor8_(ActionEvent event) {
        valor8(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);
    }

    @FXML
    private void atr_valor9_(ActionEvent event) {
        valor9(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);
    }

    @FXML
    private void atr_valor10_(ActionEvent event) {
        valor10(fisicos, 0, RV_atr_, atr_valor1_, atr_valor2_, atr_valor3_, atr_valor4_, atr_valor5_, atr_valor6_, atr_valor7_, atr_valor8_, atr_valor9_, atr_valor10_);
    }

    @FXML
    private void atr_d_(ActionEvent event) {
        boton_atr(fisicos, 0, atr_area);
    }

    @FXML
    private void atr_valor1_1(ActionEvent event) {
        valor1(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_valor2_1(ActionEvent event) {
        valor2(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_valor3_1(ActionEvent event) {
        valor3(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_valor4_1(ActionEvent event) {
        valor4(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_valor5_1(ActionEvent event) {
        valor5(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_valor6_1(ActionEvent event) {
        valor6(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_valor7_1(ActionEvent event) {
        valor7(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_valor8_1(ActionEvent event) {
        valor8(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_valor9_1(ActionEvent event) {
        valor9(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_valor10_1(ActionEvent event) {
        valor10(fisicos, 1, RV_atr_1, atr_valor1_1, atr_valor2_1, atr_valor3_1, atr_valor4_1, atr_valor5_1, atr_valor6_1, atr_valor7_1, atr_valor8_1, atr_valor9_1, atr_valor10_1);
        ;
    }

    @FXML
    private void atr_d_1(ActionEvent event) {
        boton_atr(fisicos, 1, atr_area);
    }

    @FXML
    private void atr_valor1_2(ActionEvent event) {
        valor1(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void atr_valor3_2(ActionEvent event) {
        valor3(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void atr_valor4_2(ActionEvent event) {
        valor4(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void atr_valor5_2(ActionEvent event) {
        valor5(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void atr_valor6_2(ActionEvent event) {
        valor6(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void atr_valor7_2(ActionEvent event) {
        valor7(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void atr_valor9_2(ActionEvent event) {
        valor9(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void atr_valor10_2(ActionEvent event) {
        valor10(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void atr_d_2(ActionEvent event) {
        boton_atr(fisicos, 2, atr_area);
    }

    @FXML
    private void atr_valor1_3(ActionEvent event) {
        valor1(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_valor2_3(ActionEvent event) {
        valor2(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_valor3_3(ActionEvent event) {
        valor3(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_valor4_3(ActionEvent event) {
        valor4(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_valor5_3(ActionEvent event) {
        valor5(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_valor6_3(ActionEvent event) {
        valor6(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_valor7_3(ActionEvent event) {
        valor7(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_valor8_3(ActionEvent event) {
        valor8(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_valor9_3(ActionEvent event) {
        valor9(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_valor10_3(ActionEvent event) {
        valor10(sociales, 0, RV_atr_3, atr_valor1_3, atr_valor2_3, atr_valor3_3, atr_valor4_3, atr_valor5_3, atr_valor6_3, atr_valor7_3, atr_valor8_3, atr_valor9_3, atr_valor10_3);
        ;
    }

    @FXML
    private void atr_d_3(ActionEvent event) {
    boton_atr(sociales, 0, atr_area);
    }

    @FXML
    private void atr_valor1_4(ActionEvent event) {
        valor1(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_valor2_4(ActionEvent event) {
        valor2(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_valor3_4(ActionEvent event) {
        valor3(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_valor4_4(ActionEvent event) {
        valor4(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_valor5_4(ActionEvent event) {
        valor5(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_valor6_4(ActionEvent event) {
        valor6(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_valor7_4(ActionEvent event) {
        valor7(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_valor8_4(ActionEvent event) {
        valor8(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_valor9_4(ActionEvent event) {
        valor9(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_valor10_4(ActionEvent event) {
        valor10(sociales, 1, RV_atr_4, atr_valor1_4, atr_valor2_4, atr_valor3_4, atr_valor4_4, atr_valor5_4, atr_valor6_4, atr_valor7_4, atr_valor8_4, atr_valor9_4, atr_valor10_4);
        ;
    }

    @FXML
    private void atr_d_4(ActionEvent event) {
    boton_atr(sociales, 1, atr_area); }

    @FXML
    private void atr_valor1_5(ActionEvent event) {
        valor1(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_valor2_5(ActionEvent event) {
        valor2(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_valor3_5(ActionEvent event) {
        valor3(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_valor4_5(ActionEvent event) {
        valor4(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_valor5_5(ActionEvent event) {
        valor5(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_valor6_5(ActionEvent event) {
        valor6(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_valor7_5(ActionEvent event) {
        valor7(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_valor8_5(ActionEvent event) {
        valor8(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_valor9_5(ActionEvent event) {
        valor9(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_valor10_5(ActionEvent event) {
        valor10(sociales, 2, RV_atr_5, atr_valor1_5, atr_valor2_5, atr_valor3_5, atr_valor4_5, atr_valor5_5, atr_valor6_5, atr_valor7_5, atr_valor8_5, atr_valor9_5, atr_valor10_5);
        ;
    }

    @FXML
    private void atr_d_5(ActionEvent event) {
     boton_atr(sociales, 2, atr_area);}

    @FXML
    private void atr_valor1_6(ActionEvent event) {
        valor1(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_valor2_6(ActionEvent event) {
        valor2(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_valor3_6(ActionEvent event) {

        valor3(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_valor4_6(ActionEvent event) {
        valor4(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_valor5_6(ActionEvent event) {
        valor5(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_valor6_6(ActionEvent event) {
        valor6(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_valor7_6(ActionEvent event) {
        valor7(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_valor8_6(ActionEvent event) {
        valor8(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_valor9_6(ActionEvent event) {
        valor9(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_valor10_6(ActionEvent event) {
        valor10(mentales, 0, RV_atr_6, atr_valor1_6, atr_valor2_6, atr_valor3_6, atr_valor4_6, atr_valor5_6, atr_valor6_6, atr_valor7_6, atr_valor8_6, atr_valor9_6, atr_valor10_6);
        ;
    }

    @FXML
    private void atr_d_6(ActionEvent event) {
     boton_atr(mentales, 0, atr_area);
    }

    @FXML
    private void atr_valor1_7(ActionEvent event) {
        valor1(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_valor2_7(ActionEvent event) {
        valor2(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_valor3_7(ActionEvent event) {
        valor3(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_valor4_7(ActionEvent event) {
        valor4(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_valor5_7(ActionEvent event) {
        valor5(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_valor6_7(ActionEvent event) {
        valor6(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_valor7_7(ActionEvent event) {
        valor7(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_valor8_7(ActionEvent event) {
        valor8(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_valor9_7(ActionEvent event) {
        valor9(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_valor10_7(ActionEvent event) {
        valor10(mentales, 1, RV_atr_7, atr_valor1_7, atr_valor2_7, atr_valor3_7, atr_valor4_7, atr_valor5_7, atr_valor6_7, atr_valor7_7, atr_valor8_7, atr_valor9_7, atr_valor10_7);
        ;
    }

    @FXML
    private void atr_d_7(ActionEvent event) {
        boton_atr(mentales, 1, atr_area);
    }

    @FXML
    private void atr_valor1_8(ActionEvent event) {
        valor1(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_valor2_8(ActionEvent event) {
        valor2(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_valor3_8(ActionEvent event) {
        valor3(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_valor4_8(ActionEvent event) {
        valor4(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_valor5_8(ActionEvent event) {
        valor5(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_valor6_8(ActionEvent event) {
        valor6(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_valor7_8(ActionEvent event) {
        valor7(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_valor8_8(ActionEvent event) {
        valor8(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_valor9_8(ActionEvent event) {
        valor9(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_valor10_8(ActionEvent event) {
        valor10(mentales, 2, RV_atr_8, atr_valor1_8, atr_valor2_8, atr_valor3_8, atr_valor4_8, atr_valor5_8, atr_valor6_8, atr_valor7_8, atr_valor8_8, atr_valor9_8, atr_valor10_8);
        ;
    }

    @FXML
    private void atr_d_8(ActionEvent event) {
        boton_atr(mentales, 2, atr_area);
    }

    @FXML
    private void atr_valor2_2(ActionEvent event) {
        valor2(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void atr_valor8_2(ActionEvent event) {
        valor8(fisicos, 2, RV_atr_2, atr_valor1_2, atr_valor2_2, atr_valor3_2, atr_valor4_2, atr_valor5_2, atr_valor6_2, atr_valor7_2, atr_valor8_2, atr_valor9_2, atr_valor10_2);
        ;
    }

    @FXML
    private void hab_d_(ActionEvent event) {
    }

    @FXML
    private void hab_valor1_(ActionEvent event) {
    }

    @FXML
    private void hab_valor2_(ActionEvent event) {
    }

    @FXML
    private void hab_valor3_(ActionEvent event) {
    }

    @FXML
    private void hab_valor4_(ActionEvent event) {
    }

    @FXML
    private void hab_valor5_(ActionEvent event) {
    }

    @FXML
    private void hab_valor6_(ActionEvent event) {
    }

    @FXML
    private void hab_valor7_(ActionEvent event) {
    }

    @FXML
    private void hab_valor8_(ActionEvent event) {
    }

    @FXML
    private void hab_valor9_(ActionEvent event) {
    }

    @FXML
    private void hab_valor10_(ActionEvent event) {
    }

}
