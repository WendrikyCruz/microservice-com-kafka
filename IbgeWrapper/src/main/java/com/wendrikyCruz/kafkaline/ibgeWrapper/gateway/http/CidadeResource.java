package com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.http;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.json.CidadeJson;
import com.wendrikyCruz.kafkaline.ibgeWrapper.service.cidade.ConsultarCidadePorCodigoService;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {
	
	@Autowired
	private ConsultarCidadePorCodigoService consultarCidadePorCodigoService;
	
	@GetMapping("/{id}/cidades/")
	public List<CidadeJson> consultar(@PathVariable("id") String estado){
		return consultarCidadePorCodigoService.execute(estado);
	}

}
