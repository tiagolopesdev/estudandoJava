/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author tiago
 */
public class Caixa<T> {

    private T coisa;

    public void guardar(T coisa) {
        this.coisa = coisa;
    }
    public T abrir(){
        return coisa;
    }
}
