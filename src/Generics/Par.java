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
public class Par<C, V> {

    private C chave;
    private V valor;

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the chave
     */
    public C getChave() {
        return chave;
    }

    /**
     * @param chave the chave to set
     */
    public void setChave(C chave) {
        this.chave = chave;
    }

    /**
     * @return the valor
     */
    public V getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(V valor) {
        this.valor = valor;
    }

}
