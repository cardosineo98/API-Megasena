package com.api.SorteadorNumeros.Config;

import com.api.SorteadorNumeros.models.NumerosModel;
import com.api.SorteadorNumeros.services.NumerosService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Configuracao {

    @Bean
    public NumerosModel numerosModel () {
        return new NumerosModel();
    }
}
