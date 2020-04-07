package modelos.sub_modelos;

import javafx.scene.image.Image;

public class Sendas {
   private String Nombre,Apodo,Conciencia_conviccion,AutoControl_Insinto,Porte,Creencias,Etica,Historia,Practicas_actuales,D_seguidores,Seguir_s;
   private int nivel=0;
   private Image Jerarquia;
   
    @Override
    public String toString() {
        return Nombre;
    }

   
   
    public Sendas(String Nombre, String Apodo, String Conciencia_conviccion, String AutoControl_Insinto) {
        this.Nombre = Nombre;
        this.Apodo = Apodo;
        this.Conciencia_conviccion = Conciencia_conviccion;
        this.AutoControl_Insinto = AutoControl_Insinto;
    }

   
   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setDescripcion(String Descripcion) {
        this.Apodo = Descripcion;
    }

    public String getConciencia_conviccion() {
        return Conciencia_conviccion;
    }

    public void setConciencia_conviccion(String Conciencia_conviccion) {
        this.Conciencia_conviccion = Conciencia_conviccion;
    }

    public String getAutoControl_Insinto() {
        return AutoControl_Insinto;
    }

    public void setAutoControl_Insinto(String AutoControl_Insinto) {
        this.AutoControl_Insinto = AutoControl_Insinto;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPorte() {
        return Porte;
    }

    public void setPorte(String Porte) {
        this.Porte = Porte;
    }

    public String getCreencias() {
        return Creencias;
    }

    public void setCreencias(String Creencias) {
        this.Creencias = Creencias;
    }

    public String getEtica() {
        return Etica;
    }

    public void setEtica(String Etica) {
        this.Etica = Etica;
    }

    public String getHistoria() {
        return Historia;
    }

    public void setHistoria(String Historia) {
        this.Historia = Historia;
    }

    public String getPracticas_actuales() {
        return Practicas_actuales;
    }

    public void setPracticas_actuales(String Practicas_actuales) {
        this.Practicas_actuales = Practicas_actuales;
    }

    public String getD_seguidores() {
        return D_seguidores;
    }

    public void setD_seguidores(String D_seguidores) {
        this.D_seguidores = D_seguidores;
    }

    public String getSeguir_s() {
        return Seguir_s;
    }

    public void setSeguir_s(String Seguir_s) {
        this.Seguir_s = Seguir_s;
    }

    public Image getJerarquia() {
        return Jerarquia;
    }

    public void setJerarquia(Image Jerarquia) {
        this.Jerarquia = Jerarquia;
    }
   
   

}
