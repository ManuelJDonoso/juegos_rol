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
class Disciplina {
    private String Nombre;
    private int nivel=0;
    private boolean senda;

    public Disciplina(String Nombre, boolean senda) {
        this.Nombre = Nombre;
        this.senda = senda;
    }

    
    public Disciplina(String Nombre) {
        this.Nombre = Nombre;
        senda=false;
    }

    
    @Override
    public String toString() {
        return   Nombre ;
    }

    public boolean isSenda() {
        return senda;
    }

    public void setSenda(boolean senda) {
        this.senda = senda;
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
