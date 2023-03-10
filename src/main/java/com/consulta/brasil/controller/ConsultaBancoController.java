package com.consulta.brasil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.brasil.service.ConsultaBancoService;

/**
 * The consulta banco controller
 * 
 * @author Tiago Silva
 * @date 10 de mar. de 2023
 */
@RestController
@RequestMapping("banco")
public class ConsultaBancoController {
    
    @Autowired
    private ConsultaBancoService consultaBancoService;

    final String apiConsulta = "https://brasilapi.com.br/api/banks/v1";

     /**
     * Consulta CNPJ
     * 
     * @param cnpj
     * @return
     */
    @GetMapping("listar")
    public @ResponseBody ResponseEntity<?> consultaCNPJ() throws Exception {
        try {
            final var api = this.consultaBancoService.consultaAPI(apiConsulta);
            return ResponseEntity.ok(api);
        } catch (final Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
