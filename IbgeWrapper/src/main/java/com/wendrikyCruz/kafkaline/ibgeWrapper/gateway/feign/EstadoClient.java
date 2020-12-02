package com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.feign;

import java.util.List;

import com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.json.EstadoJson;

import feign.RequestLine;

public interface EstadoClient {
	
	@RequestLine("GET /api/v1/localidades/estados")
	List<EstadoJson> get();
}
