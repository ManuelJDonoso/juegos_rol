package modelos.sub_modelos;

import java.util.ArrayList;
import javafx.scene.image.Image;

public class Clan {
   private String nombre,descripcion,apodo,secta,secta_des,refugio,trasfondo,creacion,debilidad,organizacion,apariencia;
   private ArrayList<String> disciplinas=new ArrayList<String>();
   private Image insignia;
    public Clan() {
    }

    public Image getInsignia() {
        return insignia;
    }

    public void setInsignia(Image insignia) {
        this.insignia = insignia;
    }


   
   public void addDisciplina(String disciplina){
       disciplinas.add(disciplina);
   }
   public String getDisciplina(int i){
  
       return disciplinas.get(i);
   }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getSecta() {
        return secta;
    }

    public void setSecta(String secta) {
        this.secta = secta;
    }

    public String getSecta_des() {
        return secta_des;
    }

    public void setSecta_des(String secta_des) {
        this.secta_des = secta_des;
    }

    public String getRefugio() {
        return refugio;
    }

    public void setRefugio(String refugio) {
        this.refugio = refugio;
    }

    public String getTrasfondo() {
        return trasfondo;
    }

    public void setTrasfondo(String trasfondo) {
        this.trasfondo = trasfondo;
    }

    public String getCreacion() {
        return creacion;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

 public String toString(){
     return nombre;
    }    

}
