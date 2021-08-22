/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

/**
 *
 * @author tiago
 */
public class Produto {

    private String nome;
    public double preco;
    public  double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

//    @Override
//    public String toString() {
//        return "\n"+getNome()+" tem o preço de "+getPreco()+""
//                +" com o desconto de "+getDesconto();
//    }
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
//
//    /**
//     * @return the preco
//     */
//    public double getPreco() {
//        return preco;
//    }
//
//    /**
//     * @param preco the preco to set
//     */
//    public void setPreco(double preco) {
//        this.preco = preco;
//    }
//
//    /**
//     * @return the desconto
//     */
//    public double getDesconto() {
//        return desconto;
//    }
//
//    /**
//     * @param desconto the desconto to set
//     */
//    public void setDesconto(double desconto) {
//        this.desconto = desconto;
//    }
}
