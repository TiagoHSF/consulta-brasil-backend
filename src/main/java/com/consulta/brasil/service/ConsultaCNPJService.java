package com.consulta.brasil.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consulta.brasil.model.ConsultaCNPJDTO;

/**
 * The component cnpj service
 * 
 * @author Tiago Silva
 * @date 10 de mar. de 2023
 */
@Service
public class ConsultaCNPJService {

    /**
     * Consulta api cnpj
     * 
     * @param digito
     * @param apiConsulta
     * @return
     * @throws Exception
     */
    public ResponseEntity<ConsultaCNPJDTO> consultaAPI(final String cnpj, final String apiConsulta) throws Exception {
        try {
            RestTemplate restTemplate = new RestTemplate();
            if (cnpj.length() > 14)
                throw new Exception("Tamanho do CNPJ inválido!");
            String api = apiConsulta + cnpj;
            ResponseEntity<ConsultaCNPJDTO> response = restTemplate.getForEntity(api + cnpj, ConsultaCNPJDTO.class);
            return ResponseEntity.ok(response.getBody());
        } catch (final Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
