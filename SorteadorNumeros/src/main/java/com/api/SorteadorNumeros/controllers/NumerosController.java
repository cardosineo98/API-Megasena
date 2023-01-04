package com.api.SorteadorNumeros.controllers;

import com.api.SorteadorNumeros.models.NumerosModel;
import com.api.SorteadorNumeros.services.NumerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/sorteador")
public class NumerosController {

    @Autowired
    NumerosService numerosService;

    @GetMapping
    public ResponseEntity<int[]> getNumeros(){
        return ResponseEntity.status(HttpStatus.OK).body(numerosService.gerarNumeros());
    }
}
