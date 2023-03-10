package com.consulta.brasil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.brasil.service.TesteService;

/**
 * The class teste controller
 * 
 * @author Tiago Silva
 * @date 10 de mar. de 2023
 */
@RestController
@RequestMapping("teste/")
public class TesteController {
    
    /** The teste service */
    @Autowired
    private TesteService testeService;

    /**
     * Ping
     * @return
     */
    @GetMapping("ping")
    public @ResponseBody ResponseEntity<?> ping(){
        final var api = this.testeService.pong();
        return ResponseEntity.ok(api);
    }

}
