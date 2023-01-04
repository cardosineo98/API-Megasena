package com.api.SorteadorNumeros.services;

import com.api.SorteadorNumeros.models.NumerosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class NumerosService {

    @Autowired
    NumerosModel numerosModel;

    Random rndInt = new Random();

    int[] gerados = new int[5];

   public int[] gerarNumeros(){
        for(int i = 0; i<5;i++){
            gerados[i] = rndInt.nextInt(1,61);
        }
        numerosModel.setNumerosSorteados(gerados);
        return numerosModel.getNumerosSorteados();
    }
}
