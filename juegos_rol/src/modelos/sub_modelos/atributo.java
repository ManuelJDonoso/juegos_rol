package modelos.sub_modelos;

import java.util.ArrayList;

public class atributo {

    private int valor = 1;
    private String nombre, descripcion;
    private ArrayList<String> especialidad=new ArrayList<String>();

    public void addEspecialidad(String especialidad){
        this.especialidad.add(especialidad);
    }
    public ArrayList<String> getEspecialidades(){
        
        return especialidad;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public atributo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
