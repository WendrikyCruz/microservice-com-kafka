package com.wendrikyCruz.kafkaline.ibgeWrapper.service.estado;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.feign.EstadoClient;
import com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.json.EstadoJson;

import feign.Feign;
import feign.gson.GsonDecoder;

@Service
public class ConsultarEstadoService {
	
	public List<EstadoJson> execute() {
		EstadoClient  estadoClient = Feign.builder()
				.decoder(new GsonDecoder())
				.target(EstadoClient.class, "https://servicodados.ibge.gov.br");
				
		return estadoClient.get();
	}
}
