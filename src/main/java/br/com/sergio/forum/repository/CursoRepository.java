package br.com.sergio.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergio.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);
}
