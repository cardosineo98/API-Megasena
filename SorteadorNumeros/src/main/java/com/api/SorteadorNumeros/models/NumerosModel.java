package com.api.SorteadorNumeros.models;

import java.util.ArrayList;
import java.util.Random;

public class NumerosModel {

    int numero;

    int[] numerosSorteados = new int[5];

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int[] getNumerosSorteados() {
        return numerosSorteados;
    }
    public void setNumerosSorteados(int[] numerosSorteados) {
        this.numerosSorteados = numerosSorteados;
    }

}
