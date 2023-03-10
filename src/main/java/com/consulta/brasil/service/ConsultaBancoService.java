package com.consulta.brasil.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consulta.brasil.model.BancoDTO;

/**
 * The component banco service
 * 
 * @author Tiago Silva
 * @date 10 de mar. de 2023
 */
@Service
public class ConsultaBancoService {
    
     /**
     * Consulta api banco
     * 
     * @param apiConsulta
     * @return
     * @throws Exception
     */
    public ResponseEntity<BancoDTO[]> consultaAPI(final String apiConsulta) throws Exception {
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<BancoDTO[]> response = restTemplate.getForEntity(apiConsulta, BancoDTO[].class);
           return ResponseEntity.ok(response.getBody());
        } catch (final Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
