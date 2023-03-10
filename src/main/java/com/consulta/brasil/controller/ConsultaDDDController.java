package com.consulta.brasil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.brasil.service.ConsultaDDDService;

/**
 * The class teste controller
 * 
 * @author Tiago Silva
 * @date 10 de mar. de 2023
 */
@RestController
@RequestMapping("ddd/")
public class ConsultaDDDController {

    /** The consulta ddd service */
    @Autowired
    private ConsultaDDDService consultaDDDService;

    final String apiConsulta = "https://brasilapi.com.br/api/ddd/v1/";

    /**
     * Consulta DDD
     * 
     * @param digito
     * @return
     */
    @GetMapping("{digito}")
    public @ResponseBody ResponseEntity<?> consultaDDD(
            @PathVariable(name = "digito", required = true) final Integer digito) throws Exception {
        try {
            final var api = this.consultaDDDService.consultaAPI(digito, apiConsulta);
            return ResponseEntity.ok(api);
        } catch (final Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
