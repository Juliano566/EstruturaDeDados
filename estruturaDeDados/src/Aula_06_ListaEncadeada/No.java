/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_ListaEncadeada;

/**
 *
 * @author Juliano
 */
public class No {

    private int elemento;
    private No prox;

    //Cria um nó
    public No(int elemento, No prox) {
        this.elemento = elemento;
        this.prox = prox;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", prox=" + prox + '}';
    }

}
