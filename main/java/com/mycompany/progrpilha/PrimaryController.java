package com.mycompany.progrpilha;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    private Pilha<Integer> pCompleta = new Pilha<Integer>();

    @FXML
    private Label campoPilha;
    
    @FXML
    private TextField campoEntrada;
    
    @FXML
    protected void onEmpilharButtonClick() {
        try {
        pCompleta.push(Integer.valueOf(campoEntrada.getText()));
        campoPilha.setText(pCompleta.imprimir());
    }
        catch (PilhaCheiaExcecao falha) {
            System.err.println();
        }
    }
    
    @FXML
    protected void onDesempilharButtonClick() {
        try {
            pCompleta.pop();
            campoPilha.setText(pCompleta.imprimir());
        }
        catch (PilhaVaziaExcecao falha) {
            System.err.println();
        }
    }
}
