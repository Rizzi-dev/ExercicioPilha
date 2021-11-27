package com.mycompany.progrpilha;

import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.control.Alert;

public class Pilha<E> {
    private final int size;
    private int topo;
    private E[] info;

    public Pilha (int tam) {
        if (tam>0)
            size=tam;
        else
            size=50;
        topo=-1;

        info = (E[]) new Object[size];
    }

    public Pilha() {
        this(50);
    }
     public void push (E valor) {
        if (topo == size-1)
            throw new PilhaCheiaExcecao();
        info[++ topo] = valor;
    }

    public E pop() {
        if (topo==-1)
            throw new PilhaVaziaExcecao();
        return info[topo--];
    }

    public String imprimir() {
        ArrayList aList = new ArrayList();

        int i;
        String aux = "";
        for(i=0;i<topo+1;i++){
            aList.add(info[i]);
        }
        Collections.reverse(aList);
        for(i=0;i<aList.size();i++){
            aux += aList.get(i) + "\n";
        }
        return aux;
    }
}

class PilhaCheiaExcecao extends RuntimeException {
    public PilhaCheiaExcecao(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERRO!!");
        alert.setHeaderText("PILHA CHEIA!!");
        alert.showAndWait();
    }
}
    
class PilhaVaziaExcecao extends RuntimeException {
    public PilhaVaziaExcecao(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERRO!");
        alert.setHeaderText("PILHA VAZIA!!!");
        alert.showAndWait();
    }
    
}

