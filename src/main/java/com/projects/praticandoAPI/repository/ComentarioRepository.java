package com.projects.praticandoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.praticandoAPI.modelo.Comentario;
import com.projects.praticandoAPI.modelo.Curso;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
