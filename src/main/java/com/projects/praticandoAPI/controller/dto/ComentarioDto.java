package com.projects.praticandoAPI.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.projects.praticandoAPI.modelo.Comentario;


public class ComentarioDto {

	private Long id;
	private String mensagem;
	
	public ComentarioDto(Comentario comentario) {
		super();
		this.id = comentario.getId();
		this.mensagem = comentario.getMensagem();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}
	
	public static List<ComentarioDto> converter(List<Comentario> comentario) {
		return comentario.stream().map(ComentarioDto::new).collect(Collectors.toList());
	}
}
