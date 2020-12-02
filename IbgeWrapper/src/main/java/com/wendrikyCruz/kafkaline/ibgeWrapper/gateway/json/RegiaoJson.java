package com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegiaoJson {
	private long id;
	private String sigla;
	private String nome;
	
	public RegiaoJson(long id, String sigla, String nome) {
		
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
}
