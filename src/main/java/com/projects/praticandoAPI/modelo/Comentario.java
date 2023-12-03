package com.projects.praticandoAPI.modelo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comentario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String mensagem;
	
	public Comentario() {
	}

	public Comentario(String mensagem) {
		super();
		this.mensagem = mensagem;
	}
	
	
	   @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Comentario other = (Comentario) obj;
	        return Objects.equals(id, other.id);
	    }

		

	public long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	

	
	
}
