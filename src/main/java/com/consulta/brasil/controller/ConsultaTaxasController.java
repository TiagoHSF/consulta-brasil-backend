package com.consulta.brasil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.brasil.service.ConsultaTaxasService;

@RestController
@RequestMapping("taxas")
public class ConsultaTaxasController {

     /** The consulta taxas service */
     @Autowired
     private ConsultaTaxasService consultaTaxasService;
 
     final String apiConsulta = "https://brasilapi.com.br/api/taxas/v1/";
 
    /**
     * Consulta taxas
     * 
     * @return
     */
    @GetMapping("listar")
    public @ResponseBody ResponseEntity<?> consultaTaxas() throws Exception {
        try {
            final var api = this.consultaTaxasService.consultaAPI(apiConsulta);
            return ResponseEntity.ok(api);
        } catch (final Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
