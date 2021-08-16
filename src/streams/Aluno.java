/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

/**
 *
 * @author tiago
 */
public class Aluno {
    final String nome;
    final double nota;
    //final boolean bomComportamento;
    
    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    
    public String toString() {
        return nome+" tem nota "+nota;
    }
    
    
}
