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
class N_Disciplina {
    private String Disciplina, Nombre, Descripcion;
    private int nivel;

    @Override
    public String toString() {
        return Nombre +" {" +Disciplina+" ( "+ nivel + " ) }";
    }
    

    public N_Disciplina(String Disciplina, String Nombre, String Descripcion, int nivel) {
        this.Disciplina = Disciplina;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.nivel = nivel;
    }

    
    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
