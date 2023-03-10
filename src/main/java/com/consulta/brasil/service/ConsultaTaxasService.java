package com.consulta.brasil.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consulta.brasil.model.TaxaDTO;

@Service
public class ConsultaTaxasService {
    
    /**
     * Consulta api taxas
     * @param apiConsulta
     * @return
     * @throws Exception
     */
    public ResponseEntity<TaxaDTO[]> consultaAPI(final String apiConsulta) throws Exception{
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<TaxaDTO[]> response = restTemplate.getForEntity(apiConsulta, TaxaDTO[].class);
           return ResponseEntity.ok(response.getBody());
        } catch (final Exception e){
            throw new Exception(e.getMessage());
        }
    }

     /**
     * Consulta api taxas by sigla
     * @param apiConsulta
     * @return
     * @throws Exception
     */
    public ResponseEntity<TaxaDTO> consultaAPIBySigla(final String sigla, final String apiConsulta) throws Exception{
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<TaxaDTO> response = restTemplate.getForEntity(apiConsulta + sigla, TaxaDTO.class);
           return ResponseEntity.ok(response.getBody());
        } catch (final Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
