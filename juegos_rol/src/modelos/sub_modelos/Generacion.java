package modelos.sub_modelos;

public class Generacion {
  private String nombre;
  private int rango_maximo,Rerserva_max,PuntoS_turno;

    @Override
    public String toString() {
        return  nombre ;
    }

  
    public Generacion(String nombre, int rango_maximo, int Rerserva_max, int PuntoS_turno) {
        this.nombre = nombre;
        this.rango_maximo = rango_maximo;
        this.Rerserva_max = Rerserva_max;
        this.PuntoS_turno = PuntoS_turno;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRango_maximo() {
        return rango_maximo;
    }

    public void setRango_maximo(int rango_maximo) {
        this.rango_maximo = rango_maximo;
    }

    public int getRerserva_max() {
        return Rerserva_max;
    }

    public void setRerserva_max(int Rerserva_max) {
        this.Rerserva_max = Rerserva_max;
    }

    public int getPuntoS_turno() {
        return PuntoS_turno;
    }

    public void setPuntoS_turno(int PuntoS_turno) {
        this.PuntoS_turno = PuntoS_turno;
    }
   
   
     
}
