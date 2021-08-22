/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author tiago
 */
public class Pares<C extends Number, V> {

    private final Set<Par<C, V>> itens = new LinkedHashSet<>();

    public void adicionar(C chave, V valor) {

        if (chave == null) return;
        
        Par<C, V> novoPar = new Par<C, V>(chave, valor);
        
        if (itens.contains(novoPar)) {
            itens.remove(novoPar);
        }
        
        itens.add(novoPar);
    }
    
    public V getValor(C chave){
        if (chave == null) return null;
        
        Optional<Par<C, V>> parOptional = itens.stream()
                .filter(par -> chave.equals(par.getChave()))
                .findFirst();
        
        return parOptional.isPresent() ? parOptional.get().getValor() : null;
    }
}
