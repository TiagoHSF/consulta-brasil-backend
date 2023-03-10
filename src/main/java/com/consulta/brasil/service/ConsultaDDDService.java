package com.consulta.brasil.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consulta.brasil.model.ConsultaDDDDTO;

@Service
public class ConsultaDDDService {

    /**
     * Consulta api ddd
     * @param digito
     * @param apiConsulta
     * @return
     * @throws Exception
     */
    public ConsultaDDDDTO consultaAPI(final Integer digito, final String apiConsulta) throws Exception{
        try {
            RestTemplate restTemplate = new RestTemplate();
            String api = apiConsulta + digito;
            ResponseEntity<ConsultaDDDDTO> response = restTemplate.getForEntity(api, ConsultaDDDDTO.class);
            return response.getBody();
        } catch (final Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
