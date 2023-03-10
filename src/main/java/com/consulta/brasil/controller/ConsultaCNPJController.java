package com.consulta.brasil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.brasil.service.ConsultaCNPJService;

/**
 * The class teste controller
 * 
 * @author Tiago Silva
 * @date 10 de mar. de 2023
 */
@RestController
@RequestMapping("cnpj")
public class ConsultaCNPJController {
    
    @Autowired
    private ConsultaCNPJService consultaCNPJService;

    final String apiConsulta = "https://brasilapi.com.br/api/cnpj/v1/";

     /**
     * Consulta CNPJ
     * 
     * @param cnpj
     * @return
     */
    @GetMapping("{cnpj}")
    public @ResponseBody ResponseEntity<?> consultaCNPJ(
            @PathVariable(name = "cnpj", required = true) final String cnpj) throws Exception {
        try {
            final var api = this.consultaCNPJService.consultaAPI(cnpj, apiConsulta);
            return ResponseEntity.ok(api);
        } catch (final Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
