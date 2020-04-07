package modelos.sub_modelos;

public class Meritos_Defectos {
    
   private String nombre, descripcion,tipo;
   private int valor;

    public Meritos_Defectos(String tipo,String nombre, String descripcion,  int valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.valor = valor;
    }
   
   

    @Override
    public String toString() {
        return  nombre + " (" + valor + ')';
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
   

}
