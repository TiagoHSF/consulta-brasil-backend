package com.consulta.brasil.service;

import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    public ResponseEntity<JSONObject> consultaAPI(final String cnpj, final String apiConsulta) throws Exception {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String api = apiConsulta + cnpj;
            ResponseEntity<JSONObject> response = restTemplate.getForEntity(api, JSONObject.class);
            return ResponseEntity.ok(response.getBody());
        } catch (final Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
