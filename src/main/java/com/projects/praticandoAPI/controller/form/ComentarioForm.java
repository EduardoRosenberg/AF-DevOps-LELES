package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Comentario;
import com.projects.praticandoAPI.repository.ComentarioRepository;


public class ComentarioForm {
	
	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Comentario converter(ComentarioRepository comentarioRepository) {
		
		return new Comentario(mensagem);
	}


}
