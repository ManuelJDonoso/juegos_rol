/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.sub_modelos;

/**
 *
 * @author donpe
 */
class DSendas {
        private String Nombre;
    private int nivel=0;


    
    public DSendas(String Nombre) {
        this.Nombre = Nombre;
       
    }

    
    @Override
    public String toString() {
        return   Nombre ;
    }

  

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
