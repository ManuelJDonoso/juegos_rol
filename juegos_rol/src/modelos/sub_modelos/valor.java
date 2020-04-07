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
public class valor {
    private int valor;
    private String  Tvalor;

    public valor(int valor, String Tvalor) {
        this.valor = valor;
        this.Tvalor = Tvalor;
    }

    
    @Override
    public String toString() {
        return Tvalor  ;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTvalor() {
        return Tvalor;
    }

    public void setTvalor(String Tvalor) {
        this.Tvalor = Tvalor;
    }
    
}
