package com.wendrikyCruz.kafkaline.ibgeWrapper.service.cidade;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.feign.CidadeClient;
import com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.json.CidadeJson;

import feign.Feign;
import feign.gson.GsonDecoder;

@Service
public class ConsultarCidadePorCodigoService {
	
	public List<CidadeJson> execute(String estado) {
		
		CidadeClient cidadeClient = Feign.builder()
				.decoder(new GsonDecoder ())
				.target(CidadeClient.class,  "https://servicodados.ibge.gov.br");
		return cidadeClient.get(estado);
	}
}
