package com.wendrikyCruz.kafkaline.ibgeWrapper.gateway.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EstadoJson {
	
	private long id;
	private String sigla;
	private String nome;
	private RegiaoJson regiao;
	
	
	
	public EstadoJson(long id, String sigla, String nome, RegiaoJson regiao) {
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
		this.regiao = regiao;
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
	public RegiaoJson getRegiao() {
		return regiao;
	}
	public void setRegiao(RegiaoJson regiao) {
		this.regiao = regiao;
	}
	
	
}
